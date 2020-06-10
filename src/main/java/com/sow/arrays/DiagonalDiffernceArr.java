package com.sow.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDiffernceArr {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {
		int sumDiagonal1 = 0, sumDiagonal2 = 0, difference = 0;
		int i, j, k, m;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				if (i == j) {
					System.out.println(arr[i][j] + "dig1");

					sumDiagonal1 += arr[i][j];
				}
			}
		}
		for (k = arr.length-1; k >= 0; k--) {
					System.out.println(arr[(arr.length)-k-1][k] + "dig2");
					sumDiagonal2 +=arr[(arr.length)-k-1][k] ;
		}
		difference = Math.abs(sumDiagonal1 - sumDiagonal2);
		return difference;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = diagonalDifference(arr);
		System.out.println("result" + result);

//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}
}
