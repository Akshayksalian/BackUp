package exceptionHandlings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		Scanner s = null;
		
		try {
		s =	new Scanner(System.in);
		System.out.println("Enter the First Number = ");
		int a = s.nextInt();
		System.out.println("Enter the Second Number = ");
		int b = s.nextInt();
		
		int result = a/b;
		// once the error detected it won't execute the below statement.
		
		System.out.println("Result = " +result);
		} catch(ArithmeticException | InputMismatchException e){
			System.out.println(e.getMessage());
		
		/*
		 *  Multiple catch can be combined in one catch using this symbol | .
		 *  Parent Exception and child can't be combined.
 		 */
		
//		} catch(InputMismatchException i) {
//			System.out.println("Out of range "+i.getMessage());
			
		} catch(Exception e) {
			System.out.println("Out of range "+e.getMessage());
		} finally {
			System.out.println("I am Finally i will be called in any cost.");
			if(s!=null) 
				s.close();
		}
	}
}
