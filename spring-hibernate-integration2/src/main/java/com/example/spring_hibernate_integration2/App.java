package com.example.spring_hibernate_integration2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_hibernate_integration2.model.Customer;
import com.example.spring_hibernate_integration2.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service=context.getBean("customerService",CustomerService.class);
		
		//List<Customer> list = new ArrayList<Customer>();
		
		Customer theCustomer=service.createCustomer(new Customer("Adithi", "Warne", "shane@luv2code.com"));
		
		
		System.out.println(theCustomer);
    }
}
