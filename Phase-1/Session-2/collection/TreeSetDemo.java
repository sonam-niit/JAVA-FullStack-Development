package com.simplilearn.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> set= new TreeSet<String>();
		
		set.add("aesha");
		set.add("user");
		set.add("pooja");
		set.add("kruti");
		//no order maintain
		System.out.println(set);
		//no duplicates allowed
		set.add("kruti");
		
		System.out.println(set);
		
		System.out.println("Is Empty: "+set.isEmpty());
		
		set.remove("kruti");
		
		System.out.println("Size: "+set.size());
		
	}
}
