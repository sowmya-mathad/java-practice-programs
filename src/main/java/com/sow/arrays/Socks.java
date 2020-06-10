package com.sow.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Socks {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		Arrays.sort(ar);
		int temp = ar[0];
		int count = 0;
		int sum = 0;
		int num;

		for (int i = 0; i < n; i++) {
			if (ar[i] == temp)
				count++;
			else {
				num = count / 2;
				sum += num;				
				temp = ar[i];count = 1;
			}
			if(i == ar.length-1)
			{
				num = count / 2;
				sum += num;		
			}
		}
		System.out.println(sum);
		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
