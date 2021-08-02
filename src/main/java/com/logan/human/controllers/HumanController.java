package com.logan.human.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

	@RequestMapping( "/" )
	public String human(
			@RequestParam( value = "firstName", required = false ) String firstName
	) {
		
		if ( firstName.length() > 0 ) {
			return "<h1>Hello " + firstName + "!</h1><p>Welcome to Spring Boot!</p>";
		}
		
		return "<h1>Hello Human!</h1><p>Welcome to Spring Boot!</p>";

	}

}
