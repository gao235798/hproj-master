package com.espread.sys.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.service.EhrToDmsXml;
import com.espread.sys.service.InventoryService;

import com.espread.sys.service.SysQtrzLogService;

/**
 * 定时任务工作类
 * 
 * @author ww 2018-12-20 20:54:06
 *
 */
@DisallowConcurrentExecution
public class XCLJob implements Job {

	private static Logger LOGGER = LoggerFactory.getLogger(XCLJob.class);

	// 库存同步接口
	public void execute(JobExecutionContext jobContext) throws JobExecutionException {

		LOGGER.error("库存同步接口job开始---------------------------------");
		InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
		
		EhrToDmsXml ehrToDmsXml = ApplicationContextHelper.getBean(EhrToDmsXml.class);
		SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
		SysQrtzLog sysQrtzLog = ehrToDmsXml.toXCL();
			sysQtrzLogService.save(sysQrtzLog);
		

		LOGGER.error("库存同步接口job结束----------------------------------");
		
	}

}
