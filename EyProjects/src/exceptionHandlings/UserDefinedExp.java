package exceptionHandlings;

public class UserDefinedExp {

	public static void main(String[] args) {
		
		try {
			checkForVoteEligibility(14);
		} catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checkNumber(50);
		} catch (NumberLessThan100 e) {
			System.out.println(e.getMessage());
		}

	}
	
	// Unchecked exception
	/*
	 * occurs during execution
	 * also called as runtime exception.
	 * Example to handle logical error like null or dividing by null.
	 */
	public static void checkForVoteEligibility(int age) {
		if(age<18) {
			throw new InvalidAgeException("InvalidAgeException "+age);
		} else {
			System.out.println("You can Vote");
		}
	}
	
	
	// Checked exception
	/*
	 * Forced to be handled or else it gives us a compile time error.
	 * Example : if we give file path it doesn't know whether the given path is present are not.
	 */
	public static void checkNumber(int num) throws NumberLessThan100{
		if(num<100) {
			throw new NumberLessThan100("NumberLessThan100 "+num);
		} else {
			System.out.println("Greater than 100");
		}
	}
}
