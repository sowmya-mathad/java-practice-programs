package com.sow.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleString {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		String newString = null;
		ArrayList<String> str = new ArrayList<String>();

		str.add(str1);
		str.add(str2);

		System.out.println((str1.length() + str2.length()));
		str.sort(null);
		for (String string : str) {
			if (string.equals(str1)) {
				System.out.println("No");
				break;
			} else {
				System.out.println("Yes");
				break;
			}
		}

		System.out.println(str1.replace(str1.charAt(0), Character.toUpperCase(str1.charAt(0))) + " "
				+ str2.replace(str2.charAt(0), Character.toUpperCase(str2	.charAt(0))));

	}
}
