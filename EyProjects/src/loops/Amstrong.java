package loops;
import java.util.*;
public class Amstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		int count=0;
		int i=a;
		while (i>0) {
			i=i/10;
			count++;		
		}
		double tot = 0;
	    i=a;
	    int j=0;
		while (i>0) {
			j=i%10;
			tot=tot+(Math.pow(j,count));
			i=i/10;
		}
		double ans = a;
		if (ans == tot) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not an Armstrong");
		}
	}

}
