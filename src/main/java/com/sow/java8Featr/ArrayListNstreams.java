package com.sow.java8Featr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListNstreams {

	public static void main(String args[]) {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(101, "John", "M", "United States", "California", "Los Angeles"));
		employees.add(new Employee(91, "Jacob", "M", "United States", "California", "Los Angeles"));
		employees.add(new Employee(111, "Lisa", "F", "United States", "California", "Los Angeles"));
		employees.add(new Employee(97, "Mary", "F", "United States", "California", "Sacramento"));
		employees.add(new Employee(76, "Christine", "F", "United States", "California", "Sacramento"));
		employees.add(new Employee(114, "David", "M", "United States", "California", "San Jose"));
		employees.add(new Employee(103, "Kevin", "M", "United States", "California", "Oakland"));
		employees.add(new Employee(109, "Joe", "M", "United States", "California", "Oakland"));
		employees.add(new Employee(119, "Mathew", "M", "United States", "California", "San Jose"));
		employees.add(new Employee(99, "Angelina", "F", "United States", "California", "San Diego"));
		employees.add(new Employee(98, "Tom", "M", "United States", "California", "San Diego"));
		employees.add(new Employee(116, "Curl", "M", "United States", "California", "Los Angeles"));
		employees.add(new Employee(66, "Christopher", "M", "United States", "California", "Oakland"));
		employees.add(new Employee(56, "Chelse", "F", "United States", "California", "Oakland"));
		employees.add(new Employee(88, "Murali", "M", "United States", "California", "San Jose"));
		employees.add(new Employee(87, "Daisy", "F", "United States", "California", "Sacramento"));
		employees.add(new Employee(85, "Niza", "F", "United States", "Virginia", "Richmond"));
		employees.add(new Employee(86, "Chris", "M", "United States", "Virginia", "Fairfax"));
		employees.add(new Employee(90, "Andrew", "M", "United States", "Virginia", "Reston"));

		employees.stream().filter(e -> e.getEmployeeID() > 100).map(e -> e.getEmployeeID() + 1000)
				.forEach(System.out::println);
		System.out.println("===================");

		employees.stream().filter(e -> e.getEmployeeID() > 100)
				.map(e -> new Employee(e.getEmployeeID() + 1000, e.getEmployeeName(), e.getEmployeeGender(),
						e.getEmployeeCountry(), e.getEmployeeState(), e.getEmployeeCity()))
				.forEach(System.out::println);
		System.out.println("===================");

		Map<Integer, Employee> empMap = new HashMap<>();
		empMap.put(1, new Employee(101, "John", "M", "United States", "California", "Los Angeles"));
		empMap.put(21, new Employee(111, "Lisa", "F", "United States", "California", "Los Angeles"));
		empMap.put(2, new Employee(76, "Christine", "F", "United States", "California", "Sacramento"));

		empMap.entrySet().stream().filter(e -> e.getValue().getEmployeeGender().equals("F"))
				.collect(Collectors.toList()).forEach(System.out::println);
		empMap.keySet().stream().forEach(System.out :: println);
	}
}
/*
 * System.out.println("============================");
 * System.out.println("Given Employee Details: ");
 * System.out.println("============================");
 * employees.stream().forEach(System.out::println);
 * 
 * System.out.println("============================");
 * System.out.println("Sorting Ascending by Employee name: ");
 * System.out.println("============================");
 * employees.stream().sorted(Comparator.comparing(Employee::getEmployeeName)).
 * collect(Collectors.toList()) .forEach(System.out::println);
 * 
 * System.out.println("============================");
 * System.out.println("Sorting by reversed Employee Id: ");
 * System.out.println("============================");
 * employees.stream().sorted(Comparator.comparing(Employee::getEmployeeID).
 * reversed()).collect(Collectors.toList()) .forEach(System.out::println);
 * 
 * System.out.println("============================"); System.out.println(
 * "Number of Females: " + employees.stream().filter(e ->
 * e.getEmployeeGender().equals("F")).count());
 * System.out.println("============================"); List<Employee>
 * newEmployees = new ArrayList<>(); newEmployees = employees.stream() .map(e ->
 * new Employee((e.getEmployeeID() + 10), e.getEmployeeName(),
 * e.getEmployeeGender(), e.getEmployeeCountry(), e.getEmployeeState(),
 * e.getEmployeeCity())) .collect(Collectors.toList());
 * 
 * System.out.println("============================");
 * System.out.println("Sorted Employee by Id with increment of 10: ");
 * System.out.println("============================");
 * newEmployees.stream().sorted(Comparator.comparing(Employee::getEmployeeID)).
 * forEach(System.out::println);
 * 
 * System.out.println("============================");
 * System.out.println("Sort Descending by Employee Id: ");
 * System.out.println("============================"); List<Employee>
 * newEmployees1 = new ArrayList<>(); newEmployees1 =
 * employees.stream().sorted(Comparator.comparing(Employee::getEmployeeID).
 * reversed()) .collect(Collectors.toList());
 * System.out.println(newEmployees1.get(1).toString());
 * 
 */
