package com.simplilearn.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(9, "sonam");
		map.put(7, "Prince");
		map.put(3, "akshita");
		//map.put(4, null);
		
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2: "+map.get(2));
		
		for(Map.Entry entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
