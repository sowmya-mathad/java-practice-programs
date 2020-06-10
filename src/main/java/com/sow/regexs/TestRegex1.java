package com.sow.regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex1 {
	public static void main(String [] args)
	{
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		
		boolean b1 = Pattern.compile(".s").matcher("sowmya").matches();
		boolean b2 = Pattern.matches(".a", "ya");
		System.out.println(b + "\n" + b1 + "\n" + b2);
		
		
		
	}
}
