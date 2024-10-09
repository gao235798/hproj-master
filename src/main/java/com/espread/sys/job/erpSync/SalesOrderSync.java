package com.espread.sys.job.erpSync;

import com.espread.sys.job.ApplicationContextHelper;
import com.espread.sys.model.POPomain;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.service.ERPConnectionService;
import com.espread.sys.service.InventoryService;
import com.espread.sys.service.SysQtrzLogService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SalesOrderSync implements Job {

    private static Logger LOGGER = LoggerFactory.getLogger(SalesOrderSync.class);
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        LOGGER.error("----003ERP同步002销售订单--------------------------------");
        InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
        SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
        ERPConnectionService erpConnectionService =    ApplicationContextHelper.getBean(ERPConnectionService.class);
        //根据客户查询销售ERP采购订单
        List list = inventoryService.selectPOPomainByCustomers("001");
        for (Object o : list) {
            POPomain pOPomain = (POPomain) o;// 获取每一个采购订单主表信息
            SysQrtzLog sysQrtzLog = erpConnectionService.salesOrderSync(pOPomain);
            sysQtrzLogService.save(sysQrtzLog);
        }
        LOGGER.error("----销售订单同步接口结束----------------------------------");
    }
}
