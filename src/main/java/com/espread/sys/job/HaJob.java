package com.espread.sys.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.espread.sys.service.HaService;


public class HaJob implements Job {
    private static Logger LOGGER = LoggerFactory.getLogger(HaJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        LOGGER.debug("同步库存接口job开始---------------------------------");
        HaService haService = (HaService) ApplicationContextHelper.getBean(HaService.class);
        haService.uploadAllInvenroty();
        LOGGER.debug("同步库存接口job结束---------------------------------");
    }

}
