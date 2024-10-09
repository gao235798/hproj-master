package com.espread.sys.job;

import com.espread.sys.model.POPomain;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.service.EsToJmSapService;
import com.espread.sys.service.InventoryService;
import com.espread.sys.service.SysQtrzLogService;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@DisallowConcurrentExecution
public  class SalesOrderJob implements Job {
    private static Logger LOGGER = LoggerFactory.getLogger(SalesOrderJob.class);
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        LOGGER.error("----B组采购订单写入A组销售订单--------------------------------");
        InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
        SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
        EsToJmSapService esToJmSapService =    ApplicationContextHelper.getBean(EsToJmSapService.class);
        //查询A组采购订单
        List list = inventoryService.selectByALLPOPomainXs();
        for (Object o : list) {
            POPomain pOPomain = (POPomain) o;// 获取每一个采购订单主表信息
            SysQrtzLog sysQrtzLog = esToJmSapService.toSalesOrder(pOPomain);
            sysQtrzLogService.save(sysQrtzLog);
        }
        LOGGER.error("----采购订单同步接口结束----------------------------------");
    }
}
