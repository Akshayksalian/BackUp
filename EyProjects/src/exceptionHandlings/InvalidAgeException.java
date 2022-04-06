package exceptionHandlings;

public class InvalidAgeException extends RuntimeException{
	
	/*
	 * Extending the RunTimeException will make this Unchecked Exception.
	 */
	
	private static final long serialVersionUID = 1L;
	
	InvalidAgeException(){
		super();
	}
	
	InvalidAgeException(String msg){
		super(msg);
	}
	
	@Override
	public String toString() {
		return super.getMessage();
	}

	@Override
	public String getMessage() {;
		return super.getMessage();
	}
	
}
