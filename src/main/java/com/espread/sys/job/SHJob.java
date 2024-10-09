package com.espread.sys.job;

import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.model.TransVouch;
import com.espread.sys.service.EhrToLesXml;
import com.espread.sys.service.InventoryService;

import com.espread.sys.service.SysQtrzLogService;

/**
 * 定时任务工作类
 * 
 * @author ww 2018-12-20 20:54:06
 *
 */
@DisallowConcurrentExecution
public class SHJob implements Job {

	private static Logger LOGGER = LoggerFactory.getLogger(SHJob.class);


	
	public void execute(JobExecutionContext jobContext) throws JobExecutionException {

		LOGGER.error("审核接口job开始---------------------------------");
		InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
		
		//les 审核
		List list = inventoryService.selectByALLSH();
		EhrToLesXml ehrToLesXml = ApplicationContextHelper.getBean(EhrToLesXml.class);
		SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
		for (int i = 0; i < list.size(); i++) {
			TransVouch transVouch = (TransVouch) list.get(i);// 获取每一个Example对象
			SysQrtzLog sysQrtzLog = ehrToLesXml.toSH(transVouch);
			sysQtrzLogService.save(sysQrtzLog);
		}

		LOGGER.error("审核接口job结束----------------------------------");

	}

}
