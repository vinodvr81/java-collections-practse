package com.datajava.collectionex;

import java.util.WeakHashMap;

public class WeakHashMapEx {
	WeakHashMap<String, Integer> whp = new WeakHashMap<>();

	public WeakHashMapEx() {
		// TODO Auto-generated constructor stub
		this.whp.put("One", 1);
		this.whp.put("Two", 2);
		this.whp.put("Three", 3);
		this.whp.put("Four", 4);
		Integer its = 5;
		String sts = "Five";
		this.whp.put(sts, its);
		System.out.println(this.whp);
		its = null;
		this.whp.put(sts, its);
		System.gc();
		System.out.println(this.whp);
		sts = null;
		this.whp.put(sts, its);
		System.gc();
		System.out.println(this.whp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeakHashMapEx whmex = new WeakHashMapEx();	
	}

}
