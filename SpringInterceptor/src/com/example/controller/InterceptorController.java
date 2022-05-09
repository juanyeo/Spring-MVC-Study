package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterceptorController {

	@GetMapping("/intercept1")
	public String intercept1() {
		System.out.println("Controller - GetMapping");
		return "intercept1";
	}
}
