package exceptionHandlings;

public class NumberLessThan100 extends Exception{

	/**
	 * extending Exception makes this Checked exception.
	 */
	
	private static final long serialVersionUID = 1L;
	
	NumberLessThan100(){
		super();
	}
	
	NumberLessThan100(String msg){
		super(msg);
	}

	@Override
	public String toString() {
		return super.getMessage();
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
