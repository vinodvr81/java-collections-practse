package com.datajava.collectionex;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetEx {
	LinkedHashSet<String> set = new LinkedHashSet<>();

	public LinkedHashSetEx() {
		// TODO Auto-generated constructor stub
        this.set.add("apple");
        this.set.add("banana");
        this.set.add("apple"); // duplicate, won't be added again
        this.set.add("banana");
        System.out.println(this.set);
        
		Iterator<String> its = this.set.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetEx obj = new LinkedHashSetEx();

	}

}
