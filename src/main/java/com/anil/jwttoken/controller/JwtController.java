package com.anil.jwttoken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.anil.jwttoken.service.JwtService;

@RestController
@CrossOrigin
public class JwtController {
	
	@Autowired
	JwtService jwtService;
	
	public void createJwtToken() {
		
	}

}
