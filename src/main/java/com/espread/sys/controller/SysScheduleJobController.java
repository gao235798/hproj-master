package com.espread.sys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.quartz.CronExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.espread.common.web.controller.BaseController;
import com.espread.sys.model.SysScheduleJob;
import com.espread.sys.service.SysScheduleJobService;

/**
 * 定时任务 controller
 *
 * @author itdragons 2016-11-6 14:28:33
 */
@Controller
@RequestMapping("/sysScheduleJob")
public class SysScheduleJobController extends BaseController {

    @Autowired
    private SysScheduleJobService sysScheduleJobService;

    /**
     * cron表达式生成页
     */
    @RequestMapping("quartzCron")
    public String quartzCronCreate() {
        return "sys/sysScheduleJobCron";
    }

    /**
     * 默认页面
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String list() {
        return "sys/sysScheduleJob";
    }

    /**
     * 获取定时任务 json
     */
    @RequestMapping("json")
    @ResponseBody
    public Map<String, Object> getAllJobs(Model model) {
        List<SysScheduleJob> scheduleJobs = sysScheduleJobService.getAllScheduleJob();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", scheduleJobs);
        map.put("total", scheduleJobs.size());
        return map;
    }

    /**
     * 获取正在运行的定时任务
     */
    @RequestMapping("running/json")
    @ResponseBody
    public Map<String, Object> getAllJobsRun(Model model) {
        List<SysScheduleJob> scheduleJobs = sysScheduleJobService.getAllRuningScheduleJob();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", scheduleJobs);
        map.put("total", scheduleJobs.size());
        return map;
    }

    /**
     * 添加跳转
     *
     * @param model
     */
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String createForm() {
        return "sys/sysScheduleJobAdd";
    }

    /**
     * 添加
     *
     * @param user
     * @param model
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public Object create(SysScheduleJob sysScheduleJob) {
        sysScheduleJob.setStatus("1");
        sysScheduleJobService.add(sysScheduleJob);
        return resultSuccess("添加成功");
    }

    /**
     * 编辑任务页
     *
     * @param model
     * @param job
     * @return
     */
    @RequestMapping("/editPage")
    public String editPage(Model model, SysScheduleJob job) {
        model.addAttribute("sysScheduleJob", job);
        return "sys/sysScheduleJobEdit";
    }

    /**
     * 修改表达式
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(String name, String group, String cronExpression) {
        //验证cron表达式
        if (CronExpression.isValidExpression(cronExpression)) {
            sysScheduleJobService.modifyTrigger(name, group, cronExpression);
            return resultSuccess("修改成功");
        } else {
            return resultFail("Cron表达式不正确");
        }
    }

    /**
     * 删除任务
     */
    @RequestMapping("/{name}/{group}/delete")
    @ResponseBody
    public Object delete(@PathVariable String name, @PathVariable String group) {
        sysScheduleJobService.delJob(name, group);
        return resultSuccess("删除成功");
    }

    /**
     * 立即运行一次
     */
    @RequestMapping("/{name}/{group}/startNow")
    @ResponseBody
    public Object stratNow(@PathVariable String name, @PathVariable String group) {
        sysScheduleJobService.startNowJob(name, group);
        return resultSuccess("执行成功");
    }

    /**
     * 暂停任务
     */
    @RequestMapping("/{name}/{group}/stop")
    @ResponseBody
    public Object stop(@PathVariable String name, @PathVariable String group) {
        sysScheduleJobService.stopJob(name, group);
        return resultSuccess("暂停成功");
    }

    /**
     * 恢复
     */
    @RequestMapping("/{name}/{group}/resume")
    @ResponseBody
    public Object resume(@PathVariable String name, @PathVariable String group) {
        sysScheduleJobService.restartJob(name, group);
        return resultSuccess("恢复成功");
    }

    /**
     * 获取所有trigger
     */
    public void getTriggers(HttpServletRequest request) {
        List<SysScheduleJob> scheduleJobs = sysScheduleJobService.getTriggersInfo();
        System.out.println(scheduleJobs.size());
        request.setAttribute("triggers", scheduleJobs);
    }


}
