package com.simplilearn.lvc;

public class TypeCasting {

	public static void main(String[] args) {
		//Implicit Conversion
		
		System.out.println("Implicit type Casting");
		char a='A';
		System.out.println("Value of a "+a);
		
		int b=a;
		System.out.println("value of Int "+b);
		
		float c=b;
		System.out.println("value of Float "+c);
		
		long d=b;
		System.out.println("Value of Long "+d);
		
		double e=b;
		System.out.println("Value of Double "+e);
		
		System.out.println("Explicit Type Converstion");
		double x=89.90;
		int y =(int) x;
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);
		
		float result= 45.0f/7;
		System.out.println("value of result "+result);
		
		
	}
}
