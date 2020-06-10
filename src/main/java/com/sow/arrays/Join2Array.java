package com.sow.arrays;

import java.util.ArrayList;

public class Join2Array {
	public static void main(String args[]) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		System.out.println("ar1 : " + ar1);
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(1);
		ar2.add(4);
		ar2.add(3);
		System.out.println("ar2 : " + ar2);
		for (int i = 0; i < ar2.size(); i++) {
			if (!ar1.contains(ar2.get(i)))
				ar1.add(ar2.get(i));

		}

		System.out.println("After join " + ar1);
	}

}
