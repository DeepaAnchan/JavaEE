package com.mycompany.spring_rest_application.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerErrorResponse {
	private int statusCode;
	private String message;
	private  long logTime;

}
