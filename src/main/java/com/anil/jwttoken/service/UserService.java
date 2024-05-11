package com.anil.jwttoken.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.jwttoken.dao.UserDao;
import com.anil.jwttoken.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public User registerNewUser(User user) {
		return userDao.save(user);
	}

}
