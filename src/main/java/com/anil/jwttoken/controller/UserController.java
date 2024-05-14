package com.anil.jwttoken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anil.jwttoken.entity.User;
import com.anil.jwttoken.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping({"/registerNewUser"})
	public User registerNewUser(@RequestBody User user) {
		return userService.registerNewUser(user);
	}
	
	@javax.annotation.PostConstruct
	public void initRolesAndUsers() {
		userService.initRoleAndUser();
	}
	
	@GetMapping({"/forAdmin"})
	public String forAdmin() {
		return "The URL is only accessable for Admin";	
		}

	@GetMapping({"/forUser"})
	public String forUser() {
		return "The URL is only accesable for User";
	}
}
