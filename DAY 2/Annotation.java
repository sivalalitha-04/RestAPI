package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Annotation {
	@Value("${greeting.msg}")
	private String message;
	
	@GetMapping("/annotation")
	public String getName() {
		return message;
	}
}
