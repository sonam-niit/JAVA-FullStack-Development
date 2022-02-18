package com.eventhandlingspring;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandler implements ApplicationListener<ContextStoppedEvent>{

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Context Stopped Event Received");
		
	}

}
