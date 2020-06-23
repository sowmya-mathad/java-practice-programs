package com.sow.hackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Program to check the absolute difference between the actual and reversed
 * string, if its equal then print "Funny" else print "Not Funny"
 * 
 * @author Sowmya
 *
 */
public class FunnyWords {
	static String funnyString(String s) {
		boolean isFunny = false;
		int len = s.length() - 1;
		int input[] = new int[len + 1];
		int ascii[] = new int[len + 1];
		int diff[] = new int[len + 1];
		int difference[] = new int[len + 1];

		for (int i = len; i >= 0; i--) {
			// convert the characters of given string into their respective ascii values
			input[i] = s.charAt(i);
			// Reverse the given string and convert characters of string into their
			// respective ascii values
			ascii[len - i] = s.charAt(i);
		}

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len;) {
				difference[i] = Math.abs(ascii[i] - ascii[j]);
				diff[i] = Math.abs(input[i] - input[j]);
				break;
			}
		}

		for (int i = 0; i < len; i++) {
			if (difference[i] != diff[i]) {
				isFunny = false;
				break;
			} else
				isFunny = true;
		}

		if (isFunny)
			return "Funny";
		else
			return "Not Funny";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			String result = funnyString(s);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}

}
