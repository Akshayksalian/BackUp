package com.jerseyspring.dao;

import java.util.List;

import com.jerseyspring.entities.User;

public interface UserDAO {
	
	public void addUser(User user);
	public List<User> findAllUsers();
	public User findUserById(int id);
	public void deleteUser(User user);
	public User updateUser(User user);

}
