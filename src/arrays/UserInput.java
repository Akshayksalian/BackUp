package arrays;

import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of inputs = ");
		int n = s.nextInt();
		int[] arr  = new int[n];
		
		System.out.println("Enter the numbers = ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		s.close();
		
		System.out.println("The Numbers u have entered is :");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
	}

}
