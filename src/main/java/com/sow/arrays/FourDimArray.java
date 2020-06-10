package com.sow.arrays;

public class FourDimArray {

	public static void main(String abc[]) {
		int arr1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int rowCount = arr1.length;
		int colCount = arr1[0].length;

		System.out.println("=======================================");
		System.out.println(" Array Traversal  from left to right.");
		System.out.println("=======================================");

		for (int i = 0; i < rowCount; i++) {
			System.out.println();
			for (int j = 0; j < colCount; j++) {
				System.out.print(" " + arr1[i][j] + "  ");
			}
		}

		System.out.println("\n=======================================");
		System.out.println(" Array Traversal  from right to left.");
		System.out.println("=======================================");

		for (int i = rowCount - 1; i >= 0; i--) {
			System.out.println();
			for (int j = colCount - 1; j >= 0; j--) {
				System.out.print(" " + arr1[i][j] + "  ");
			}
		}

		System.out.println("\n=======================================");
		System.out.println(" Array Traversal  from top left to right diagnal.");
		System.out.println("=======================================");

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				if (i == j)
					System.out.print(" " + arr1[i][j] + "  ");
			}
		}
		System.out.println();
		for (int i = 0; i < rowCount; i++) {
					System.out.print(" " + arr1[rowCount - i - 1][i] + "  ");
		}
	}
}
