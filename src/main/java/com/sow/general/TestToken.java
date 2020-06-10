package com.sow.general;

import java.util.StringTokenizer;

public class TestToken {
	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("My name is sowmya");
		while (str.hasMoreElements()) {
			System.out.println(str.nextToken());
		}
		System.out.println("==========================");
		str = new StringTokenizer("sowmya, sweety, swetha");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken(",").trim());
		}
	}
}
