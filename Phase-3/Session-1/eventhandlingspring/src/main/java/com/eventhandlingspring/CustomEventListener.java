package com.eventhandlingspring;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent> {

	public void onApplicationEvent(CustomEvent event) {
		
		System.out.println(event.toString());
		
	}

}
