package com.eventhandlingspring;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventHandler implements ApplicationListener<ContextStartedEvent>
{

	public void onApplicationEvent(ContextStartedEvent event) {
		
		System.out.println("Started");
		
	}

	
}
