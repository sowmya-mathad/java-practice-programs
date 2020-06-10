package com.sow.java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {

	public static void main(String args[]) {
		List<String> names = Arrays.asList("Jack", "Peter", "Sam", "Ryan");
		for (String name : names) {
			if (!name.equals("Sam"))
				System.out.println(name);
		}

		System.out.println("Using Filters: ");

		names.stream().filter(FilterExample::isNotSam).forEach(System.out::println);
		
		
		System.out.println("===================");
		
		 List<String> l = new ArrayList(Arrays.asList("one", "two", "four", "six", "five","two", "three"));
	     Stream<String> sl = l.stream();
	     l.add("three");
	     sl.collect(Collectors.toList()).forEach(System.out::println);
	     System.out.println();
	     l.parallelStream().distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);
	     System.out.println();
	     List<Integer> integers = Arrays.asList(1,24,5,7,8,9,0,3);
	     integers.stream().map(i-> i*10).collect(Collectors.toList()).forEach(System.out::println);
	     System.out.println("FilterExample.main()");
	     
	     System.out.println("sum: "+ integers.stream().reduce(0, (x,y) -> x+ y));
	     System.out.println("Difference: "+ integers.stream().reduce(0, Integer :: sum));

	     ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
	     
	        Spliterator<Integer> sItr = digits.spliterator();
	         
	        sItr.tryAdvance( d -> System.out.println( d ) );
	        sItr.tryAdvance( d -> System.out.println( d ) );
	        sItr.tryAdvance( d -> System.out.println( d ) );
	}

	static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}

}
