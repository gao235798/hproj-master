package com.espread.sys.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
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
import com.espread.sys.mapper.Base1Mapper;
import com.espread.sys.mapper.SysLogMapper;
import com.espread.sys.mapper.SysQrtzLogMapper;
import com.espread.sys.model.SysLog;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.service.SysLogService;
import com.espread.sys.service.SysQtrzLogService;

import eu.bitwalker.useragentutils.UserAgent;

@Service
public class SysQrtzLogServiceImpl extends BaseServiceImpl<SysQrtzLog> implements SysQtrzLogService {

    private static Logger LOGGER = LoggerFactory.getLogger(SysQrtzLogServiceImpl.class);

    @Autowired
    private SysQrtzLogMapper sysQrtzLogMapper;

    @Autowired
    private Base1Mapper base1Mapper;

    @Override
    @DataSourceChange(Const.DATASOURCE_MASTER)
    public List findDataGrid(PageInfo pageInfo, Map<String, Object> condition) {
        PageHelperUtils.startPage(pageInfo);
        return sysQrtzLogMapper.findLogPageCondition(pageInfo,condition);
    }


    /**
     * 保存日志
     * @param request
     * @param log
     */
    @Override
    public void save(HttpServletRequest request, Boolean saveParament, SysQrtzLog log) {
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
        try {
            sysLog.setMac(IPUtil.getMACAddress(ip));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //super.save(sysLog);
    }
    
    @Override
	public void save(HttpServletRequest request, SysQrtzLog sysQrtzLog) {
		this.save(request, true, sysQrtzLog);
	}
    @Override
  	public int save( SysQrtzLog sysQrtzLog) {
    	return sysQrtzLogMapper.insert(sysQrtzLog);
  	}


  //任务失败手动重发接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)  //切换连接数据库
	public void uDanju(String code, String logType) {
		
		System.out.println(logType +";;;;;;;;;;;;;;;" +code);

		if(logType.equals("43")){ //重发 B组发货单写入A组LES半成品收货单

			uDanju11(code,logType);
		}

		if(logType.equals("42")){ //更新A组采购订单写入B组
			base1Mapper.update(" update PO_Pomain set cDefine17 = null where POID ='"+code+"'");
		}
		
		if(logType.equals("9")){ //更新采购订单
			base1Mapper.update(" update PO_Pomain set cDefine8=''  where cDefine8!='T' and cPOID='"+code+"'");
		}

		if(logType.equals("5")||logType.equals("7")||logType.equals("12")){ //调拨领料单接口 物料退库接口 调拨单审核
			base1Mapper.update(" update TransVouch set cDefine8=''  where cDefine8!='T' and ctvcode='"+code+"'");
		}
		
		if(logType.equals("6")){ //半成品入库接口
			base1Mapper.update(" update Rdrecord10 set cDefine8=''  where cDefine8!='T' and cCode='"+code+"'");
		}
		
		if(logType.equals("11")){ //物料报废接口
			base1Mapper.update(" update rdrecord11 set cDefine8=''  where cDefine8!='T' and cCode ='"+code+"'");
		}
		
		if(logType.equals("10")){ //生产订单BOM下发接口
			
			 String[] sArray=code.split("-");
			base1Mapper.update(" update a set a.Define24=''  from mom_orderdetail a ,mom_order b     where  a.MoId=b.MoId   and  a.Define24!='T' and b.Mocode ='"+sArray[0]+"'  and a.SortSeq ="+sArray[1]+"");
		}
		
		if(logType.equals("13")){ //物料采购订关闭单接口
			base1Mapper.update("  update b "
    	+ " set  b.cDefine24 ='' "
    	+ " from PO_Pomain a, PO_Podetails b  "
    	+ " where a.cPOID='"+code+"'  and a.POID =b.POID   and isnull(b.cbCloser,'') !=''  and isnull(b.cDefine24,'') ='F'   "
    );
		}
		
		if(logType.equals("1")){ //物料接口
			
			
			 base1Mapper.update(" update xzys_ha_Inventory set tstatus='0'  where tstatus!='1' and cInvCode ='"+code+"'");
		}
		
		
		if(logType.equals("31")){ //整车物料主数据同步接口
			
			
			 base1Mapper.update(" update xzys_dms_Inventory set tstatus='0'  where tstatus!='1' and cInvCode ='"+code+"'");
		}
		
		if(logType.equals("32")){ //配件主数据同步接口
			
			
			 base1Mapper.update(" update xzys_dms_Inventory set tstatus='0'  where tstatus!='1' and cInvCode ='"+code+"'");
		}
		
		if(logType.equals("33")){ //物料价格同步接口
			
			
			 base1Mapper.update(" update xzys_dms_Inventory set tstatus='0'  where tstatus!='1' and 1!=1");
		}
		

		if(logType.equals("34")){ //排产计划反馈接口
			 String[] sArray=code.split(":");
			String sql=" update  a set a.Define25 ='' from  mom_orderdetail a  inner join mom_order  f on f.MoId=a.moid inner join mom_morder h on h.MoDId=a.MoDId inner join bas_part j 	on a.PartId=j.partid "
					+" inner join inventory k on k.cInvCode=j.InvCode"
					+" where   a.Status in('2','3','4')  and isnull(a.Define25 ,'') !='T'   AND a.SoCode ='"+sArray[0]+"' and  k.cinvcode ='"+sArray[1]+"'";
			 base1Mapper.update(sql);
		}
		if(logType.equals("35")){ //车辆销司入库接口
			
			
			 base1Mapper.update(" update rdrecord10 set cDefine8=''  where cDefine8!='T' and cCode ='"+code+"'");
		}
		
		if(logType.equals("41")){ //车辆销司入库（采购）接口
			
			
			 base1Mapper.update(" update rdrecord01 set cDefine8=''  where cDefine8!='T' and cCode ='"+code+"'");
		}
		
		
		if(logType.equals("36")){ //车辆销售开票接口
			
			
			 base1Mapper.update(" update SaleBillVouch set cDefine8=''  where cDefine8!='T' and cSBVCode ='"+code+"'");
		}
		if(logType.equals("37")){ //库存校验信息反馈接口
			
			
			 base1Mapper.update(" update SO_SOMain set cDefine8=''  where cDefine8!='T' and cSOCode ='"+code+"'");
		}
		
		if(logType.equals("38")){ //配件出库单接口
			
			 base1Mapper.update(" update Rdrecord32 set cDefine8=''  where cDefine8!='T' and cCode ='"+code+"'");
		}
		
		if(logType.equals("46")){ //存货档案接口
			
			 base1Mapper.update(" update xzys_ch_Inventory set tstatus='0'  where tstatus!='1' and cInvCode ='"+code+"'");
		}
		
		if(logType.equals("47")){ //库存校验信息反馈接口
			
			 boolean status = code.contains("+");
			 if(!status) {
				 
				 base1Mapper.update(" update SO_SODetails set cdefine25=''  where cdefine25='f' and id ='"+code+"'");
				 // base1Mapper.update(" update SO_SODetails set cdefine25=''  where cdefine25!='f' and autoid ='"+code+"'");
				 base1Mapper.update(" update SO_SOMain set  cCloser = '', dclosedate ='', dclosesystime ='' where id = '"+code+"'");
			 }
			
		}
		
	}

	@DataSourceChange(Const.DATASOURCE_SLAVE01)
	private  void uDanju11(String code, String logType)
	{
		if(logType.equals("43")){ //重发 B组发货单写入A组LES半成品收货单

			base1Mapper.update(" update DispatchList set cDefine17 = null where cDLCode = '"+code+"'");
		}
	}

}
