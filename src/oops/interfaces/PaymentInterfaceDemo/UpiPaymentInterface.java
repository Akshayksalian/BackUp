package oops.interfaces.PaymentInterfaceDemo;

public class UpiPaymentInterface implements PaymentInterface{

	@Override
	public void doPayment(double amount) {
		System.out.println(amount);
		
	}

}
