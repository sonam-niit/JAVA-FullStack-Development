package com.simplilearn.annoyinner;

public class UseImplementedClass {

	public static void main(String[] args) {

		/*we can create multiple objects
		of car class and we can use 
		the same methods which is ALREADY
		implemented in Honda class */
		Honda honda=new Honda();
		
		honda.start();
		honda.stop();
	}
}
