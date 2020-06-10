package com.sow.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.text.NumberFormat;

public class PlusMinusArray {
	private static DecimalFormat df2 = new DecimalFormat("##.######");

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int positive = 0, negative = 0, zeros = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				negative++;
			else if (0 < arr[i])
				positive++;
			else if (arr[i] == 0)
				zeros++;
		}
		double fractionP = (double) positive / arr.length;
		double fractionN = (double) negative / arr.length;
		double fractionZ = (double) zeros / arr.length;
		
		System.out.println(df2.format(fractionP));
		System.out.println(df2.format(fractionN));
		System.out.println(df2.format(fractionZ));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
