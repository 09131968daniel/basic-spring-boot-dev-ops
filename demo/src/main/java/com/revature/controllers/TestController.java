package com.revature.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${demo.environmentTest}")
	public String environmentTest;

	@GetMapping("test")
	public String testMethod() {
		return "test: envrionment variable: " + environmentTest;
	}

}
