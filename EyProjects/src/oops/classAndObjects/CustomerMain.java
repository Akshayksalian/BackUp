package oops.classAndObjects;

public class CustomerMain {

	public static void main(String[] args) {
		
		Account acc1 = new Account("4512 4513 4614",4571);
		Address addr1 = new Address("2nd Main","67th Cross","Bangalore","Karnataka",573561);
		Customer cust1 = new Customer("Akshay",addr1,"Hebbal",21,5431.12,acc1);
	
		cust1.display();
		
		// To display only the account class or address class display method separately details.
		// cust1.getAccount().display();
		cust1.getAddress().displayAddress();
		
		// To change the value of account
		Account acc2 = new Account("5514 4635 4653",7613);
		cust1.setAccount(acc2);
		
		System.out.println("After changing the account details");
		
		cust1.display();
	}

}
