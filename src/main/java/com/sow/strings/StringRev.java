package com.sow.strings;

/**
 * program to reverse the string without interchanging the position of special characters
 *
 * @author Sowmya
 *
 */
public class StringRev {

	public static void main(String args[]) {

		// Special Character ASCII
		// 32–47 / 58–64 / 91–96 / 123–126

		String inputStr = "a,b$c";
		int len = inputStr.length() - 1;
		char[] tempArray = new char[len + 1];

		for (int i = len; i >= 0; i--) {
			int ascii = (int) inputStr.charAt(i);

			if ((ascii >= 32 && ascii <= 47) || (ascii >= 58 && ascii <= 64) || (ascii >= 91 && ascii <= 96)
					|| (ascii >= 123 && ascii <= 126)) {
				tempArray[i] = inputStr.charAt(i);
			} else {
				tempArray[len - i] = inputStr.charAt(i);
			}
		}

		System.out.print(tempArray);

	}

}
