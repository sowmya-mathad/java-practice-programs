package com.sow.math;

import java.util.*;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int output[] = getSeries(a, b, n);
			for (int k = 0; k < output.length; k++) {
				System.out.print(output[k] + " ");
			}
			System.out.println();
		}

		in.close();
	}

	public static int[] getSeries(int a, int b, int n) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		int sum = a;
		for (int i = 0; i < n; i++) {
			sum = sum + (int) (Math.round((Math.pow(2, i) * b)));
			outputList.add(sum);
		}

		int[] premitive = outputList.stream().mapToInt(Integer::intValue).toArray();
		return premitive;
	}
}