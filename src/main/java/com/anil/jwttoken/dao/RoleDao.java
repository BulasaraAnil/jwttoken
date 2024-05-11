package com.anil.jwttoken.dao;

import org.springframework.data.repository.CrudRepository;

import com.anil.jwttoken.entity.Role;

public interface RoleDao extends CrudRepository<Role, String> {

}
