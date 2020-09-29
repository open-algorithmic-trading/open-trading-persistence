package com.opentrading.persistence.postgres.events;

import org.springframework.context.ApplicationEvent;

public class PostgresQueryEvent extends ApplicationEvent {
	
	String query;

	public PostgresQueryEvent(Object source, String query) {
		super(source);
		
		this.query = query;
	}

	public String getQuery() {
		return query;
	}

}
