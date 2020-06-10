package com.sow.general;

import com.sow.hackerRank.Test;

public class TestCallByValue {

	int data = 50;
	
	public void change(int data)
	{
		//comment the nxt line to check call by value
		data += data;
//		uncomment to check call by refernce
//		this.data += data;
	}
	
	public static void main(String [] args)
	{
		TestCallByValue obj = new TestCallByValue();
		System.out.println("before callling change value of data = " + obj.data);
		obj.change(500);
		System.out.println("after callling change value of data = " + obj.data);

	}
	
}
