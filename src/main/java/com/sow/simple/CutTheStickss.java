package com.sow.simple;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CutTheStickss {

	// Complete the cutTheSticks function below.
	static int[] cutTheSticks(int[] arr) {
		int cutLength = 0;
		int cutStickCount = 0;
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			cutStickCount = 0;
			cutLength = getSmallestCutLength(arr);
			if (cutLength != 0) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] >= cutLength) {
						arr[j] = (arr[j] - cutLength);
						cutStickCount++;
					}
				}
				arl.add(cutStickCount);
			}
		}
		int cutStickCountArr[] = new int[arl.size()];
		for (int i = 0; i < arl.size(); i++) {
			cutStickCountArr[i] = (int) arl.get(i);
		}

		return cutStickCountArr;
	}

	static int getSmallestCutLength(int arr[]) {
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[i] < smallest)
				smallest = arr[i];
			if (smallest == 0)
				smallest = arr[i];
		}
		
		return smallest;
	}

	static int cuttingSticks(int stickToBeCut, int lengthToBeCut, int counter) {
		if (stickToBeCut >= lengthToBeCut) {
			counter++;
			return cuttingSticks((stickToBeCut - lengthToBeCut), lengthToBeCut, counter);
		} else
			return counter;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int[] result = cutTheSticks(arr);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}