package com.simplilearn.method;

public class Student {

	//class level variables
	int id;
	String name;
	
	//default constructor
	public Student()
	{
		id=23;
		name="Sonam";
	}
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		//when you create object automatically it calls default constructor
		//if no default constructor then compiler will create that
		Student obj=new Student();
		System.out.println("User 1");
		System.out.println("Id: "+obj.id);
		System.out.println("Name: "+obj.name);
		
		Student obj2= new Student(45,"Vineet");
		System.out.println("User 2");
		System.out.println("Id: "+obj2.id);
		System.out.println("Name: "+obj2.name);
		
		
		
	}
}
