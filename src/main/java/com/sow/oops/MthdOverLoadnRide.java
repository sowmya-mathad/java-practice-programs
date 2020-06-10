package com.sow.oops;

public class MthdOverLoadnRide {
	public static void main(String[] args)
	{
		ABC obj = new ABC();
		obj.sum(3, 5);
		obj.sum(3, 5,7);
		
		DEF objDEF = new DEF();
		objDEF.sum(3.0f, 5.1f);

		objDEF.sum(3.0, 5.123);
	}
}

class ABC {
	int a = 0, b = 0, c = 0;

	void sum(int a, int b) {
		System.out.println("sum of a and b is : " + (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println("sum of a, b and c is : " + (a + b + c));
	}
}

class DEF extends ABC
{
	void sum(float a, float b)
	{
		System.out.println("sum of a and b is : " + (a + b));
	}
	void sum(double a, double b)
	{
		System.out.println("sum of a and b is : " + (a + b));
	}
}