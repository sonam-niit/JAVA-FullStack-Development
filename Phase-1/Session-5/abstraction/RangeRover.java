package com.simplilearn.abstraction;

public class RangeRover extends CarAbstract {

	public RangeRover(String name)
	{
		super(name);
	}
	@Override
	public void powerEngine() {
		
		System.out.println("Range Rover engine started");

	}

}
