package com.academics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/getName")
	public String getName() {
		return "Anurag";
	}

	@GetMapping("/getjsp")
	public String getView() {
		return "view-books";
	}
}
