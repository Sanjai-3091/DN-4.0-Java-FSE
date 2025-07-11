package com.cognizant.jwt.controller;

import com.cognizant.jwt.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public String generateToken(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded);
            String[] values = credentials.split(":", 2);
            String username = values[0];
            String password = values[1];

            // You can replace this with your actual user validation
            if ("user".equals(username) && "pwd".equals(password)) {
                String token = jwtUtil.generateToken(username);
                return "{\"token\":\"" + token + "\"}";
            }
        }

        return "{\"error\":\"Invalid credentials\"}";
    }
}
