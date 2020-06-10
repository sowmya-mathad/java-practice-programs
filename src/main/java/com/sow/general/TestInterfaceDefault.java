package com.sow.general;


interface C
{
	void print(String str);
	default void msg()
	{
		System.out.println("Default method call");
	}
}
public class TestInterfaceDefault implements C{
	public static void main(String[] args)
	{
		TestInterfaceDefault objTestInterfaceDefault = new TestInterfaceDefault();
		objTestInterfaceDefault.print("Interface Default method example..");
		objTestInterfaceDefault.msg();
	}

	@Override
	public void print(String str) {
		System.out.println(str);
		
	}

}
