package com.sow.simple;

import java.util.Scanner;

public class Staircase {

	// Complete the staircase function below.
	static void staircase(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++)
				System.out.print("#");
		}
		for (int i = n; i >= 1; i--) {
			System.out.println();
			for (int j = 1; j <= i; j++)
				System.out.print("#");
		}
		
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int space = n; space > i; space--)
				System.out.print(" ");
			for (int x = 1; x <= i; x++)
				System.out.print("*");
			System.out.println();
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}
}
