package com.espread.sys.service;

import com.espread.common.utils.ResponseResult;
import com.espread.sys.model.SysQrtzLog;

import java.util.List;
import java.util.Map;


public interface SysServicesServer {

    /**
     * 写入订单
     *
     * @param soHeader
     * @param soItemList
     * @return
     */
    public SysQrtzLog toSaleOrder(Map<String, Object> soHeader, List<Map<String, Object>> soItemList);

    public String SalesOrderReturn(Map<String, Object> soHeader, List<Map<String, Object>> soItemList);
}
