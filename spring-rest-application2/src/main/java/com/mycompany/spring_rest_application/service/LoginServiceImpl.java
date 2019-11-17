package com.mycompany.spring_rest_application.service;

import org.springframework.stereotype.Service;

import com.mycompany.spring_rest_application.model.Customer;

@Service
public class LoginServiceImpl implements LoginService{

	@Override
	public boolean validator(Customer theCustomer) {
		// TODO Auto-generated method stub
		
		if(theCustomer.getUserName().equals("dummy") && theCustomer.getPassword().equals("dummy") ) {
			return true;
		}
		
		return false;
	}

}
