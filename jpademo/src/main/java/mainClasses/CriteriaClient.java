package mainClasses;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import entities.oneToMany.Account;
import entities.oneToMany.User;

public class CriteriaClient {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		Root<User> root = criteria.from(User.class);
		criteria.select(root);

//		// Select all users
//		TypedQuery<User> query = em.createQuery(criteria);
//		List<User> result = query.getResultList();
//		for (User u : result) {
//			System.out.println("Id: " + u.getUserId());
//			System.out.println("Name: " + u.getUserName());
//		}

//		// Select with Where Condition.
//		criteria.where(builder.equal(root.get("userName"), "Akshay"));
//		User u = em.createQuery(criteria).getSingleResult();
//		System.out.println("Id:" + u.getUserId());
//		System.out.println("Name: " + u.getUserName());
		
//		// Aggregate function count
//		CriteriaQuery<Long> criteriaQuery = builder.createQuery(Long.class);
//		Root<User> root1 = criteriaQuery.from(User.class);
//		criteriaQuery.select(builder.count(root1));
//		TypedQuery<Long> q = em.createQuery(criteriaQuery);
//		Long count = q.getSingleResult();
//		System.out.println(count);
		
//		//Fetch (Something wrong)
//		Fetch<User,Account> userAccountFetch = root.fetch("accounts",JoinType.LEFT);
//		// cast to join required here
//		criteria.where(builder.equal(((Join<User, Account>) userAccountFetch).get("acct_no"),"324234 423423"));
//		User u = em.createQuery(criteria).getSingleResult();
//		System.out.println("Id:" + u.getUserId());
//		System.out.println("Name: " + u.getUserName());
//		for(Account a : u.getAccounts()) {
//			System.out.println("Account number:"+a.getAccountNum());
//		}

		em.getTransaction().commit();
		JPAUtil.cleanUp();
	}

}
