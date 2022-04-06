package oops.abstraction;

public class PaymentMain {

	public static void main(String[] args) {
		
		/*
		 * 		Payment pay = new Payment       Instance of this abstract class can't be created because that class will be incomplete.
		 */
		
		Payment pay ;									// Parent object can be used to create the object of child class.
		pay = new UpiPayment("Akshay","Bangalore");
		pay.doPayment(5421.12);					
		
		pay = new CashPayment("Brijesh","Up");
		pay.doPayment(453413.21);
		
		
		// Another way to create object and print using method
		
		payMethod(new UpiPayment("Rahul","Ap"),521.15);
		
		
	}
	
	private static void payMethod(Payment payment,double amount) {
		payment.doPayment(amount);
	}

}
