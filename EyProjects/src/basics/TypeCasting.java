package basics;

public class TypeCasting {

	public static void main(String[] args) {
	
		
		/* Widening primitive conversion
		 * conversion happens automatically
		 * from int to long or long to double.
		 */
		
		int i = 10;
		double d = i;
		long l = i;
		System.out.println(i+" "+d+" "+l);
		
		/*
		 * Narrowing primitive conversion
		 * from double to int
		 * data will be lost because decimal value can't be hold by int
		 */
		
		double f = 2.45;
		int h = (int)f;
		System.out.println(h);
		
		/*
		 * Automatic Numeric promotion.
		 */
		
		byte b1 = 10;
		byte b2 = 20;
		
		// byte can hold till 127 even though it is not allowed to add in byte.
		// byte b3 = b1+b2;
		// Automatically promoted to int.
		int c = b1+b2;
		System.out.println(c);
		
		/*
		 * Widening reference type conversion
		 */
		
		// Parent object A is holding new object of b; 
		A obj = new B(); 
		System.out.println(obj);
		
		A a = new A();
		B b = new B();
		a=b;  				
		//b=a  (b is not equal to a).
		
		
		/* 
		 * Narrowing reference type conversion.
		 */
		
		b = (B)a;
		
		// Example for Narrowing reference.
		a.display();
		b.display();
		b.test();
		((B)a).test();				// type casting.

	}

}

class A{
	int i;
	void display() {
		System.out.println("Hello");
	}
}

class B extends A {
	int j;
	void test() {
		System.out.println("Test");
	}
}
