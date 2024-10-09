package com.espread.sys.service;

import java.util.List;

import com.espread.sys.model.SysScheduleJob;

/**
 * 系统定时任务 Service
 * @author itdragons 2016-11-20 15:42:14
 * 
 */
public interface SysScheduleJobService {
	
	/**
	 * 获取所有计划中的任务
	 * @return 结果集合
	 */
	public List<SysScheduleJob> getAllScheduleJob();
	
	/**
	 * 获取所有运行中的任务
	 * @return 结果集合
	 */
	public List<SysScheduleJob> getAllRuningScheduleJob();
	
	/**
	 * 添加定时任务
	 * @param sysScheduleJob
	 */
	public void add(SysScheduleJob sysScheduleJob);


	/**
	 * 修改触发器表达式
	 * @param name 任务名
	 * @param group 任务组
	 * @param cronExpression cron表达式
	 */
	public void modifyTrigger(String name, String group, String cronExpression);

	/**
	 * 删除任务
	 * @param name
	 * @param group
	 */
	public void delJob(String name, String group);

	/**
	 * 立即执行任务
	 * @param name
	 * @param group
	 */
	public void startNowJob(String name, String group);

	/**
	 * 暂停任务
	 * @param name
	 * @param group
	 */
	public void stopJob(String name, String group);
	
	/**
	 * 恢复任务
	 * @param name
	 * @param group
	 */
	public void restartJob(String name, String group);

	/**
	 * 获取所有trigger
	 * @return
	 */
	public List<SysScheduleJob> getTriggersInfo();

}
