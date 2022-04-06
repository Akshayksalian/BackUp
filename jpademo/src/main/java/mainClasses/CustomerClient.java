package mainClasses;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import entities.oneToOne.Address;
import entities.oneToOne.Customer;


public class CustomerClient {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Address a = new Address();
		a.setStreet("2nd Main");
		a.setCity("Bangalore");
		a.setState("Karnataka");
		a.setZipCode("123456");
		Customer c = new Customer();
		c.setCustomerName("Akhsay");
		c.setAddress(a);
		
		//to add data into db
//		em.persist(c);
		
		Customer cust = em.find(Customer.class,2);
		
		em.getTransaction().commit();
		JPAUtil.cleanUp();
	}

}
