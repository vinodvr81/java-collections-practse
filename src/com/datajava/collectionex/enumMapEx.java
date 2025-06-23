package com.datajava.collectionex;

import java.util.EnumMap;

public class enumMapEx {
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}

	EnumMap<Size, Integer> emp = new EnumMap<>(Size.class);

	public enumMapEx() {
		// TODO Auto-generated constructor stub
		this.emp.put(Size.SMALL, 5);
		this.emp.put(Size.MEDIUM, 10);
		this.emp.put(Size.LARGE, 15);
		this.emp.put(Size.EXTRALARGE, 20);
		System.out.println(this.emp.keySet());
		System.out.println(this.emp.size());
		System.out.println(this.emp.values());
		System.out.println(this.emp.entrySet());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumMapEx obj = new enumMapEx();
	}

}
