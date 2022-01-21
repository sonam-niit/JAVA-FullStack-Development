package com.simplilearn.first.conditional;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1= scanner.nextInt();
		System.out.println("Enter Second Number");
		int num2= scanner.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" is larger");
		}
		else
		{
			System.out.println(num2 +" is larger");
		}
	}
}
