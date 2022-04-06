package basics.operations;

public class UnaryOperations {
	public static void main(String [] args) {
		
		int x = 5;
		int y = 9;
		
		y = x++;
		System.out.println(y); // in post-fix the value of x is assigned first to y then operation of addition takes place
		System.out.println(x);
		
		int a = 5;
		int b = 9;
		
		b = --x;
		System.out.println(a); // in prefix the subtraction takes place first and then the x value is assigned to y 
		System.out.println(b);
		
	}

}
