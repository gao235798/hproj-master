package com.espread.sys.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import com.espread.sys.job.ApplicationContextHelper;

import com.espread.sys.mapper.SysQrtzLogMapper;

import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.model.SysScheduleJob;
import com.espread.sys.model.result.SysQrtzLogVo;

import com.espread.sys.service.SysQtrzLogService;

/**
 * 定时任务工作类
 * 
 * @author itdragons 2016-12-07 20:54:06
 *
 */
@DisallowConcurrentExecution
public class TaskTest implements Job {

    public void execute(JobExecutionContext jobContext) throws JobExecutionException {

        SysScheduleJob scheduleJob = (SysScheduleJob) jobContext.getMergedJobDataMap().get("scheduleJob");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        SysQrtzLog sysLog = new SysQrtzLog("1");
        // sysLog.setLogId(12);
        sysLog.setCodeNo("23423");
        sysLog.setCreateDate(new Date());

        sysLog.setOs("os");
        sysLog.setBrowser("browser");
        // userMapper.insert(sysLog);

        // 获取Spring中的上下文

        SysQtrzLogService sysLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
        sysLogService.save(sysLog);
        SysQrtzLogMapper sysQrtzLogMapper = ApplicationContextHelper.getBean(SysQrtzLogMapper.class);
        List list = sysQrtzLogMapper.findall();

        for (int i = 0; i < list.size(); i++) {
            SysQrtzLogVo sysLog1 = (SysQrtzLogVo) list.get(i);// 获取每一个Example对象
            String name = sysLog1.getLogId().toString();
            System.out.print("第" + i + "个=？" + name);
        }

        //
        // DynamicDataSource dynamicDataSource
        // =ApplicationContextHelper.getBean(DynamicDataSource.class);
        // dynamicDataSource.setDataSource("slave");
        ////
        // PersonService personService
        // =ApplicationContextHelper.getBean(PersonService.class);
        // List list11= personService.gDataGrid("");
        //
        // for(int i=0;i<list11.size();i++){
        // Person person = (Person) list11.get(i);//获取每一个Example对象
        // String name = person.getCpersonname().toString();
        // System.out.println("第"+i+"个=？"+name);
        // }

        // System.out.println("执行定时任务[" + scheduleJob.getName() + "]:" +
        // dateFormat.format(new Date()));
        // String jobId = context.getJobDetail().getDescription();
        // String serviceId = context.getTrigger().getDescription();
        //
        //
        // ApplicationContext applicationContext=null;
        // try {
        // applicationContext=getApplicationContext(context);
        //
        //
        //
        // SysLogService sysLogService= (SysLogService)
        // applicationContext.getBean("sysLogService");
        //
        // // sysLogService= (SysLogService)appCtx.getBean("sysLogService");
        //
        //
        // System.out.println("执行定时任务[" + scheduleJob.getName() + "]:" +
        // dateFormat.format(new Date()));
        // SysLog sysLog = new SysLog("1");
        //
        // sysLog.setOperateCode("23423");
        //
        //
        // sysLog.setOs("os");
        // sysLog.setBrowser("browser");
        //
        //
        //
        // sysLogService.save(sysLog);

    }

}
