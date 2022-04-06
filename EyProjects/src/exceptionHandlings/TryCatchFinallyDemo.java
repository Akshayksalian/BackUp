package exceptionHandlings;
import java.util.*;
public class TryCatchFinallyDemo {

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
		} catch(ArithmeticException e){
			System.out.println(e.getMessage());
		} catch(InputMismatchException i) {
			System.out.println("Out of range "+i.getMessage());
		} finally {
			System.out.println("I am Finally i will be called in any cost.");
			if(s!=null) 
				s.close();
		}
		
		/*
		 * try{
		 * } catch {
		 * }
		 * 
		 * or 
		 * 
		 * try{
		 * } finally {
		 * }
		 * 
		 * Only try wont work.
		 * There can be nested try catch .
		 */
		
		System.out.println("Displayed after handling");
		

	}

}
