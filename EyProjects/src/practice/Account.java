package practice;

public class Account {

	private String accountNumber;
	private int ifscCode;
	
	public Account(String accountNumber, int ifscCode) {
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}

	public Account() {
	}


	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number :"+getAccountNumber()+" Ifsc Code : "+getIfscCode());
	}
}
