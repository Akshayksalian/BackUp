package basics.operations;

public class TernaryOperations {

	public static void main(String[] args) {
		
		int salary = 15000;
		
		int increment =  (salary>5000) ? ((salary *10)/100) : ((salary*20)/100);

		System.out.println("Salary after increment is = "+(increment+salary));
	}

}
