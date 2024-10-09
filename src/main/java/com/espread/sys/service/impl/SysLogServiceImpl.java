package com.espread.sys.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.espread.common.mapper.JsonMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espread.common.shiro.ShiroUser;
import com.espread.common.utils.IPUtil;
import com.espread.common.utils.PageHelperUtils;
import com.espread.common.web.PageInfo;
import com.espread.common.web.service.BaseServiceImpl;
import com.espread.sys.mapper.SysLogMapper;
import com.espread.sys.model.SysLog;
import com.espread.sys.service.SysLogService;

import eu.bitwalker.useragentutils.UserAgent;

@Service
public class SysLogServiceImpl extends BaseServiceImpl<SysLog> implements SysLogService {

    private static Logger LOGGER = LoggerFactory.getLogger(SysLogServiceImpl.class);

    @Autowired
    private SysLogMapper sysLogMapper;


    @Override
    public List findDataGrid(PageInfo pageInfo, Map<String, Object> condition) {
        PageHelperUtils.startPage(pageInfo);
        return sysLogMapper.findLogPageCondition(pageInfo,condition);
    }


    /**
     * 保存日志
     * @param request
     * @param log
     */
    @Override
    public void save(HttpServletRequest request, Boolean saveParament, SysLog log) {
    	
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        String os=userAgent.getOperatingSystem().getName();	//获取客户端操作系统
        String browser=userAgent.getBrowser().getName();	//获取客户端浏览器
        String operationCode=StringUtils.substringAfter(request.getRequestURI(),request.getContextPath());	//操作代号
		String requestParam=(new JsonMapper()).toJson(request.getParameterMap());	//请求参数
        SysLog sysLog =  new SysLog(log.getLogType(),log.getDescription());
        sysLog.setCreateDate(log.getCreateDate() != null ? log.getCreateDate() : new Date());
        sysLog.setOperateCode(operationCode);
      
        if (saveParament){
            sysLog.setRequestParam(requestParam);
        }
        ShiroUser shiroUser = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
       
        if(shiroUser != null){
            sysLog.setUserId(shiroUser.getUserId());
            sysLog.setLoginName(shiroUser.getUserName());
        } else {    //未登录
            sysLog.setLoginName(log.getLoginName());
        }
        sysLog.setOs(os);
        sysLog.setBrowser(browser);
       
        String ip = IPUtil.getIpAddress(request);
      
        sysLog.setIp(ip);
        long startTime = System.currentTimeMillis(); // 获取开始时间
		System.out.println("startTime:" + startTime);
        try {
            sysLog.setMac(IPUtil.getMACAddress(ip));
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        long endTime = System.currentTimeMillis(); // 获取开始时间
    	System.out.println("endTime:" + endTime);
        super.save(sysLog);
    }
    
    @Override
	public void save(HttpServletRequest request, SysLog sysLog) {
		this.save(request, true, sysLog);
	}

}
