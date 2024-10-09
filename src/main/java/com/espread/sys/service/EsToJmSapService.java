package com.espread.sys.service;

import com.espread.sys.model.DispatchList;
import com.espread.sys.model.POPomain;
import com.espread.sys.model.SysQrtzLog;

/**
 * 接口平台对接吉麦SAP接口
 */
public interface EsToJmSapService {

    public SysQrtzLog toSalesOrder(POPomain pOPomain);

    /**
     * 将派工单转换成采购入库单
     *
     * @param da 派工单对象
     * @return 转换后的采购入库单对象
     */
    public SysQrtzLog toPurchaseReceipt(DispatchList da);

}
