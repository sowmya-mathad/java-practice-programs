package com.sow.hackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MarsMessage {

	// Complete the marsExploration function below.
	static int marsExploration(String str) {
		int num = 0;
		AtomicInteger splitCounter = new AtomicInteger(0);

		Collection<String> splittedStrings = str.chars().mapToObj(_char -> String.valueOf((char) _char))
				.collect(Collectors.groupingBy(stringChar -> splitCounter.getAndIncrement() / 3, Collectors.joining()))
				.values();
		splittedStrings.stream()	.forEach(System.out :: println);
		return num;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		int result = marsExploration(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
