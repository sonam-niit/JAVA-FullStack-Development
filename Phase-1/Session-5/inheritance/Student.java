package com.simplilearninheritance;

public class Student {

	int id;
	String name;
	String email;
	Address address; //Aggregation
	
	public Student(int id, String name, String email, Address address) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	void display()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Address Details");
		System.out.println("City: "+address.city);
		System.out.println("State: "+address.state);
		System.out.println("Pincode: "+address.pincode);
	}
}
