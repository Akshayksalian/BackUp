package collectionFramework.list;

import java.util.*;

public class ArrayListFunctions {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		/*
		 * ArrayList
		 * Order is maintained in list.
		 * Duplicate is allowed.
		 * null values are  allowed.
		 */
		
		// To add into arrayList.
		numbers.add(10);
		numbers.add(20);
		
		// To sort the list.
		Collections.sort(numbers);		
		
		// To get the size.
		System.out.println("Size of the arrayList is = "+numbers.size());
		
		// Print the list directly.
		System.out.println(numbers);
		
		// To print using for each.
		for(int x : numbers) {
			System.out.println("Elements in ArrayList = "+x);
		}
		
		// To print using traditional for loop.
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		// ArrayList to Array
		Object[] arr = numbers.toArray();
		for(Object y : arr) {
			System.out.println(y);
		}
	}

}
