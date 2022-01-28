package com.simplilearn.exceptionhandling;

public class ExceptionHandling1 {

	
	public static void divide()
	{
		try {
			int result=45/0;
			
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
	}
	public static void check()
	{
		divide();
	}
	
	public static void main(String[] args) {
		
		check();
	}
}
