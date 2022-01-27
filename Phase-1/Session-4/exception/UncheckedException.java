package com.simplilearn.exception;

import java.util.Scanner;

//Arithmetic Exception
public class UncheckedException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		int div=num1/num2;
		
		System.out.println("Result is "+div);
	}
}
