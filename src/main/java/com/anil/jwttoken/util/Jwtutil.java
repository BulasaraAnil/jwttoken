package com.anil.jwttoken.util;

import java.util.Date;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class Jwtutil {
	
	private static final String SECRET_KEY="Learn_programming_yourself";

	public String getUseNameFromToken(String token) {
		
		return getClaimFromToken(token,Claims::getSubject);
		
	}
	
	private <T> T getClaimFromToken(String token,Function<Claims, T> claimReslover) {
		Claims claims = getAllClaimsFromToken(token);
		return claimReslover.apply(claims);
	}
	
	private Claims getAllClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
	}
	
	public boolean validateToken(String token, UserDetails userDetails) {
		   final String useName = getUseNameFromToken(token);
		   return (useName.equalsIgnoreCase(userDetails.getUsername()) && !isTokenExpired(token));
		
		
	}
	
	private boolean isTokenExpired(String token) {
		 final Date expirationDate = getExpirationDateFromToken(token);
		 return expirationDate.before(new Date());
	}
	
	private Date getExpirationDateFromToken(String token) {
		return getClaimFromToken(token, Claims::getExpiration);
	}
}
