package com.example.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.core.model.User;
import com.example.core.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		repository.save(user);
		return user;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		User dataUser = repository.findById(id).orElse(new User());
		return dataUser;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
		return true;
	}

	@Override
	public User updateOrReplaceUser(User user) {
		// TODO Auto-generated method stub
		this.repository.save(user);
		return user;
	}

	@Override
	public List<User> listOfUsers() {
		// TODO Auto-generated method stub
		List<User> responceUsers= (List<User>) this.repository.findAll();
		return responceUsers;
	}

}
