package practice.exception;

public class SalaryException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public SalaryException(){
	}
	
	public SalaryException(String msg){
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
