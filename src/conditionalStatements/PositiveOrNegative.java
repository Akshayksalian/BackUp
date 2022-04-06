package conditionalStatements;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);         	// input is given using cmd from eclipse itself
														// to run "right click" on screen select "run as" then "run configuration" select "ur file in left corner" press "arguments" then put u r inputs in "program arguments"
	
		System.out.println(num1);
		
		if(num1>0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}

	}

}
