package com.sow.hackerRank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomSetEx {

	public static void main(String[] args) {
		RandomizedSet obj = new RandomizedSet();
		boolean param_1 = obj.insert(0);
		boolean param_2 = obj.remove(11);
		int param_3 = obj.getRandom();

		System.out.println("param_1: " + param_1 + " param_2: " + param_2 + " param_3: " + param_3);
	}

}

class RandomizedSet {

	Set<Integer> intHashSet = null;

	/** Initialize your data structure here. */
	public RandomizedSet() {
		intHashSet = new HashSet<Integer>();
		intHashSet.add(1);
		intHashSet.add(2);
		intHashSet.add(3);
		intHashSet.add(4);
		intHashSet.add(5);
		intHashSet.add(6);
		intHashSet.add(7);
		intHashSet.add(8);
		intHashSet.add(9);
		intHashSet.add(10);
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {

		if (intHashSet.contains(val))
			return false;
		else {
			intHashSet.add(val);
			return true;
		}
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	public boolean remove(int val) {

		if (intHashSet.contains(val)) {
			intHashSet.remove(val);
			return true;

		} else
			return false;
	}

	/** Get a random element from the set. */
	public int getRandom() {

		// Generate a random number using nextInt method of the Random class
		Random random = new Random();

		// this will generate a random number between 0 and HashSet.size - 1
		int randomNumber = random.nextInt(intHashSet.size());

		// get an iterator
		Iterator<Integer> iterator = intHashSet.iterator();

		int currentIndex = 0;
		Integer randomElement = null;

		// iterate the HashSet
		while (iterator.hasNext()) {

			randomElement = (Integer) iterator.next();

			// if current index is equal to random number
			if (currentIndex == randomNumber)
				return randomElement;

			// increase the current index
			currentIndex++;
		}

		return randomElement;

	}
}