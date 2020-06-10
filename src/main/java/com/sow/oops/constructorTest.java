package com.sow.oops;

public class constructorTest {

	public static void main(String[] args) {
		Test testObj = new Test();
		Test testObj1 = new Test("Sowmya");
	}

}

class Test
{
	Test()
	{
		System.out.println("this is Test contructor");
	}
	Test(String str)
	{
		System.out.println("This is Test contructor's String value : " + str);
	}
}