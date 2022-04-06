package inputs;

import java.util.*;

public class WhichInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Value = ");
		
		while(!s.hasNext("exit")) {
			if(s.hasNextInt()) {
				System.out.println("You entered Int = "+s.nextInt());
			} else if(s.hasNextDouble()) {
				System.out.println("You entered Double = "+s.nextDouble());
			} else if(s.hasNextBoolean()) {
				System.out.println("You entered boolean = "+s.nextBoolean());
			} else {
				System.out.println("You entered String = "+s.nextLine());
			}
		}
		s.close();

	}

}
