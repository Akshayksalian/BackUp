package practice.handsOn7And8;

import java.util.ArrayList;
import java.util.List;

public class Que1 {

	public static void main(String[] args) {
		
		List<String> names= new ArrayList<>();
		
		names.add("Akshay");
		names.add("Brijesh");
		names.add("Dinesh");
		names.add("Rahul");
		
		for(String x : names) {
			System.out.println(x);
		}
	}

}

