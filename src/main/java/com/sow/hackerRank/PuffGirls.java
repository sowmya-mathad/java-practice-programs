package com.sow.hackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

public class PuffGirls {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];
		int[] d = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		String[] dItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int dItem = Integer.parseInt(dItems[i]);
			d[i] = dItem;
		}
		int result = puffGirlsCount(c, d, n);
		System.out.println(result);


		scanner.close();

	}

	private static int puffGirlsCount(int[] quantity, int[] input, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			int res = input[i] / quantity[i];
			System.out.println("i : " + input[i]  + " q : " + quantity[i] + " res: " + res);
			result[i] = Integer.valueOf(res);
		}

		Arrays.sort(result);

		return result[0];

	}
}

// 4
// 2 5 6 3
// 20 40 90 50