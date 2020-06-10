package com.sow.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapperExample {

	public static void main(String args[]) {
		List<String> names = Arrays.asList("Jack", "Peter", "Sam", "Ryan");
		for (String name : names) {
			if (!name.equals("Sam"))
				System.out.println(name);
		}

		System.out.println("Using Filters: ");
//		names.stream().filter(MapperExample::isNotSam).map(new Function<String, User>() {
//
//			@Override
//			public User apply(String name) {
//				return new User(name);
//			}
//		}).forEach(System.out::println);
		names.stream().filter(MapperExample::isNotSam).map(User::new).forEach(System.out::println);
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
