package com.simplilearn.string;

public class StringExample {

	public static void main(String[] args) {
		
		String s = new String("Hello");
		System.out.println("String "+s);
		
		s=s+"World";
		
		System.out.println("String "+s);
		
		//when you change value of s it will create new object
	}
}
