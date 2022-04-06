package practice.handsOn7And8;

import java.util.*;
import java.util.Map.Entry;

public class Que12 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>(); 
		
		hm.put(1,"One");
		hm.put(2,"Two");
		hm.put(3,"Three");
		hm.put(4,"Four");
		hm.put(5,"Five");
		
		System.out.println("---------Before Sorting------------");
		System.out.println(hm);
		List<Map.Entry<Integer,String>> list = new ArrayList<>(hm.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<Integer,String>> (){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		System.out.println("---------After Sorting by values------------");
		for(Map.Entry<Integer, String> x : list ) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
				
	}

}
