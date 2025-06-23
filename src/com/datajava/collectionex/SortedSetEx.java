package com.datajava.collectionex;

import java.util.SortedSet;
import java.util.TreeSet;

import com.datajava.collectionex.EnumSetEx.Size;

import java.util.Iterator;

public class SortedSetEx {
	SortedSet<String> sts = new TreeSet<>();

	public SortedSetEx() {
		// TODO Auto-generated constructor stub

		this.sts.add("Anantapur");
		this.sts.add("ATP");
		this.sts.add("Kurnool");
		this.sts.add("KNL");
		this.sts.add("Hyderabad");
		this.sts.add("HYD");

		this.sts.add("Anantapur");
		this.sts.add("ATP");
		this.sts.add("Kurnool");
		this.sts.add("KNL");
		this.sts.add("Hyderabad");
		this.sts.add("HYD");

		System.out.println(this.sts);
		
//		Iterator<String> ite = this.sts.iterator();
//		while (ite.hasNext()) {
//			System.out.println(ite.next());
//		}

	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSetEx obj = new SortedSetEx();
		System.out.println(obj.sts.first());
		System.out.println(obj.sts.last());
	}

}
