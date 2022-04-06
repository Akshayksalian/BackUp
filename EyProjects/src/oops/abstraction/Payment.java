package oops.abstraction;

public abstract class Payment {
	
	private String customerName;
	private String customerAddress;
	
	Payment(String customerName,String customerAddress){
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public void display() {
		System.out.println("Customer Name : "+this.customerName+" Customer Address : "+this.customerAddress);
	}
	
	public abstract void doPayment(double amount);
}
