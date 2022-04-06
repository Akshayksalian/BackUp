package com.jerseyspring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jerseyspring.entities.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addUser(User user) {
		em.persist(user);
	}

	@Override
	public List<User> findAllUsers() {
		List<User> users = em
				.createQuery("Select Distinct u from User u Left Join FETCH u.accounts a where u.userId = a.user.userId",
						User.class)
				.getResultList();
		return users;
	}

	@Override
	public User findUserById(int id) {

		User user = em.createQuery("SELECT u from User u JOIN FETCH u.accounts a where u.id =:id", User.class)
				.setParameter("id", id).getSingleResult();

		return user;
	}

	@Override
	public void deleteUser(User user) {	
		em.remove(user);
	}

	@Override
	public User updateUser(User user) {
		return em.merge(user);
	}

}
