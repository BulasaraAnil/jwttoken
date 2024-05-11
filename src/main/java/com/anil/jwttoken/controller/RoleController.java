package com.anil.jwttoken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anil.jwttoken.entity.Role;
import com.anil.jwttoken.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	RoleService roleService; 
	
	@PostMapping({"/createNewRole"})
	public Role createNewRole(@RequestBody Role role) {
		return roleService.createNewRole(role);
	}

}
