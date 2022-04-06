package collectionFramework.map;

import java.util.*;
import java.util.Map.Entry;

public class MapFunctions {
	
public static void main(String [] args) {
		
		Map<String,Integer> num = new HashMap<>();
		
//		Map<String,Integer> l = new LinkedHashMap<>();
//	   	Map<String,Integer> t = new TreeMap<>();
		
		/* 
		 * LinkedHashMap stored based on insertion.
		 * TreeMap sort based on the key 
		 */
		
		num.put("One",1);
		num.put("Two",2);
		num.put("Three",3);
		
		// This will not repeat the element in the hash map but changes the value of mentioned key.
		num.put("One",10);           								

		// Key one will be 10 only instead of being 10 because we have used put if absent function.
		num.putIfAbsent("One",1);									
		
		System.out.println(num);
		
		// This gives the value of key we mention.
		System.out.println(num.get("Two"));	 						
		
		// This will say whether a particular key is present or not.
		System.out.println(num.containsKey("Four"));	   			
		
		// This checks whether a particular value is present or not.
		System.out.println(num.containsValue(3)); 				  	
		
		// This will replace the value of a particular key.
		num.replace("One",1);
		System.out.println(num);									
		
		// This will replace the value only if the previous value is same as we mentioned.
		num.replace("Two",2,20);	
		System.out.println(num);									
		
		// This will remove particular Entry.
		num.remove("Two");
		System.out.println(num);									
		
		// This will only remove the entry only if the value is same as mentioned here.
		num.remove("Three",30);
		System.out.println(num);									
		
		// You get only Keys in form of set.
		System.out.println(num.keySet());							
		
		// You get all the values in the form of set.
		System.out.println(num.values()); 						 	
		
		// This gives all the entries in form of set.
		System.out.println(num.entrySet());       					
		
		// How to iterate to the entries
		Set<Entry<String,Integer>> entrySet = num.entrySet();				// Entry should be imported separately.
		for(Entry<String,Integer> ent : entrySet){							
			System.out.println((ent.getValue()+" "+ent.getKey()));
		}
		System.out.println(num);
		
		// iterating using set.
		Set<String> keys = num.keySet();
		for(String s : keys) {
			System.out.println("Key = "+s+" Values = "+num.get(s));
		}
		
		// iterating using iterator
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// iterating using collection.
		Collection<Integer> values = num.values();
		for(int s : values) {
			System.out.println(s);
		}
	}
}
