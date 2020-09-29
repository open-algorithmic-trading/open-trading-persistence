package com.opentrading.persistence.postgres;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.opentrading.persistence.postgres.events.PostgresQueryEvent;

@Component
public class PostgresQueryListener implements ApplicationListener<PostgresQueryEvent> {

	@Override
	public void onApplicationEvent(PostgresQueryEvent event) {
		System.out.println(event.getQuery());
	}

}
