package com.sow.math;

import java.util.Scanner;

public class TestStaticBlock {
	static Boolean flag = false;
	static Scanner in = new Scanner(System.in);
	static int B = in.nextInt();
	static int H = in.nextInt();
	static {
		if ((B > 0) && (H > 0))
			flag = true;
		else
			try {
				throw new Exception("Breadth and height must be positive");
			} catch (Exception e) {
				System.out.println(e);
			}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}

}
