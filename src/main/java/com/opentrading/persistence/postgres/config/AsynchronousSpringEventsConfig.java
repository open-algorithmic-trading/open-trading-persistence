package com.opentrading.persistence.postgres.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

/**
 * Class AsynchronousSpringEventsConfig
 * 
 * If Spring finds this bean named "applicationEventMulticaster",
 * event listeners switch to async mode. 
 * 
 * This should probably live in core module, leaving it here for now. 
 * 
 * If we want to have sync and async event listeners, we should also be 
 * able to implement some logic here to make that happen.
 * https://stackoverflow.com/questions/26276009/how-to-configure-async-and-sync-event-publishers-using-spring
 */
@Configuration
public class AsynchronousSpringEventsConfig {
	
	@Bean(name = "applicationEventMulticaster")
	public ApplicationEventMulticaster applicationEventMulticaster() {
	    SimpleApplicationEventMulticaster eventMulticaster =
	      new SimpleApplicationEventMulticaster();
	    
	    // TODO: pull task executor out into a bean
	    eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
	    return eventMulticaster;
	}
	
}