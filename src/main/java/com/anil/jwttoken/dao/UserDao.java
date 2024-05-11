package com.anil.jwttoken.dao;

import org.springframework.data.repository.CrudRepository;

import com.anil.jwttoken.entity.User;

public interface UserDao extends CrudRepository<User, String> {

}
