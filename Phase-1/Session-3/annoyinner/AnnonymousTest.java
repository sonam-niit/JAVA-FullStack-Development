package com.simplilearn.annoyinner;

public class AnnonymousTest {

	public static void main(String[] args) {
		
		/*
			we can not create an object on interface why? bcoz interface methods are not implemented. but if you want you can directly create object with implementing interface where you want to user

we have implemented methods directly here without giving a class name
		thats why it is called class without name (announymous inner class)

		*/
		Car c=new Car() {
			
			@Override
			public void stop() {
				System.out.println("car started from anonymous class");
				
			}
			
			@Override
			public void start() {
				System.out.println("Car stopped from anonymous class");
				
			}
		};
		
		c.start();
		c.stop();
	}
}
