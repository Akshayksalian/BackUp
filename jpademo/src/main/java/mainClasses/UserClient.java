package mainClasses;

import javax.persistence.EntityManager;

import entities.oneToMany.Account;
import entities.oneToMany.User;



public class UserClient {

	public static void main(String[] args) {
		
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		User u = new User();
		u.setUserName("Akshay");
		
		Account acc = new Account();
		acc.setAccountNum("134232 34234");
		
		Account acc1 = new Account();
		acc1.setAccountNum("324234 423423");
		
		u.addAccount(acc);
		u.addAccount(acc1);
		
		em.persist(u);
		
		em.getTransaction().commit();
		JPAUtil.cleanUp();

	}

}
