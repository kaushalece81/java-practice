package com.example;

import org.quartz.CronExpression;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzMain {

	public static void main(String[] args) throws SchedulerException {
		
		// define job
		JobDetail jobDetail = JobBuilder.newJob(QuartzJob.class).build();
		
		// create simple trigger
		Trigger simpleTrigger = TriggerBuilder
				.newTrigger()
				.withIdentity("SimpleTrigger")
				.startNow()
				.build();
		String cronExpression = "0 0/1 * 1/1 * ? *"; // Every minute trigger fired
		// create cron trigger
//				Trigger cronTrigger = TriggerBuilder
//						.newTrigger()
//						.withIdentity("CronTrigger")
//						.withSchedule(CronScheduleBuilder.cronSchedule(cronExpression))   // http://www.cronmaker.com/
//						.build();
		
		Trigger cronTrigger = TriggerBuilder
				.newTrigger()
				.withIdentity("CronTrigger")
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())  // every 5 seconds triggered
				.build();

		// create scheduler
		Scheduler defaultScheduler = StdSchedulerFactory.getDefaultScheduler();
		defaultScheduler.start();
//		defaultScheduler.scheduleJob(jobDetail, simpleTrigger);
		defaultScheduler.scheduleJob(jobDetail, cronTrigger);
	}

}
