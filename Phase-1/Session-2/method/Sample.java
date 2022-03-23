package com.simplilearn.method;

import java.util.Scanner;

public class Sample {

	//method with no return value, without parameter
	public void display()
	{
		System.out.println("Welcome to JAVA");
	}
	
	//method which will calculate some value and return as a result
	//2 parameter
	public int add(int a,int b)
	{
		int num1=a+b;
		int num2=a*b;
		return num1+num2;
	}
	//method to check user validity and return true or false, one parameter
	public boolean valid(int age)
	{
		if(age>18)
			return true;
		else
			return false;
	}
	//method to return fullname based on fname and lname, 2 parameterized
	public String fullName(String fname,String lname)
	{
		return fname+" "+lname;
	}
	public float toFeranHit(float celcius){
		return ((celsius*9)/5)+32  ;
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.display();//calling a method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int input=sc.nextInt();
		if(s.valid(input))
			System.out.println("Valid for vote");
		else
			System.out.println("Not valid");
		
	}
}
