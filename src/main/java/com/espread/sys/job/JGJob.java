package com.espread.sys.job;

import java.util.List;

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
public class JGJob implements Job {

	private static Logger LOGGER = LoggerFactory.getLogger(JGJob.class);

	// 物料价格同步接口
	public void execute(JobExecutionContext jobContext) throws JobExecutionException {

		LOGGER.error("物料价格同步接口job开始---------------------------------");
		InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
		List list = inventoryService.selectByJG();
		EhrToDmsXml ehrToDmsXml = ApplicationContextHelper.getBean(EhrToDmsXml.class);
		SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
		
		if(list.size()!=0){
			
			SysQrtzLog sysQrtzLog = ehrToDmsXml.toJG(list);
			sysQtrzLogService.save(sysQrtzLog);
		}
		LOGGER.error("物料价格同步接口job结束----------------------------------");
		
		
	}

}
