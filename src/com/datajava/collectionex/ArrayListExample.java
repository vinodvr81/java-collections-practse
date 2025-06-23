package com.datajava.collectionex;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	List<String> alst = new ArrayList<>();
	public ArrayListExample() {
		// TODO Auto-generated constructor stub
		this.alst.add("Vukkalam");
		this.alst.add("Rangaswamy");
		this.alst.add("Vinod");
		System.out.println("Array List Size is :" + alst.size());
		System.out.println(this.alst);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListExample obj = new ArrayListExample();
	}

}
