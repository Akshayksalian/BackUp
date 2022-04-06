package practice.handsOn7And8;

import java.util.HashSet;

public class Que4 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(5);
		hs.add(10);
		hs.add(15);
		hs.add(20);
		
		// Adding the duplicate element.
		hs.add(5);
		
		System.out.println(hs);
		// set will not accept duplicate element.
	}

}
