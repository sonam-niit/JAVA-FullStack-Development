package com.simplilearn.exception;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException() {
		super();
	}
	public ProductNotFoundException(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [toString()=" + super.toString() + "]";
	}
	
}
