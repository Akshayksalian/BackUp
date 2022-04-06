package oops.classAndObjects;

public class Customer {
	private String name ;
	private Address address;
	private int age;
	private double balance;
	private Account account;
	
	Customer(String name,Address address,String string, int age,double balance,Account account){
		this.name = name;
		this.address = address;
		this.age = age;
		this.balance = balance;
		this.account = account;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("Name : "+getName()+"   Age : "+getAge()+"   Balance : "+getBalance()+ 
				"   Account number : "+getAccount().getAccNumber()+"   Ifsc Code : "+getAccount().getIfscCode());
			
	}
	
	
	public String editAge(int age) {
		setAge(age);
		return "Age Updated";
	}
	

}
