package com.sow.general;

/**
 * 
 * @author Sowmya
 *
 */
public class TestCallByValue {

	int data = 50;

	public void change(int data) {
		// comment the nxt line to check call by value
		data += data;
		// //uncomment to check call by reference
		// this.data += data;
	}

	public static void main(String[] args) {
		TestCallByValue obj = new TestCallByValue();

		System.out.println("before calling change value of data = " + obj.data);

		obj.change(500);

		System.out.println("after calling change value of data = " + obj.data);
	}

}
