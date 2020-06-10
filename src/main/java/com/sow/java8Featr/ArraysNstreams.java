package com.sow.java8Featr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysNstreams {

	public static void main(String[] args) {

		List<Integer> ints = IntStream.of(10, 34, 12, 4, 5, 656, 44343, 4, 46, 89, 54, 1).boxed()
				.collect(Collectors.toList());
		ints.stream().distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("===================");
		ints.stream().filter(n -> n > 50).sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("===================");
		List<String> strings = Arrays.asList("sam","ram","tommy","jimmy", "jack", "jully", "may","mounty","shreyansh","sanvi");
		strings.stream().forEach(System.out::println);
		System.out.println("===================");
		strings.stream().map(str -> str.concat("_NEW")).forEach(System.out::println);
		System.out.println("===================");
		System.out.println("===================");
		strings.stream().filter(str -> !str.startsWith("s")).map(str -> str.toUpperCase())
				.collect(Collectors.toList()).forEach(System.out::println);
	}

}
