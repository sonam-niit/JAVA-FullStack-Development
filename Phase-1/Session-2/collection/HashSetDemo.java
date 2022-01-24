package com.simplilearn.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
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
		
		set.add(null);
		System.out.println(set);
	}
}
