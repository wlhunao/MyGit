package com.baizhi.quartz;


import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class TestQuartz {

    public static void main(String[] args) throws SchedulerException {
        //创建任务调用对象
        StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = stdSchedulerFactory.getScheduler();
        //任务详情类
        JobDetail build = JobBuilder.newJob(MyJob.class).build();
        //触发类  定义周期性执行的时间
       // Trigger trigger = TriggerBuilder.newTrigger().withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(3)).build();
        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("* * * * * ? *")).build();
        //执行任务和详细内容
        scheduler.scheduleJob(build,trigger);
        scheduler.start();
    }
}
