package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.entity.UserCredential;
import com.repository.UserCredentialRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserCredentialRepository userCredentialRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private String saveUser(UserCredential userCredential) {
		userCredential.setPassword(passwordEncoder.encode(userCredential.getPassword()));
		userCredentialRepository.save(userCredential);
		return "User Added";
		
	}

}
