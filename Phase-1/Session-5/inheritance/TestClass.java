package com.simplilearninheritance;

public class TestClass implements First,Second{
	
	public void show()
	{
		First.super.show();
		Second.super.show();
	}
	
	public static void main(String[] args) {
		TestClass test=new TestClass();
		test.show();
	}

}
