package com.example.core.service;

import java.util.List;

import com.example.core.model.User;

public interface UserService {

	public User createUser(User user);
	
	public User getUser(int id);
	public boolean deleteUser(int id);
	public User updateOrReplaceUser(User user);
	
	public List<User> listOfUsers();
	
}
