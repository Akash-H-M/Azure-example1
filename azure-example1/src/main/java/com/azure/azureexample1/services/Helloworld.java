package com.azure.azureexample1.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	@GetMapping(path="/homepage")
	 public String welcome()
	 {
		return "welcome to azure devops";
	 }
	
	

}
