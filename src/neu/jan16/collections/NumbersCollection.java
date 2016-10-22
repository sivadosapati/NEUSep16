package neu.jan16.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class NumbersCollection {

	private static void findNumber(Integer number, Collection<Integer> numbers, String type) {
		long start = System.nanoTime();
		boolean b = numbers.contains(number);
		long end = System.nanoTime();
		long timeTaken = end - start;
		if (b == true) {
			System.out.println("Found in -> " + type + " ->" + timeTaken + " nanoseconds");
		}
	}

	private static Collection<Integer> makeBigCollection(Collection<Integer> numbers, String type) {
		for (int i = 10; i < 100000000; i += 10) {
			numbers.add(new Integer(i));
		}
		return numbers;
	}

	private static void displayNumbers(Collection<Integer> numbers, String type) {
		System.out.println(type);
		numbers.add(new Integer(10));
		numbers.add(new Integer(20));
		numbers.add(new Integer(30));

		numbers.add(new Integer(30));
		numbers.add(new Integer(5));
		numbers.add(new Integer(25));
		print(numbers);
		System.out.println("--------");

	}

	public static void main(String args[]) {
		displayNumbers(new ArrayList<Integer>(), "ArrayList");
		displayNumbers(new HashSet<Integer>(), "HashSet");
		displayNumbers(new LinkedHashSet<Integer>(), "LinkedHashSet");
		displayNumbers(new TreeSet<Integer>(), "TreeSet");

		Collection<Integer> list = makeBigCollection(new ArrayList<Integer>(), "ArrayList");
		Collection<Integer> hashSet = makeBigCollection(new HashSet<Integer>(), "HashSet");
		Collection<Integer> linkedHashSet = makeBigCollection(new LinkedHashSet<Integer>(), "LinkedHashSet");
		Collection<Integer> treeSet = makeBigCollection(new TreeSet<Integer>(), "TreeSet");

		findNumber(4500, list, "ArrayList");
		findNumber(4500, hashSet, "HashSet");
		findNumber(4500, linkedHashSet, "LinkedHashSet");
		findNumber(4500, treeSet, "TreeSet");

		Collection<Integer> numbers = makeCollection();
		numbers.add(new Integer(10));
		numbers.add(new Integer(20));
		numbers.add(new Integer(30));

		numbers.add(new Integer(30));
		numbers.add(new Integer(5));
		numbers.add(new Integer(25));
		print(numbers);
		// removeAllTheNumbersThatAreLessThanFifteen(numbers);
		// print(numbers);
		numbers.remove(new Integer(20));
		numbers.remove(1);
		// print(numbers);
		for (int i = 100; i < 10000; i += 10) {
			numbers.add(new Integer(i));
		}
		// print(numbers);
	}

	private static void removeAllTheNumbersThatAreLessThanFifteen(Collection<Integer> numbers) {

		Collection<Integer> itemsToBeDeleted = new ArrayList<Integer>();
		for (Integer number : numbers) {
			if (number.intValue() < 15)
				itemsToBeDeleted.add(number);
		}
		numbers.removeAll(itemsToBeDeleted);
		return;

	}

	private static Collection<Integer> makeCollection() {
		// return new ArrayList();
		// return new HashSet();
		return new LinkedHashSet<Integer>();
	}

	private static void print(Collection c) {
		System.out.println("Size -> " + c.size() + " -> " + c);

	}
}
