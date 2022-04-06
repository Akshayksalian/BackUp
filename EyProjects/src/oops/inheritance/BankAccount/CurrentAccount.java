package oops.inheritance.BankAccount;

public class CurrentAccount extends Account{
	
	private double curDept;
	private double curWith;
	
	CurrentAccount(long accNumber,double balance){
		super(accNumber,balance);
	}
	
	public double getCurDept() {
		return curDept;
	}

	public void setCurDept(double curDept) {
		this.curDept = curDept;
	}

	public double getCurWith() {
		return curWith;
	}

	public void setCurWith(double curWith) {
		this.curWith = curWith;
	}
	
	public void depositCurrent(double amount) {
		 curDept = super.deposit(amount);
		 System.out.println("Intrest amount : "+calculateCurrent(amount));
		 System.out.println("Balance Before intrest : "+curDept);
		 System.out.println("Available Balance : "+(curDept-calculateCurrent(amount)));
	}
	
	public void withdrawCurrent(double amount) {
		curWith = super.withdraw(amount);
		System.out.println("Intrest amount : "+calculateCurrent(amount));
		System.out.println("Balance Before intrest : "+curWith);
		System.out.println("Available Balance : "+(curWith-calculateCurrent(amount)));
	}
	
	public double calculateCurrent(double bal) {
		return bal*0.1;
	}
	

}
