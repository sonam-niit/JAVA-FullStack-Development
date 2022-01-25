package com.simplilearn.inner;

public class MethodLocalInnerClasss {

	public void display()
	{
		class Inner
		{
			void myMethod()
			{
				System.out.println("Method from Inner Class");
			}
		}
		
		Inner inner=new Inner();
		inner.myMethod();
	}
	
	public static void main(String[] args) {
		
		MethodLocalInnerClasss mlic=new MethodLocalInnerClasss();
		mlic.display();
	}
}
