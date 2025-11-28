package com.somyu.spring_security.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JWTService {
    public String generateToken(String username) {

    Map<String, Object> claims = new HashMap<String, Object>();
    claims.put("username", username);

    return Jwts.builder()
            .setClaims(claims)
            .setSubject(username)
            .setIssuedAt( new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis()+ 1000*60*3))
            .signWith(getKey(), SignatureAlgorithm.HS256).compact();

    }

    private Key getKey() {
//        TO DO
        return null;
    }
}
