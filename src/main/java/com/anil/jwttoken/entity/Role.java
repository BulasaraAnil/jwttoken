package com.anil.jwttoken.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
	
	@Id
	private String roleName;
	private String roleDescrition;
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescrition() {
		return roleDescrition;
	}
	public void setRoleDescrition(String roleDescrition) {
		this.roleDescrition = roleDescrition;
	}
	
	

}
