package com.mycompany.spring_rest_application.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.spring_rest_application.model.Customer;
import com.mycompany.spring_rest_application.service.LoginService;
import com.mycompany.spring_rest_application.service.LoginServiceImpl;


@Controller
public class HomeController {


	@Autowired
	private LoginServiceImpl loginService;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	} 
	
	@GetMapping("/login")
	public String displayLoginForm(Model theModel) {
		
		Customer customer = new Customer();
				
		theModel.addAttribute("customer", customer);
				
		return "login-form";	
	}
	
	
	@PostMapping("/loginSubmit")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		//LoginService loginService = new LoginServiceImpl();
		
		// save the customer using our service
		boolean val = loginService.validator(theCustomer);	
		
		
		if(val) {
			return "redirect:/todo/list";
		}
		return "login-form";

	}

}
