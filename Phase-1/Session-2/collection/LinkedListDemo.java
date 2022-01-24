package com.simplilearn.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(12);
		list.add(24);
		list.add(36);
		
		System.out.println("Size "+list.size());
		list.add(67);
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.add(2,78);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}
}
