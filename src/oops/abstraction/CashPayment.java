package oops.abstraction;

public class CashPayment extends Payment{

	CashPayment(String customerName, String customerAddress) {
		super(customerName, customerAddress);
	}

	@Override
	public void doPayment(double amount) {
		display();
		System.out.println("Cash Payment done of Rs : "+amount+"\n");
	}
	

}
