package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
	@GetMapping("/greeting")
	public String Greetingname() {
		return "Welcome String Boot!";
	}

}
