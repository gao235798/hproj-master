package com.espread.sys.service;

import com.espread.sys.model.DispatchList;
import com.espread.sys.model.POPomain;
import com.espread.sys.model.SysQrtzLog;

/**
 * @description ERP连接程序，用于企业内部ERP之间的连接
 * @author lingzheng
 * @version 1.0
 * @date 2024-09-24
 */
public interface ERPConnectionService {
    public SysQrtzLog  salesOrderSync(POPomain poPomain);
    public SysQrtzLog  salesOrderDeliverySync(DispatchList dispatchList);
}
