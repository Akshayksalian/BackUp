package oops.inheritance.BankAccount;

public class Account {
	
	private long accNumber; 
	private double balance;
	
	Account(long accNumber,double balance){
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double adding) {
		return this.balance + adding;
	}
	
	public double withdraw(double sub) {
		return this.balance - sub;
	}
	

}
