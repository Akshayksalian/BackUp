package practice;

import java.util.*;

public class AccountCustomerMain {
	public static void main(String[] args) {
		
		
		List<Account> al = new ArrayList<>();
		Account a1 = new Account("4512 7845 9621",4521);
		Account a2 = new Account("7845 4513 9621",8356);
		al.add(a1);
		al.add(a2);
		
		Customer c1 = new Customer("Akshay","hebbal",21,al);
		c1.displayCustomerAndAccountDetails();
	}
}
