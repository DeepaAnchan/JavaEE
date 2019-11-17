package com.mycompany.spring_rest_application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.spring_rest_application.model.ToDoModel;


@Controller
@RequestMapping("/todo")
public class ToDoController {
	
	
	@GetMapping("/list")
	public String listToDos(Model theModel) {
		
		// get customers from the service
		List<ToDoModel> theToDos = new ArrayList();
		theToDos.add(new ToDoModel("Book purchase","White Tiger", false, "08-09-2012"));
		theToDos.add(new ToDoModel("Grocery purchase","Brush", true, "05-09-2012"));
		theToDos.add(new ToDoModel("Book purchase","Harry Potter", false, "08-08-2012"));

		ToDoModel myObject = theToDos.get(0);
		System.out.println(myObject.isDone());
		
		// add the customers to the model
		theModel.addAttribute("todolist", theToDos);
		
		return "todo-form";
	}

}
