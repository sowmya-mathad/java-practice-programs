package com.sow.java8Featr;

interface Addable
{
	public int add2Num(int a, int b);
}
public class LamdaExpressionEx3 {
	public static void main(String args[])
	{
		Addable objAddable = (a,b) -> (a+b);
		System.out.println(objAddable.add2Num(2, 3));
		
		Addable objAddable1 = (int a,int b) -> {return (a+b);};
		System.out.println(objAddable1.add2Num(12, 3));
	}
}
