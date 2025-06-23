package com.datajava.collectionex;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	List<String> vecex = new Vector<>();

	public VectorExample() {
		// TODO Auto-generated constructor stub

		System.out.println(this.vecex.size());

		this.vecex.add("Embrace Chaos");
		this.vecex.add("Time Changes everything");
		this.vecex.add("if it meant to endure then edure do not complain");

		System.out.println(this.vecex);
		System.out.println("VectorSize is :" + this.vecex.size());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorExample obj = new VectorExample();
	}

}
