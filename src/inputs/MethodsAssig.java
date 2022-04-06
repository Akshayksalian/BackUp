package inputs;

public class MethodsAssig {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("--------------Calculator--------------");
		System.out.println("Addition = "+cal.addition(10,30));
		System.out.println("Subtraction = "+cal.subtraction(50,10));
		System.out.println("Multiplication = "+cal.multiplication(4, 10));
		System.out.println("Division = "+cal.division(80,2));
		
		System.out.println("----------------Average----------------");
	
		Average average = new Average();
		
		System.out.println("Average of 4 numbers is "+average.avg(10,20,30,40));

	}
}
	
	class Calculator {
		
		public int addition(int a,int b) {
			return a+b;
		}
		
		public int subtraction(int a,int b) {
			return a-b;
		}
		
		public int multiplication(int a,int b) {
			return a*b;
		}
		
		public int division(int a,int b) {
			return a/b;
		}
		
		
	}
	
	class Average {
		
		public int avg(int a,int b, int c,int d) {
			int sum = a+b+c+d;
			return sum/4;
		}
	}

