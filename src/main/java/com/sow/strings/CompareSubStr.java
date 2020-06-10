package com.sow.strings;

import java.util.Scanner;

public class CompareSubStr {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		int j = 0;
		java.util.ArrayList<String> arl = new java.util.ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			j=i+k;
			if (i <= (s.length() - k))
				arl.add(s.substring(i, (i + k)));
			else {
//				arl.add(s.substring(i, (s.length()-1)));
				break;
				}
		}
		
		arl.sort(null);
		smallest = arl.get(0);
		largest = arl.get(arl.size() - 1);
		return smallest + "\n" + largest;
		
		
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println(getSmallestAndLargest(S, k));
	}
}
