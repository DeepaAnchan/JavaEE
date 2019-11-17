package com.mycompany.spring_rest_application.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("dummy") && password.equals("dummy");
	}

}
