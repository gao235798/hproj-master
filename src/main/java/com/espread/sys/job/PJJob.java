package com.espread.sys.job;

import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.espread.sys.model.DMSInventory;
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
public class PJJob implements Job {

	private static Logger LOGGER = LoggerFactory.getLogger(PJJob.class);

	// 配件物料主数据同步接口
	public void execute(JobExecutionContext jobContext) throws JobExecutionException {

		LOGGER.error("配件主数据同步接口job开始---------------------------------");
		InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
	
		EhrToDmsXml ehrToDmsXml = ApplicationContextHelper.getBean(EhrToDmsXml.class);
		SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);

		List listPJ = inventoryService.selectByPJ();
		for (int i = 0; i < listPJ.size(); i++)
		{
			DMSInventory dMSInventory = (DMSInventory) listPJ.get(i);// 获取每一个Example对象
			SysQrtzLog sysQrtzLog = ehrToDmsXml.toPJ(dMSInventory);
			sysQtrzLogService.save(sysQrtzLog);
		}
		
	
		List listPJQT = inventoryService.selectByPJQT();
		for (int i = 0; i < listPJQT.size(); i++) {
			DMSInventory dMSInventory = (DMSInventory) listPJQT.get(i);// 获取每一个Example对象
			SysQrtzLog sysQrtzLog = ehrToDmsXml.toPJQT(dMSInventory);
			sysQtrzLogService.save(sysQrtzLog);
		}
		

		LOGGER.error("配件主数据同步接口job结束----------------------------------");

	}

}
