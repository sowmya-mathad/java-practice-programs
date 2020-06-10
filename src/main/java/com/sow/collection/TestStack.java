package com.sow.collection;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {
	public static void main(String abc[]) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(30);
		stk.push(40);
		stk.push(20);

		Iterator<Integer> itr = stk.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		stk.pop();
		System.out.println("After pop: ");
		itr = stk.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}
}
