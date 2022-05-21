package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMappingController {
	
	// @GetMapping 으로 대체 가능
	@RequestMapping(value="/requestmapping", method=RequestMethod.GET)
	public String requestmapping1() {
		System.out.println("RequestMapping - GET");
		return "/WEB-INF/views/requestmapping1.jsp";
	}
	
	// @PostMapping 으로 대체 가능 
	@RequestMapping(value="/requestmapping", method=RequestMethod.POST)
	public String requestmapping2() {
		System.out.println("RequestMapping - POST");
		return "/WEB-INF/views/requestmapping2.jsp";
	}
}
