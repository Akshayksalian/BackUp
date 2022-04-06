package com.jerseyspring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jerseyspring.dao.UserDAO;
import com.jerseyspring.entities.User;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	@Override
	@Transactional
	public void addUser(User user) {
		dao.addUser(user);
	}

	@Override
	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	@Override
	public User findUserById(int id) {
		return dao.findUserById(id);
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
		User u = findUserById(id);
		if (u == null) {
			throw new IllegalArgumentException("ID not found " + id);
		}
		dao.deleteUser(u);
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		User u = findUserById(user.getUserId());
		if (u == null) {
			throw new IllegalArgumentException("Id not Found " + user.getUserId());
		}
		u.setUserName(user.getUserName());
		return dao.updateUser(u);
	}

}
