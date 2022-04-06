package oops.interfaces.PaymentInterfaceDemo;

public class CashPaymentInterface implements PaymentInterface{

	@Override
	public void doPayment(double amount) {
		System.out.println(amount);
		
	}

}
