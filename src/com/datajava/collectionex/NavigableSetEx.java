package com.datajava.collectionex;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetEx {
	NavigableSet<String> sts = new TreeSet<>();

	public NavigableSetEx() {
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

		NavigableSet<String> reverseSet = this.sts.descendingSet();
		System.out.println(reverseSet);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSetEx obj = new NavigableSetEx();

	}

}
