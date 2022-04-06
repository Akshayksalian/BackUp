package collectionFramework.set;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<>();						
		Set<Integer> t = new HashSet<>();
		
		// Set<Integer> e = new LinkedHashSet<>();						
		// Set<Integer> h = new TreeSet<>();
		
		/*
		 * No duplicate is allowed
		 * it is hash based so it is unordered.
		 * In hashSet elements are not stored in inserted order.
		 * If we use LinkedHashSet it will store in inserted order.
		 * in tree it will store in sorted order.
		 */
		
		
		s.add(20);
		s.add(40);
		s.add(84);
		
		t.add(30);
		t.add(20);
		
		// Adds all the elements from the t set to s set
		s.addAll(t);												
		System.out.println(s);										
		
		// Tells the size of the set
		System.out.println(s.size());								
		
		// checks whether is set s elements contains the set t elements (Here its true because we have done operation addAll above).
		System.out.println(s.containsAll(t)); 						
		
		// Removes the mentioned element	
		s.remove(20);												
		System.out.println(s);										
		
		// Removes all from set s which are in the set t.
		s.removeAll(t);												
		System.out.println(s);
		
		// Prints the value of intersecting element (similar element present in the both the set).
		t.add(40);
		s.retainAll(t);												
		System.out.println(s);
		
		// Checks whether a particular element is present or what
		System.out.println(s.contains(40));                       	 
		
		// Empty is set will be present now.
		s.clear();													
		System.out.println(s); 		
		
		Iterator<Integer> it = t.iterator();	
		// hasNext() checks whether there is a next element present.
		while(it.hasNext()) {
			// next() will point out the current element.
			System.out.println(it.next());
		}
	
	}
}
