package com.espread.sys.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.espread.sys.model.SysScheduleJob;

/**
 * 定时任务工作类
 * @author itdragons 2016-12-07 20:54:06
 * @DisallowConcurrentExecution  同步执行
 *
 */
@DisallowConcurrentExecution  
public class TaskTestjob implements Job {
	 
    public void execute(JobExecutionContext context) throws JobExecutionException {
        SysScheduleJob scheduleJob = (SysScheduleJob)context.getMergedJobDataMap().get("scheduleJob");
       
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");    
	    System.out.println("执行定时任务sdfasdfadfadsf[" + scheduleJob.getName() + "]:" + dateFormat.format(new Date())); 
	    try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
	    System.out.println("执行定时任务sd[" + scheduleJob.getName() + "]:" + dateFormat.format(new Date())); 
    }
}
