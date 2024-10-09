package com.espread.sys.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.matchers.GroupMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espread.common.exception.ServiceException;
import com.espread.sys.model.SysScheduleJob;
import com.espread.sys.service.SysScheduleJobService;

@Service
public class SysScheduleJobServiceImpl implements SysScheduleJobService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SysScheduleJobServiceImpl.class);

	@Autowired
	private Scheduler scheduler;
	
	@Override
	public List<SysScheduleJob> getAllScheduleJob() {
		
		List<SysScheduleJob> scheduleJobList=new ArrayList<SysScheduleJob>();;
		GroupMatcher<JobKey> matcher = GroupMatcher.anyJobGroup();
		try {
			Set<JobKey> jobKeys = scheduler.getJobKeys(matcher);
			for (JobKey jobKey : jobKeys) {
			    List<? extends Trigger> triggers = scheduler.getTriggersOfJob(jobKey);
			    for (Trigger trigger : triggers) {
			    	SysScheduleJob scheduleJob = new SysScheduleJob();
			        scheduleJob.setName(jobKey.getName());
			        scheduleJob.setGroup(jobKey.getGroup());
			        Trigger.TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());
			        scheduleJob.setStatus(triggerState.name());
			        //获取要执行的定时任务类名
			        JobDetail jobDetail = scheduler.getJobDetail(jobKey);
				    scheduleJob.setClassName(jobDetail.getJobClass().getName());
				    //判断trigger
				    if (trigger instanceof SimpleTrigger) {
						SimpleTrigger simple = (SimpleTrigger) trigger;
						scheduleJob.setCronExpression("重复次数:" + (simple.getRepeatCount() == -1 ? 
								"无限" : simple.getRepeatCount()) + ",重复间隔:" + (simple.getRepeatInterval()/1000L));
						scheduleJob.setDescription(simple.getDescription());
					}
					if (trigger instanceof CronTrigger) {
						CronTrigger cron = (CronTrigger) trigger;
						scheduleJob.setCronExpression(cron.getCronExpression());
						scheduleJob.setDescription(cron.getDescription() == null ? ("触发器:" + trigger.getKey()) : cron.getDescription());
					}
			        scheduleJobList.add(scheduleJob);
			    }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return scheduleJobList;
	}

	@Override
	public List<SysScheduleJob> getAllRuningScheduleJob() {
		List<SysScheduleJob> scheduleJobList=null;
		try {
			List<JobExecutionContext> executingJobs = scheduler.getCurrentlyExecutingJobs();
			scheduleJobList = new ArrayList<SysScheduleJob>(executingJobs.size());
			for (JobExecutionContext executingJob : executingJobs) {
				SysScheduleJob scheduleJob = new SysScheduleJob();
			    JobDetail jobDetail = executingJob.getJobDetail();
			    JobKey jobKey = jobDetail.getKey();
			    Trigger trigger = executingJob.getTrigger();
			    scheduleJob.setName(jobKey.getName());
			    scheduleJob.setGroup(jobKey.getGroup());
			    //scheduleJob.setDescription("触发器:" + trigger.getKey());
			    Trigger.TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());
			    scheduleJob.setStatus(triggerState.name());
			    //获取要执行的定时任务类名
			    scheduleJob.setClassName(jobDetail.getJobClass().getName());
			    //判断trigger
			    if (trigger instanceof SimpleTrigger) {
					SimpleTrigger simple = (SimpleTrigger) trigger;
					scheduleJob.setCronExpression("重复次数:" + (simple.getRepeatCount() == -1 ? 
							"无限" : simple.getRepeatCount()) + ",重复间隔:" + (simple.getRepeatInterval()/1000L));
					scheduleJob.setDescription(simple.getDescription());
				}
				if (trigger instanceof CronTrigger) {
					CronTrigger cron = (CronTrigger) trigger;
					scheduleJob.setCronExpression(cron.getCronExpression());
					scheduleJob.setDescription(cron.getDescription());
				}
			    scheduleJobList.add(scheduleJob);
			}
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		return scheduleJobList;
	}

	@Override
	public void add(SysScheduleJob sysScheduleJob) {
		Class job = null;
		try {
		     String a = sysScheduleJob.getClassName();
			job = Class.forName(sysScheduleJob.getClassName());
		} catch (ClassNotFoundException e) {
			throw new ServiceException("任务类没找到");
		}
		@SuppressWarnings("unchecked")
		JobDetail jobDetail = JobBuilder.newJob(job).withIdentity(sysScheduleJob.getName(), sysScheduleJob.getGroup()).build();
		jobDetail.getJobDataMap().put("scheduleJob", sysScheduleJob);
 
		//表达式调度构建器（可判断创建SimpleScheduleBuilder）
		CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(sysScheduleJob.getCronExpression());
		
		//按新的cronExpression表达式构建一个新的trigger
		CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(sysScheduleJob.getName(), sysScheduleJob.getGroup()).withSchedule(scheduleBuilder).build();
		try {
			scheduler.scheduleJob(jobDetail, trigger);
			LOGGER.info("定时任务添加成功");
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void modifyTrigger(String name, String group, String cronExpression) {
		try {  
            TriggerKey key = TriggerKey.triggerKey(name, group);  
            //Trigger trigger = scheduler.getTrigger(key);  
              
            CronTrigger newTrigger = (CronTrigger) TriggerBuilder.newTrigger()  
                    .withIdentity(key)  
                    .withSchedule(CronScheduleBuilder.cronSchedule(cronExpression))  
                    .build();  
            scheduler.rescheduleJob(key, newTrigger);  
        } catch (SchedulerException e) {  
            e.printStackTrace();  
        }  
	}

	@Override
	public void delJob(String name, String group) {
		JobKey key = new JobKey(name,group);
		try {
			scheduler.deleteJob(key);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void startNowJob(String name, String group) {
		JobKey jobKey = JobKey.jobKey(name, group);
		try {
			scheduler.triggerJob(jobKey);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stopJob(String name, String group) {
		JobKey key = new JobKey(name, group);
		try {
			scheduler.pauseJob(key);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void restartJob(String name, String group) {
		JobKey key = new JobKey(name,group);
		try {
			scheduler.resumeJob(key);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<SysScheduleJob> getTriggersInfo() {
		try {
			GroupMatcher<TriggerKey> matcher = GroupMatcher.anyTriggerGroup();
			Set<TriggerKey> Keys = scheduler.getTriggerKeys(matcher);
			List<SysScheduleJob> triggers = new ArrayList<SysScheduleJob>();
			
			for (TriggerKey key : Keys) {
				Trigger trigger = scheduler.getTrigger(key);
				SysScheduleJob scheduleJob = new SysScheduleJob();
				scheduleJob.setName(trigger.getJobKey().getName());
				scheduleJob.setGroup(trigger.getJobKey().getGroup());
				scheduleJob.setStatus(scheduler.getTriggerState(key)+"");
				if (trigger instanceof SimpleTrigger) {
					SimpleTrigger simple = (SimpleTrigger) trigger;
					scheduleJob.setCronExpression("重复次数:"+ (simple.getRepeatCount() == -1 ? 
							"无限" : simple.getRepeatCount()) +",重复间隔:"+(simple.getRepeatInterval()/1000L));
					scheduleJob.setDescription(simple.getDescription());
				}
				if (trigger instanceof CronTrigger) {
					CronTrigger cron = (CronTrigger) trigger;
					scheduleJob.setCronExpression(cron.getCronExpression());
					scheduleJob.setDescription(cron.getDescription());
				}
				triggers.add(scheduleJob);
			}
			return triggers;
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		return null;
	}

}
