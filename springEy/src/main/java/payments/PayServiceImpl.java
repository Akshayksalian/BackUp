package payments;

public class PayServiceImpl implements PayService{	
	private Payment payment;
	private double amount;
	
	public PayServiceImpl(Payment payment,double amount){
		this.payment = payment;
		this.amount = amount;
	}
	
	public void performPayment() {
		payment.executePayment(amount);
	}

}
