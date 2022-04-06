package oops.inheritance.BankAccount;

public class SavingAccount extends Account{
	
	private double savDept;
	private double savWith;
	
	SavingAccount(long accNumber,double balance){
		super(accNumber,balance);
	}
	
	public double getSavDept() {
		return savDept;
	}

	public void setSavDept(double savDept) {
		this.savDept = savDept;
	}

	public double getSavWith() {
		return savWith;
	}

	public void setSavWith(double savWith) {
		this.savWith = savWith;
	}
	
	
	public void depositSavings(double amount) {
		 savDept = super.deposit(amount);
		 System.out.println("Intrest amount : "+calculateSaving(amount));
		 System.out.println("Balance Before intrest : "+savDept);
		 System.out.println("Available Balance : "+(savDept-calculateSaving(amount)));
	}
	
	public void withdrawSavings(double amount) {
		savWith = super.withdraw(amount);
		System.out.println("Intrest amount : "+calculateSaving(amount));
		System.out.println("Balance Before intrest : "+savWith);
		System.out.println("Available Balance : "+(savWith-calculateSaving(amount)));
	}
	
	public double calculateSaving(double bal) {
		return bal*0.04;
	}
	
}
