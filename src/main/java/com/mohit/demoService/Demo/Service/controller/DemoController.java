package com.mohit.demoService.Demo.Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
	
	@GetMapping("/")
	public String getInfo() {
		return "Demo Service";
	}
	
	@GetMapping("/name")
	public String getName() {
		return "Mohit";
	}
	@GetMapping("/address")
	public String getAddress() {
		return "India";
	}
	@GetMapping("/status")
	public String getStatus() {
		return "active";
	}
}
