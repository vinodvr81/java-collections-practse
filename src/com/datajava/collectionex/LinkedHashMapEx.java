package com.datajava.collectionex;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class LinkedHashMapEx {
	LinkedHashMap<String, ArrayList<Integer>> lhm = new LinkedHashMap<>();

	public LinkedHashMapEx() {
		// Populating the list
		List<Integer> ll = new ArrayList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);

		// Adding to LinkedHashMap
		this.lhm.put("numbers", new ArrayList<>(ll));
		this.lhm.put("evens", new ArrayList<>(List.of(2, 4, 6)));
		this.lhm.put("odds", new ArrayList<>(List.of(1, 3, 5)));
		for (Map.Entry<String, ArrayList<Integer>> entry : lhm.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		LinkedHashMapEx example = new LinkedHashMapEx();

	}
}
