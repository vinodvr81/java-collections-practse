package com.datajava.collectionex;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx {
	SortedMap<String, Integer> nms = new TreeMap<String, Integer>();

	public SortedMapEx() {
		// TODO Auto-generated constructor stub
		nms.put("One", 1);
		nms.put("two", 2);
		System.out.println(nms);
		System.out.println(nms.firstKey());
		System.out.println(nms.lastKey());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMapEx ampex = new SortedMapEx();
	}

}
