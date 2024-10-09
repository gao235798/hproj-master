package com.espread.sys.service.impl;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.TriggerBuilder;

import com.espread.sys.model.SysScheduleJob;
import com.espread.common.exception.ServiceException;

@ExtendWith(MockitoExtension.class)
public class SysScheduleJobServiceImplTest {

    @Mock
    private Scheduler scheduler;

    @InjectMocks
    private SysScheduleJobServiceImpl sysScheduleJobService;

    private SysScheduleJob sysScheduleJob;

    @BeforeEach
    public void setUp() {
        sysScheduleJob = new SysScheduleJob();
        sysScheduleJob.setName("testJob");
        sysScheduleJob.setGroup("testGroup");
        sysScheduleJob.setClassName("com.espread.sys.service.impl.TestJob");
        sysScheduleJob.setCronExpression("0 0 12 * * ?");
    }

    @Test
    public void testAdd_Success() throws ClassNotFoundException, SchedulerException {
        // Arrange
        JobDetail jobDetail = JobBuilder.newJob(TestJob.class).withIdentity("testJob", "testGroup").build();
        jobDetail.getJobDataMap().put("scheduleJob", sysScheduleJob);

        CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity("testJob", "testGroup").withSchedule(CronScheduleBuilder.cronSchedule(sysScheduleJob.getCronExpression())).build();

        // Act
        sysScheduleJobService.add(sysScheduleJob);

        // Assert
        verify(scheduler, times(1)).scheduleJob(jobDetail, trigger);
    }

    @Test
    public void testAdd_ClassNotFoundException() {
        // Arrange
        sysScheduleJob.setClassName("com.espread.sys.service.impl.NonExistentClass");

        // Act & Assert
        ServiceException exception = assertThrows(ServiceException.class, () -> {
            sysScheduleJobService.add(sysScheduleJob);
        });

        assertEquals("任务类没找到", exception.getMessage());
    }

    @Test
    public void testAdd_SchedulerException() throws ClassNotFoundException, SchedulerException {
        // Arrange
        doThrow(new SchedulerException()).when(scheduler).scheduleJob(any(JobDetail.class), any(CronTrigger.class));

        // Act & Assert
        assertDoesNotThrow(() -> sysScheduleJobService.add(sysScheduleJob));
    }
}

// Sample test class for testing
class TestJob {
  
}