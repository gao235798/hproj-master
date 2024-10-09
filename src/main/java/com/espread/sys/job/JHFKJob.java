package com.espread.sys.job;

import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.espread.sys.model.MomOrderdetail;
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
public class JHFKJob implements Job {

	private static Logger LOGGER = LoggerFactory.getLogger(JHFKJob.class);

	// 整车物料主数据同步接口
	public void execute(JobExecutionContext jobContext) throws JobExecutionException {

		LOGGER.error("排产计划反馈接口job开始---------------------------------");
		InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
		List list = inventoryService.selectByALLJHFK();
		EhrToDmsXml ehrToDmsXml = ApplicationContextHelper.getBean(EhrToDmsXml.class);
		SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
		for (int i = 0; i < list.size(); i++) 
		{
			MomOrderdetail momOrderdetail = (MomOrderdetail) list.get(i);// 获取每一个Example对象
			SysQrtzLog sysQrtzLog = ehrToDmsXml.toJHFK(momOrderdetail);
			sysQtrzLogService.save(sysQrtzLog);
		}

		LOGGER.error("排产计划反馈接口job结束----------------------------------");
		
		

	}

}
