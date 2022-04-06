package conditionalStatements;

public class MaximumOfTwoNums {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1);
		System.out.println(num2);
		
		if(num1>num2) {
			System.out.println( num1 +" is greater ");
		} else {
			System.out.println(num2 +" is greater");
		}

	}

}
// if u are have problem while running open PositiveOrNegative.java to check how to run 