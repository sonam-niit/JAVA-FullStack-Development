package com.simplilearn.array;

import java.util.Scanner;

public class SingleDimentionArray {

	public static void main(String[] args) {
		
		int array[]= {11,12,13,14,15,16};
		
		System.out.println("access elements "+array[3]);
		
		//print all elements
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		//another way of array declaration
		int a[]= new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter your roll no");
			a[i]= sc.nextInt();
		}
		
		//print all scanned elements
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}
