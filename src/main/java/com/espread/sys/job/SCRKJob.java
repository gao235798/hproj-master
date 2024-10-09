package com.espread.sys.job;

import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.espread.sys.model.Rdrecord10;
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
public class SCRKJob implements Job {

	private static Logger LOGGER = LoggerFactory.getLogger(SCRKJob.class);

	// 整车物料主数据同步接口
	public void execute(JobExecutionContext jobContext) throws JobExecutionException {

		LOGGER.error("车辆销司入库接口job开始---------------------------------");
		InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
		List list = inventoryService.selectBySCRK();
		EhrToDmsXml ehrToDmsXml = ApplicationContextHelper.getBean(EhrToDmsXml.class);
		SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
		for (int i = 0; i < list.size(); i++) {
			Rdrecord10 rdrecord10 = (Rdrecord10) list.get(i);// 获取每一个Example对象
			SysQrtzLog sysQrtzLog = ehrToDmsXml.toSCRK(rdrecord10);
			sysQtrzLogService.save(sysQrtzLog);
		}

		LOGGER.error("车辆销司入库接口job结束----------------------------------");
		
		

	}

}
