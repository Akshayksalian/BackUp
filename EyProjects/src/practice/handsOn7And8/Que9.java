package practice.handsOn7And8;

import java.util.LinkedList;
import java.util.List;

public class Que9 {
	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		
		System.out.println("-------Before Inserting---------");
		System.out.println(numbers);
		// Index with the value.
		numbers.add(1,50);
		
		System.out.println("-------After Inserting---------");
		System.out.println(numbers);
	}

}
