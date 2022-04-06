package conditionalStatements;

import java.util.*;

public class OperationsOnInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select the Operation to be done \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n");
		System.out.print("Please Select to proceed = ");
		int op = s.nextInt();
		System.out.println("You have selected option "+op+".");
		System.out.println("\nEnter two numbers = ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		s.close();
		
		switch(op){
			case 1 : System.out.println("Addition of two numbers is "+(num1+num2));
					break;
			case 2 : System.out.println("Subtraction of two numbers is "+(num1-num2));
					break;
			case 3 : System.out.println("Multiplication of two numbers is "+(num1*num2));
					break;
			case 4 :System.out.println("Division of two numbers is "+(num1/num2));
					break;
			default :System.out.println("Wrong Input");
		}

	}

}
