package com.datajava.collectionex;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetEx {

	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}

	public EnumSetEx() {
		// TODO Auto-generated constructor stub
		EnumSet<Size> sizes = EnumSet.allOf(Size.class);
		System.out.println(sizes);

		EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
		System.out.println(sizes1);

		EnumSet<Size> sizes2 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
		System.out.println(sizes2);

		EnumSet<Size> sizes3 = EnumSet.of(Size.SMALL, Size.LARGE);
		System.out.println(sizes3);

		Iterator<Size> ite = sizes.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSetEx obj = new EnumSetEx();
	}

}
