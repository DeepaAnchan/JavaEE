package com.example.spring_hibernate_integration2.dao;

import java.util.List;

import com.example.spring_hibernate_integration2.model.Customer;

public interface CustomerDao {
	public Customer createCustomer(Customer theCustomer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerByid(int id);
	public List<Customer> getCustomerByFirstName(String firstName);
	
	public Customer updateCuastomer(String firstName,String lastName,String email,int id);
}
