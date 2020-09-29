package com.opentrading.postgres;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.ComponentScan;

import com.opentrading.persistence.postgres.PostgresQueryListener;
import com.opentrading.persistence.postgres.events.PostgresQueryEvent;

/**
 * Simple integration testing module to sanity check changes
 */
@SpringBootTest()
public class PostgresQueryListenerTest {
	
	@Autowired
    private ApplicationEventPublisher applicationEventPublisher;
	
	@Test
	public void publishAndReceive() {
		PostgresQueryEvent event = new PostgresQueryEvent(this, "Dummy query");
		applicationEventPublisher.publishEvent(event);
	}
	
	@SpringBootApplication
	@ComponentScan(basePackageClasses = { PostgresQueryListener.class })
    static class TestConfiguration {
    }

}
