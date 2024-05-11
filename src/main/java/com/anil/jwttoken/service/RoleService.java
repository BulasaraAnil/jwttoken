package com.anil.jwttoken.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.jwttoken.dao.RoleDao;
import com.anil.jwttoken.entity.Role;

@Service
public class RoleService {
	
	@Autowired
	RoleDao roleDao;
	
	
	public Role createNewRole(Role role) {
		return roleDao.save(role);
	}

}
