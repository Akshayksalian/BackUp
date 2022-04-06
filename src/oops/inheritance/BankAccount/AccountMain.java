package oops.inheritance.BankAccount;

public class AccountMain {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(45154151,5000);
		sa.depositSavings(1000);
		System.out.println("--------------------");
		sa.withdrawSavings(500);
		System.out.println("----------------------");
		
		CurrentAccount ca = new CurrentAccount(15414254,8000);
		ca.depositCurrent(2000);
		System.out.println("---------------------");
		ca.withdrawCurrent(1000);
		System.out.println("-----------------------");
	}

}
