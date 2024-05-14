package com.anil.jwttoken.configuration;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		final String header = request.getHeader("Authorization");
		
		String jwtToken = null;
		if(header!=null && header.startsWith("bearer ")) {
			jwtToken = header.substring(7);
			
			try {
				
			} catch (IllegalArgumentException e) {
				System.out.println("Unable to get the JWT Token");
			}catch (ExpiredJwtException e) {
				System.out.println("Jwt Token is expired");
			}
			
		}
		
	}

}
