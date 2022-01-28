package com.simplilearn.abstraction;

public class Jaguar extends CarAbstract {

	public Jaguar(String name)
	{
		super(name);
	}
	@Override
	public void powerEngine() {
		System.out.println("Jaguar Engine strated");

	}

}
