package oops.abstraction;

public class UpiPayment extends Payment{

	UpiPayment(String customerName, String customerAddress) {
		super(customerName, customerAddress);
	}

	@Override
	public void doPayment(double amount) {
		display();
		System.out.println("Upi Payment done of Rs : "+amount+"\n");
	}

}
