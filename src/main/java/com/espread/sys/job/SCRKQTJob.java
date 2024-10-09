package com.espread.sys.job;

import com.espread.sys.job.SCRKQTJob;
import com.espread.sys.model.Rdrecord08;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.service.EhrToDmsXml;
import com.espread.sys.service.InventoryService;
import com.espread.sys.service.SysQtrzLogService;
import java.util.List;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisallowConcurrentExecution
public class SCRKQTJob implements Job {
    private static Logger LOGGER = LoggerFactory.getLogger(SCRKQTJob.class);

    public void execute(JobExecutionContext jobContext) throws JobExecutionException {
        LOGGER.error("车辆销司入库（其他）接口job开始---------------------------------");
        InventoryService inventoryService = (InventoryService)ApplicationContextHelper.getBean(InventoryService.class);
        List<Rdrecord08> list = inventoryService.selectBySCRKQT();
        EhrToDmsXml ehrToDmsXml = (EhrToDmsXml)ApplicationContextHelper.getBean(EhrToDmsXml.class);
        SysQtrzLogService sysQtrzLogService = (SysQtrzLogService)ApplicationContextHelper.getBean(SysQtrzLogService.class);
        for (int i = 0; i < list.size(); i++) {
            Rdrecord08 rdRecord08 = list.get(i);
            SysQrtzLog sysQrtzLog = ehrToDmsXml.toSCRKQT(rdRecord08);
            sysQtrzLogService.save(sysQrtzLog);
        }
        LOGGER.error("车辆销司入库（其他）接口job结束----------------------------------");
    }
}
