package loops;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int c=0;
		int num = s.nextInt();
		s.close();
		System.out.print("0 1");
		
		for(int i=2;i<num;i++) {
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}

}
