package com.sow.java8Featr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

public class ForEachMapExample {

	public static void main(String a[]) {

		Map<String, String> countryMap = new HashMap<>();
		//insert into Map
		countryMap.put("India", "Delhi");
		countryMap.put("USA", "Washington, D.C.");
		countryMap.put("Japan", "Tokyo");
		countryMap.put("Canada", "Ottawa");

		// iterate through Map normal way
		ForEachMapExample.iterateMap(countryMap);

		// iterate through Map using forEach method
		ForEachMapExample.iterateMapUsingForEach(countryMap);

		List<String> countryList = new ArrayList<>();
		countryList.add("India");
		countryList.add("USA");
		countryList.add("Japan");
		countryList.add("Canada");

		// iterate through List normal way
		ForEachMapExample.iterateList(countryList);

		// iterate through List using forEach method
		ForEachMapExample.iterateListUsingForEach(countryList);
	}

	public static void iterateList(List<String> countryList) {
		System.out.println("<----------Iterating in normal way------------->");

		for (String str : countryList) {
			System.out.println(str);
		}
	}		

	public static void iterateListUsingForEach(List<String> countryList) {
		System.out.println("\n<----------Iterating using forEach method------------>");
		countryList.forEach(country->System.out.println(country));
	}

	public static void iterateMap(Map<String, String> countryMap) {

		System.out.println("<----------Iterating in normal way------------->");

		for (Entry<String, String> entry : countryMap.entrySet()) {
			System.out.println("Country: " + entry.getKey() + " : Capital: " + entry.getValue());
		}
	}

	public static void iterateMapUsingForEach(Map<String, String> countryMap) {

		System.out.println("\n<----------Iterating using forEach method------------>");

		countryMap.forEach((k, v) -> System.out.println("Country: " + k + " : Capital: " + v));

	}
}