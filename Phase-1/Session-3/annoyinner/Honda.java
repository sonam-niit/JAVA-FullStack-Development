package com.simplilearn.annoyinner;

//class honda implementing car interface
//so we have to define all car methods in
//this class to use them
public class Honda implements Car{

	@Override
	public void start() {
		System.out.println("Car started");
		
	}

	@Override
	public void stop() {
		System.out.println("Car Stopped");
		
	}

}
