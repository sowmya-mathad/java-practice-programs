package com.sow.strings;

public class CamelcaseTest {
	public static void main(String args[]) {
		String s ="tellMeWhatYouWant";
		int counter=1;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
				counter++;
		}
		System.out.println(counter);
	}
}
