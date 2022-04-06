package practice.handsOn7And8;

import java.util.HashSet;
import java.util.Set;

public class Que10 {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>(); 
		set1.add(8);
		set1.add(42);
		set1.add(24);
		set1.add(12);
		
		Set<Integer> set2 = new HashSet<>(); 
		set2.add(45);
		set2.add(24);
		set2.add(7);
		set2.add(84);
		set2.add(12);
		
		for(int x : set2) {
			if(set1.contains(x)) {
				System.out.println(x);
			}
		}

	}

}
