package exceptionHandlings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WithMethodDemo {

	public static void main(String[] args) {
		
		try {
		takeUserInput();
		} catch(InputMismatchException i) {
			System.out.println(i.getMessage());
			// Giving one more chance to the user.
			takeUserInput();			
		} 

	}
	
	private static void takeUserInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number = ");
		int a = s.nextInt();
		System.out.println("Enter the Second Number = ");
		int b = s.nextInt();
		try {
		divide(a,b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Closing Scanner ");
			if(s!=null) {
				s.close();
			}
		}
	}

	private static void divide(int a,int b) {
		System.out.println(a/b);	
	}

}
