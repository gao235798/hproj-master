package com.espread.sys.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.espread.common.web.PageInfo;
import com.espread.common.web.service.BaseService;
import com.espread.sys.model.SysLog;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.model.result.SysUserVo;

/**
 * 日志管理
 *
 * @author itdragons 2016-9-17 14:18:37
 */
public interface SysQtrzLogService extends BaseService<SysQrtzLog> {

    /**
     * 查询日志列表
     * @param pageInfo
     * @param condition
     * @return
     */
    List findDataGrid(PageInfo pageInfo, Map<String, Object> condition);
    
    /**
     * 保存日志
     * @param request
     * @param saveParament 默认保存请求参数
     * @param sysLog
     * @return
     */
    public void save(HttpServletRequest request, SysQrtzLog sysQrtzLog);
    public void save(HttpServletRequest request, Boolean saveParament, SysQrtzLog sysQrtzLog);
    
    void uDanju(String code,String logType);

}
