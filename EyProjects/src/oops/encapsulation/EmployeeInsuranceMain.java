package oops.encapsulation;

public class EmployeeInsuranceMain {
	public static void main(String [] args) {
		
		EmployeeInsurance emp1 = new EmployeeInsurance("Akshay","Manager",80000);
		emp1.display();
		
		EmployeeInsurance emp2 = new EmployeeInsurance("Abhi","Programmer",35000);
		emp2.display();
		
		EmployeeInsurance emp3 = new EmployeeInsurance("Rahul","Associate",18000);
		emp3.display();
		
		EmployeeInsurance emp4 = new EmployeeInsurance("Brijesh","Housekeeper",4000);
		emp4.display();
		
	}
}
