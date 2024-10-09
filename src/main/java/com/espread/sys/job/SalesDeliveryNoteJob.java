package com.espread.sys.job;

import com.espread.sys.model.DispatchList;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.service.EsToJmSapService;
import com.espread.sys.service.InventoryService;
import com.espread.sys.service.SysQtrzLogService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SalesDeliveryNoteJob implements Job {

    private static Logger LOGGER = LoggerFactory.getLogger(SalesOrderJob.class);
    /**
     *  B组发货单写入A组LES半成品收货单
     * @param jobExecutionContext 定时器
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        LOGGER.error("----B组写入A组LES半成品收货单开始--------------------------------");
        InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
        SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
        EsToJmSapService esToJmSapService =    ApplicationContextHelper.getBean(EsToJmSapService.class);
        List Dispatchlist = inventoryService.selectCheckOrder();
        for (int i = 0; i < Dispatchlist.size(); i++) {
            DispatchList da  = (DispatchList) Dispatchlist.get(i);
            SysQrtzLog sysQrtzLog= esToJmSapService.toPurchaseReceipt(da);
            sysQtrzLogService.save(sysQrtzLog);
        }
        LOGGER.error("----B组写入A组LES半成品收货单结束----------------------------------");
    }
}
