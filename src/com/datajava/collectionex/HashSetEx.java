package com.datajava.collectionex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class HashSetEx {
	HashSet<Integer> nrs = new HashSet<Integer>();

	public HashSetEx() {
		// TODO Auto-generated constructor stub
		this.nrs.add(100);
		this.nrs.add(200);
		this.nrs.add(300);
		this.nrs.add(400);
		System.out.println(this.nrs);

		Iterator<Integer> its = this.nrs.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetEx hsx = new HashSetEx();
		System.out.println(hsx.nrs);
		hsx.nrs.removeAll(hsx.nrs);
		System.out.println(hsx.nrs);

	}

}
