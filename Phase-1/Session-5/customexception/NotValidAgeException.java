package com.simplilearn.customexception;

public class NotValidAgeException extends Exception{

	public NotValidAgeException(String msg) {
		//pass msg from child class to parent class constructor
		super(msg);
	}
}
