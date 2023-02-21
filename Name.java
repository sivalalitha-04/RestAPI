package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	private String studentName="Spring boot";
	@RequestMapping("/name")
	public String getName() {
		return "Welcome to "+studentName+"!";
	}	
}
