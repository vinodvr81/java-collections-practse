package com.datajava.collectionex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listExampleEx {
	List<String> llex = new LinkedList<>();
	

	public listExampleEx() {
		// TODO Auto-generated constructor stub


		this.llex.add("Vukkalam");
		this.llex.add("Nevaan");
		this.llex.add("Skanda");

		System.out.println("Linked List Size is :" + llex.size());
		System.out.println(this.llex);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listExampleEx obj = new listExampleEx();

	}

}
