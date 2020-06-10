package com.sow.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapToIntExample {

	public static void main(String args[]) {
		List<String> names = Arrays.asList("Jack", "Peter", "Sam", "Ryan");
		int sums = 0;
		for (String name : names) {
			User user = new User(name);
			sums += user.getAge();
		}
		System.out.println("Sum of Ages: " + sums);

		System.out.println("Using Filters: ");

		List<User> users = names.stream().map(User::new).collect(Collectors.toList());
		int sum = users.stream().mapToInt(User::getAge).sum();
		System.out.println("Sum of Ages: " + sum);

	}

	private static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}

	private static class User {
		private String name;
		private Integer age = 30;

		public User(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}

	}
}
