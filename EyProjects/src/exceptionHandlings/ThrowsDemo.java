package exceptionHandlings;

import java.io.IOException;

public class ThrowsDemo {
	public static void main(String[] args) {
	
		/*
		 * throws can have one or more exception declared in a method.
		 * in throws exception should be handled by user.
		 * 
		 * Our code might be used by others and there is chance that code might problem which can give an error
		 * User might want there own message when error is occurred so throws is used.
		 */
		
		try {
			display();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	private static void display() throws IOException,NullPointerException{
		
	}
}
