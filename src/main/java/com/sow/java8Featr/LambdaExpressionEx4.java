package com.sow.java8Featr;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionEx4 {
	public static void main(String args[]) {
		List<String> lst = new ArrayList<String>();
		lst.add("Sowmya");
		lst.add("Shreyansh");
		lst.add("Girish");

		lst.forEach((n) -> System.out.println(n));
	}
}