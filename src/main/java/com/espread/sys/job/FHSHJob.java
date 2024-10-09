package com.espread.sys.job;

import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.espread.sys.model.DispatchList;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.service.EhrToDmsXml;
import com.espread.sys.service.InventoryService;

import com.espread.sys.service.SysQtrzLogService;

/**
 * 定时任务工作类
 *
 * @author ww 2018-12-20 20:54:06
 */
@DisallowConcurrentExecution
public class FHSHJob implements Job {

    private static Logger LOGGER = LoggerFactory.getLogger(FHSHJob.class);


    public void execute(JobExecutionContext jobContext) throws JobExecutionException {

        LOGGER.error("dms审核接口job开始---------------------------------");
        InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
        List list = inventoryService.selectByALLFHSH();
        EhrToDmsXml ehrToDmsXml = ApplicationContextHelper.getBean(EhrToDmsXml.class);
        SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
        for (int i = 0; i < list.size(); i++) {
            DispatchList dispatchList = (DispatchList) list.get(i);// 获取每一个Example对象
            SysQrtzLog sysQrtzLog = ehrToDmsXml.toFHSH(dispatchList);
            sysQtrzLogService.save(sysQrtzLog);
        }

        LOGGER.error("dms审核接口job结束----------------------------------");

    }

}
