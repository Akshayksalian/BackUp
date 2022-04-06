package practice.exception;

public class UserDefinedSalaryException {

	public static void main(String[] args) {
		
		try {
		checkSalary(452.2f);
		} catch(SalaryException s){
			System.out.println(s.getMessage());
		}

	}
	
	private static void checkSalary(float salary) {
		if(salary<5000) {
			throw new SalaryException("LowSalaryException "+salary);
		} else {
			System.out.println("No problem with salary");
		}
	}

}
