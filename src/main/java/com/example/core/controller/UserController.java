package com.example.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.model.User;
import com.example.core.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping("/")
	public String home() {
		
		return "User API";
	}
	
	@GetMapping(path="/user/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		User responseUser = userService.getUser(id);
		return Optional.of(responseUser);
	}
	
	@PostMapping(path="/user")
	public User createUser(@RequestBody User newUser){
		User responseUser = userService.createUser(newUser);
		return responseUser;
	}
	
	@PutMapping(path="/user")
	public User updateOrReplace(@RequestBody User clientUser) {
		User responseUser = userService.updateOrReplaceUser(clientUser);
		return responseUser;
	}
	
	@DeleteMapping(path="/user/{id}")
	public String deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
		return "User Deleted";
	}
	
	@GetMapping(path="/users")
	public List<User> listOfUsers(){
		List<User> users = userService.listOfUsers();
		return users;
	}
	
	
	
	
}
