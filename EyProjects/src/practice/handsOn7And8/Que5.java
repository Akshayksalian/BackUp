package practice.handsOn7And8;

import java.util.HashMap;

public class Que5 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1,"One");
		hm.put(2,"Two");
		hm.put(3,"Three");
		hm.put(4,"Four");
		
		// Adding the duplicate element.
		hm.put(2,"Two");
		
		System.out.println(hm);
		// HashMap will not accept duplicate element.
	}

}
