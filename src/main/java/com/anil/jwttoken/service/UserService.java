package com.anil.jwttoken.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.jwttoken.dao.RoleDao;
import com.anil.jwttoken.dao.UserDao;
import com.anil.jwttoken.entity.Role;
import com.anil.jwttoken.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	RoleDao roleDao;
	
	public User registerNewUser(User user) {
		return userDao.save(user);
	}
	
	public void initRoleAndUser() {
		Role adminRole = new Role();
		adminRole.setRoleName("Admin");
		adminRole.setRoleDescrition("Admin role");
		roleDao.save(adminRole);
		
		Role userRole = new Role();
		userRole.setRoleName("User");
		userRole.setRoleDescrition("Default role for newly created record");
		roleDao.save(userRole);
		
		User adminUser = new User();
		adminUser.setUserFirstName("admin");
		adminUser.setUserLastName("admin");
		adminUser.setUserName("admin123");
		adminUser.setUserPassword("admin@pass");
		Set<Role> adminRoles =  new HashSet<>();
		adminRoles.add(adminRole);
		adminUser.setRole(adminRoles);
		userDao.save(adminUser);
		
		User user = new User();
		user.setUserFirstName("raj");
		user.setUserLastName("sharma");
		user.setUserName("raj123");
		user.setUserPassword("raj@pass");
		Set<Role> userRoles =  new HashSet<>();
		userRoles.add(userRole);
		user.setRole(userRoles);
		userDao.save(user);
	}

}
