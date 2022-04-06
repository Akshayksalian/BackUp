package oops.polymorphism;

public class MethodOverloading {
	public void sum(int a,int b)
	{
		int result = a+b;
		System.out.println("Sum is- :"+result);
	}
	public void sum(int a,int b,int c)
	{
		int result = a+b+c;
		System.out.println("Sum is- :"+result);
	}
	public void sum(int a,int b,int c,int d)
	{
		int result = a+b+c+d;
		System.out.println("Sum is- :"+result);
	}

	public static void main(String[] args) {
		MethodOverloading obj1 = new MethodOverloading();
		obj1.sum(14,13);
		obj1.sum(45,30,13);
		
		

	}

}
