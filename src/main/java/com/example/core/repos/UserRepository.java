package com.example.core.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.core.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
