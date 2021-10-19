package com.revanth.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerfile {

	
	@GetMapping("/hello")
	public String hello(){
		return "Welcome to DOCKER PROJECT";
	}
}
