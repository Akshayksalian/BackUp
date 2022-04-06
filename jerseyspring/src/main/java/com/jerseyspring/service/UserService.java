package com.jerseyspring.service;

import java.util.List;

import com.jerseyspring.entities.User;

public interface UserService {
	
	public void addUser(User user);
	public List<User> findAllUsers();
	public User findUserById(int id);
	public void deleteUser(int id);
	public User updateUser(User user);

}
