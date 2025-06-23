package com.datajava.collectionex;

import java.util.TreeMap;

public class TreeSetExample {
	TreeMap<String, Integer> tms = new TreeMap<String, Integer>();

	public TreeSetExample() {
		// TODO Auto-generated constructor stub
		tms.put("One", 1);
		tms.put("two", 2);
		tms.put("three", 3);
		tms.put("four", 4);
		tms.putIfAbsent("five", 5);
		tms.putIfAbsent("six", 6);
		System.out.println(tms.keySet());
		System.out.println(tms.values());
		System.out.println(tms.entrySet());
		System.out.println(tms);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSetExample obj = new TreeSetExample();
	}

}
