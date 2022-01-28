package com.simplilearn.exceptionhandling;

public class ExceptionHandling2 {

	public int divide()
	{
		return 45/0;
	}
	public void add()
	{
		int a[]=new int[3]; //0,1,2
		
		a[3]=78;
	}
	public void convert()
	{
		String s="test";
		int num=Integer.parseInt(s);
	}
	
	public static void main(String[] args) {
		ExceptionHandling2 obj=new ExceptionHandling2();
		try
		{
			obj.convert();
			obj.add();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Exception "+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Issue "+e);
		}
		catch(Exception e)
		{
			System.out.println("General Exception "+e);
		}
	}
}
