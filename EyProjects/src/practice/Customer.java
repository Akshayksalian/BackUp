package practice;

import java.util.*;

public class Customer {

	private String name;
	private String address;
	private int age;
	private List<Account> account; 
		
	public Customer(String name, String address, int age,List<Account> account) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.account = account;
	}
	
	Customer(){
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Name : "+getName()+" Age : "+getAge()+" Address :"+getAddress());
	}
	
	public String editAddress(String newAddress) {
		return this.address=newAddress;
	}
	
	
	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public void displayCustomerAndAccountDetails() {
		System.out.println("Name : "+getName()+" Age : "+getAge()+" Address :"+getAddress());
		Iterator<Account> itr = account.iterator();
		while(itr.hasNext()) {
			Account acct = itr.next();
			System.out.println(" Account Number : "+acct.getAccountNumber()+" Ifsc Code : "+acct.getIfscCode());
		}
	}
	
	public void  displayList() {
	}

}
