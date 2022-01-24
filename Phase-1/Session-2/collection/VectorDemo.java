package com.simplilearn.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.add("apple");
		vector.add("kiwi");
		vector.add("banana");
		
		System.out.println(vector.get(2));
		
		System.out.println("Size: "+vector.size());
		
		System.out.println(vector);
	}
}
