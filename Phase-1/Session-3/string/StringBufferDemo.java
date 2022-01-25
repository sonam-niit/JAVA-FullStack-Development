package com.simplilearn.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("Hello World");
		
		System.out.println("Character at Index 4: "+str.charAt(4));
		System.out.println("String length "+str.length());
		System.out.println("Replace "+str.replace(0, 5, "Welcome "));
		System.out.println("Reverse String "+str.reverse());
		
		
		//create same code for string builder
		String s="Sonam Soni";
		StringBuilder str1=new StringBuilder(s);
		System.out.println("Character at Index 4: "+str1.charAt(4));
		System.out.println("String length "+str1.length());
		System.out.println("Replace "+str1.replace(0, 5, "Welcome "));
		System.out.println("Reverse String "+str1.reverse());
	}
}
