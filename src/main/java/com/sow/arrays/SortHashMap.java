package com.sow.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");

		System.out.println("Before Sorting:");

		Set set = hmap.entrySet();
		Iterator iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting by key:");

		Set set2 = map.entrySet();
		Iterator iterator2 = (Iterator) set2.iterator();

		while (iterator2.hasNext()) {

			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}

		List list = new LinkedList(map.entrySet());
		// Defined Custom Comparator here
		Collections.sort(list, (Object o1, Object o2) -> ((String) ((Map.Entry) (o1)).getValue()).compareTo((String) ((Map.Entry) (o2)).getValue()));
		

		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println("After Sorting by Value:");
		Set set3 = sortedHashMap.entrySet();
		Iterator iterator3 = set3.iterator();
		while (iterator3.hasNext()) {
			Map.Entry me3 = (Map.Entry) iterator3.next();

			System.out.print(me3.getKey() + ": ");
			System.out.println(me3.getValue());
		}
	}

}