package oops.classAndObjects;

public class Account {
	private String accNumber;
    private int ifscCode;
    
    
    Account(String accNumber, int ifscCode) {
    	this.accNumber = accNumber;
    	this.ifscCode = ifscCode;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public void display() {
		System.out.println("Account Number : "+getAccNumber()+"  Ifsc Code : "+getIfscCode());
	}
    
}
