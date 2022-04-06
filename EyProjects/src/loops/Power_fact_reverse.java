package loops;

import java.util.*;

public class Power_fact_reverse {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Number =");
		int num = s.nextInt();
		System.out.print("Enter the Power = ");
		int pow = s.nextInt();
		System.out.println(num+" power "+pow+" is "+getExponents(num,pow));
		System.out.println("---------------------------------------------");
		
		System.out.println("Enter the number to be factorized = ");
		int f = s.nextInt();
		System.out.println("Factorial of "+f+" is "+factorial(f));
		System.out.println("---------------------------------------------");
		
		System.out.println("Enter the number to be reversed");
		int r = s.nextInt();
		System.out.println("Reverse of "+r+" is "+reverse(r));
		s.close();
	}
	
	public static int getExponents(int n,int p) {
		
		int result = n;
		for(int i=1;i<p;i++) {
			result*=n;
		}
		
		return result;
	}
	
	public static int factorial(int num) {
		
		int ans=num;
		
		for(int i=num-1;i>0;i--) {
			ans*=i;
		}
		
		
		return ans;
	}
	
	public static int reverse(int num) {
		
		int rev = 0;
		
		while(num!=0) {
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		return rev;
	}

}
