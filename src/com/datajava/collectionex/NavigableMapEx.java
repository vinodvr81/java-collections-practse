package com.datajava.collectionex;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapEx {
	NavigableMap<String, Integer> nms = new TreeMap<String, Integer>();

	public NavigableMapEx() {
		// TODO Auto-generated constructor stub
		nms.put("One", 1);
		nms.put("two", 2);
		nms.put("three", 3);
		nms.put("four", 4);
		System.out.println(nms.firstEntry());
		System.out.println(nms.lastEntry());
		System.out.println(nms.pollFirstEntry());
		System.out.println(nms.pollLastEntry());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMapEx obj = new NavigableMapEx();
	}

}
