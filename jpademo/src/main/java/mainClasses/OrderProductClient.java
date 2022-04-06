package mainClasses;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.manyToMany.Order;
import entities.manyToMany.Product;


public class OrderProductClient {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAPersistence");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Product p1 = new Product();
		p1.setName("Laptop");
		p1.setPrice(75000);
		
		Product p2 = new Product();
		p2.setName("RAM");
		p2.setPrice(1400);
		
		Order o = new Order();
		o.setPurchaseDate(new Date());
		o.addProduct(p1);
		o.addProduct(p2);
		
		Order o1 = new Order();
		o1.setPurchaseDate(new Date());
		o1.addProduct(p2);
		
		em.persist(o);
		em.persist(o1);
		
		System.out.println("Added orders along with order details to database");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
