package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Colorgame {
	private String yourFavColor="Black";
	@RequestMapping("/colorgame")
	public String getMyFav() {
		return "Your favorite color is "+yourFavColor+"!!!";
	}
}
