package com.javabrains.springsecurityldap;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String index() {
		return "Home page";
	}
}
