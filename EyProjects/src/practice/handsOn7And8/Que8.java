package practice.handsOn7And8;

import java.util.ArrayList;

public class Que8 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(3);
		a.add(65);
		a.add(42);
		a.add(34);
		a.add(75);
		
		int num = 42;
		
		if(a.contains(num)) {
			System.out.println("Found at index number = "+a.indexOf(num));
		} else {
			System.out.println("Not found");
		}
		
	}

}
