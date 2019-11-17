package com.mycompany.spring_rest_application.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ToDoModel {
	
	private String todoName;
	private String description;
	private boolean isDone;
	private String dueDate;

}
