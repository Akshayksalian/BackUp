package practice.handsOn7And8;

import java.util.LinkedList;
import java.util.List;

public class Que2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		for(int i=numbers.size()-1;i>=0;i--) {
			System.out.println(numbers.get(i));
		}

	}

}
