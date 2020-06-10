package com.sow.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {
	public static void main(String args[])
	{
		List<String> listName = new ArrayList<String>();
		listName.add("sowmya");
		listName.add("shreyansh");
		listName.add("girish");
		listName.add("dad");
		listName.add("mom");
		
		System.out.println("---- using iterator");
		Iterator<String> itr = listName.iterator();
		while(itr.hasNext())
				System.out.println(itr.next());
		
		System.out.println("---- using for");
		for(String str : listName)
				System.out.println(str);
		
		System.out.println("---- using for-each using lamda");
		listName.forEach(a->{System.out.println(a);});
		
		System.out.println("---- using forEachRemaining");
		itr = listName.iterator();
		itr.forEachRemaining(a->{System.out.println(a);});
		
		System.out.println("---- using listIterator with previous");
		ListIterator<String> itrList = listName.listIterator(listName.size());
		while(itrList.hasPrevious())
			System.out.println(itrList.previous().toString());

		System.out.println("---- using listIterator with next");
		 itrList = listName.listIterator();
		while(itrList.hasNext())
			System.out.println(itrList.next().toString());


	}
}
