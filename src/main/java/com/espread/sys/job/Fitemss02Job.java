package com.espread.sys.job;

import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.model.fitemss02;
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
public class Fitemss02Job implements Job {

	private static Logger LOGGER = LoggerFactory.getLogger(Fitemss02Job.class);

	//项目
	public void execute(JobExecutionContext jobContext) throws JobExecutionException {

		LOGGER.error("项目接口job开始---------------------------------");
		InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
		List list = inventoryService.selectByALLFitemss02();
		EhrToLesXml ehrToLesXml = ApplicationContextHelper.getBean(EhrToLesXml.class);
		SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
		for (int i = 0; i < list.size(); i++) {
			fitemss02 fitemss02 = (fitemss02) list.get(i);// 获取每一个Example对象
			SysQrtzLog sysQrtzLog = ehrToLesXml.toFitemss02(fitemss02);
			sysQtrzLogService.save(sysQrtzLog);
		}

		LOGGER.error("项目接口job结束----------------------------------");

	}

}
