package oops.interfaces.PaymentInterfaceDemo;

public class PaymentInterfaceMain {

	public static void main(String[] args) {
		
		pay(new CashPaymentInterface(),5451);
		pay(new UpiPaymentInterface(),4515);
		
	}
	
	public static void pay(PaymentInterface payment,double amount) {
		payment.doPayment(amount);
	}
}
