package com.simplilearn.inner;

public class LocalInnerClass {

	void validate(int age)
	{
		if(age>=18)
		{
			class Inner{
				void test()
				{
					System.out.println("Now Authenticate User using Adhar");
				}
			}
			
			Inner inner= new Inner();
			inner.test();
		}
		else
		{
			System.out.println("No need to Authenticate");
		}
	}
	
	public static void main(String[] args) {
		LocalInnerClass local=new LocalInnerClass();
		local.validate(8);
	}
}
