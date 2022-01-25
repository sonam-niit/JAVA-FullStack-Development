package com.simplilearn.array;

//import java.util.Scanner;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//lets store elements in matrix
		int array[][]= {{1,2,4},{3,4,5},{9,7,4}};
		
		
//		for(int row=0;row<3;row++)
//		{
//			for(int col=0;col<3;col++)
//			{
//				System.out.println("Enter Element");
//				array[row][col]=sc.nextInt();
//			}
//		}
		
		System.out.println("Let's Print elements");
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print(array[row][col]+"\t");
			}
			
			System.out.println();
		}
	}
}
