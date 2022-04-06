package loops;

import java.util.*;

public class Continue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		while(true) {
			System.out.println("Enter an Even Number ");
			num = s.nextInt();
			
			if(num%2!=0) {
				continue;
			} else {
				break;
			}
		}
		s.close();
		

	}

}
