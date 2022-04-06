package exceptionHandlings.practiceQue;


public class HierarchyExceptions {
	

	public static void main(String[] args) {

		try {
			checkVoteEligibity(11);
//			belowZero(5);
//			nullCheck(null);
		}
		// Aexception is parent of B and C so only AException can handel all the Execption of B and C.
		catch(AException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkVoteEligibity(int n) throws AException{
		
		if(n<18) {
			throw new AException();
		}
		System.out.println(n+" Eligible");
		
	}
	
	public static void belowZero(int n) throws BException{
		
		if(n<0) {
			throw new BException();
		}
		System.out.println(n+" is above 0");
	}
	
	public static void nullCheck(String n) throws CException{
		
		if(n==null) {
			throw new CException();
		}
		System.out.println("Not null");
	}
}

class AException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return getMessage();
	}
	
	@Override
	public String getMessage() {
		return "Not Eligible for Voting";
	}
	
}

class BException extends AException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return getMessage();
	}
	
	@Override
	public String getMessage() {
		return "Below 0";
	}
	
}

class CException extends BException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return getMessage();
	}
	
	@Override
	public String getMessage() {
		return "Null Exception";
	}
	
}