package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(7,5,81,2,44,2,4,3);
		System.out.println("--------Original List---------");
		System.out.println(myList);
		
//		Stream<Integer> s = myList.stream().distinct();
		List<Integer> distinctList = myList.stream().distinct().collect(Collectors.toList());
		
		distinctList.stream().forEach(System.out::println);
		
		// count returns long so 
		long count = myList.stream().count();
		System.out.println("Count i = "+count);
		
		// maximum and minimum.
		// in class integer there is a compare method.
		Optional<Integer> m = myList.stream().max(Integer::compare);
		Optional<Integer> n = myList.stream().min(Integer::compare);
		if(n.isPresent()) {
			System.out.println("Minimum value = "+n.get());
			System.out.println("Maximum value = "+m.get());
		}
		
		// Checks for the predicate condition and filter based on that.
		List<Integer> filteredList = myList.stream().filter(a->a>10).collect(Collectors.toList());
		System.out.println(filteredList);
		
		// sorting ascending using lambda
		List<Integer> sortedListAsc =  myList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedListAsc);
		
		//Sorting decending
		List<Integer> sortedListDec =  myList.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println(sortedListDec);
		
		// sum of list using reduce.
		Optional<Integer> s = myList.stream().reduce((a,b)->a+b);
		/*
		 * reduce works
		 * 7+5 , 81,2,44.......
		 * 12+81 , 2,44......
		 */
		System.out.println(s.get());
		
	}
}
