package loops;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		for(int i=1;i<=n;i++) {
			PrimeChecking(i);
		}
		

	}
	
	public static void PrimeChecking(int i) {
		int count = 0 ;
		for(int j=2;j<=i-1;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(i);
		}
	}
}
