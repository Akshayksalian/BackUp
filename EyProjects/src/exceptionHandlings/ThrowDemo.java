package exceptionHandlings;

public class ThrowDemo {
	public static void main(String[] args) {
		ThrowDemo td = new ThrowDemo();

		/*
		 * Mainly used to throw Custom exception
		 * Custom exception handling.
		 */
		
		try {
		String s = null;
		td.errorDisplay(s);
		} catch(NullPointerException n) {
			System.out.println(n.getMessage());
		}
		
	}
	
	private void errorDisplay(String str) {
		if(str==null) {
			throw new NullPointerException("String is null : \"Custom error display\"");
		}
		if(str=="Hello") {
			System.out.println("Correct String");
		}
	}
}

