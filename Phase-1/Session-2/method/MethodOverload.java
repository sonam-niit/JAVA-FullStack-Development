package com.simplilearn.method;

import java.util.Scanner;

public class MethodOverload {

	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public float add(float a,float b)
	{
		return a+b;
	}
	public float add(float a,float b,float c)
	{
		return a+b+c;
	}
	public double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverload m= new MethodOverload();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Add 2 int "+m.add(x,y));
		System.out.println("Add 3 int "+m.add(3, 6,8));
		System.out.println("Add 2 float "+m.add(3.0f, 6.8f));
		System.out.println("Add 2 double "+m.add(4.5, 7.8));
	}
}
