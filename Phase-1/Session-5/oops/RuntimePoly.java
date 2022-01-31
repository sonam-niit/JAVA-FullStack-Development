package com.simplilearn.oops;

public class RuntimePoly extends Parent{

	public RuntimePoly(String name) {
		super(name);
		System.out.println("Child class constructor");
	}
	void test()
	{
		System.out.println("This is my Child class Method");
		super.test(); //call parent class test method
	}
	
	public static void main(String[] args) {
		
		RuntimePoly child=new RuntimePoly("User");
		child.test();
		
//		RuntimePoly child1= (RuntimePoly) new Parent("test");
//		Parent parent= new RuntimePoly("test");
	}
}
