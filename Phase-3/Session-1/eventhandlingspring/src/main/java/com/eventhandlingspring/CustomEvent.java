package com.eventhandlingspring;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

	public CustomEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "CustomEvent: [This is My Custom Event]";
	}

	
}
