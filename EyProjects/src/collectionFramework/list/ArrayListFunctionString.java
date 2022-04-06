package collectionFramework.list;

import java.util.*;

public class ArrayListFunctionString {

public static void main(String [] args) {
		
		// ArrayList of a type String.
		List<String> veg = new ArrayList<>();
		// LinkedList of type String.
		List<String> fruits = new LinkedList<>();		 	
		
		/*
		 * Notes:
		 * LinkedList saves lot of time while removing elements.
		 * vector is thread safe but not used much. 
		 * to create vector (List<Integer> v = new Vector<>();)
		 */
														
		// Adding Elements to the vegetable ArrayList.
		veg.add("Carrot");
		veg.add("Tommato");
		veg.add("Onion");
		veg.add("Beans");
		
		// To sort the list.
		Collections.sort(veg);	
		
		// Adding Elements to the fruit ArrayList.
		fruits.add("Mango");						
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Watermelon");
		
		
		// This helps to add all the elements from fruits to vegetable arrayList.
		veg.addAll(fruits);                  				
						
		
		// Prints the element which is in the position mentioned.  
		System.out.println(veg.get(5));					  		
		
		
		// Helps to change the value of the mentioned index number.
		veg.set(2,"Potato");
		System.out.println(veg);						
		
		
		// Removes the mentioned element from the arrayList using value or index.
		System.out.println("Removing");
		veg.remove(4);
		veg.remove("Carrot");
		System.out.println(veg);						
		
		
		// New arrayList creation.
		List<String> badVeg = new ArrayList<>();	 
		badVeg.add("Onion");
		badVeg.add("Beans");
		
		
		// Removing all elements present in badVeg arrayList.
		veg.removeAll(badVeg);						
		System.out.println(veg);
		
		
		// Size of the arrayList vegetable.
		System.out.println(veg.size());						
		
		
		// Contains check whether the element is present in the list or not
		System.out.println(veg.contains("Onion"));			
		
		
		// isEmpty let us know whether the list is empty or not
		System.out.println(veg.isEmpty());					
		
		
		// toArray has converted list to array (for integer we should use "Object[] object = veg.toArray();" )
		String[] arr = new String[veg.size()];
		veg.toArray(arr);									
		
		
		// Printing using for each loop.
		for(String x : arr) {
			System.out.println(x);
		}
		
		
		// Will clear the whole list
		veg.clear(); 										
		System.out.println(veg);
	}

}
