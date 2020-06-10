package com.sow.simple;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalTest {

	public static void main(String args[])
	{
		DecimalFormat df = new DecimalFormat("##.######");
		double d = (double)2/6;
		System.out.println(df.format(d));
	}
}
