package com.mrodriguez.jsetemplate.procesos;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author mrodriguez
 */
public class Job2 implements Job {
    
    private static final Logger logger = Logger.getLogger(Job2.class);

    public void execute(JobExecutionContext jec) throws JobExecutionException {
        
        
        
        
        //you cant do whatever you want here!!
    	logger.info("Performing a very nice and important job 2!!!");
    }
    
}
