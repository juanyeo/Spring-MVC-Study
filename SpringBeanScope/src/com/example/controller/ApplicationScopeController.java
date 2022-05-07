package com.example.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationScopeController {
	
	//@Autowired
	//ServletContext application;
	
	@GetMapping("/application1")
	public String application1(HttpServletRequest request) {
		ServletContext application = request.getServletContext();
		application.setAttribute("a_data1", "14205");
		
		return "redirect:/result4";
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		ServletContext application = request.getServletContext();
		String a_data1 = (String) application.getAttribute("a_data1");
		System.out.printf("application data : %s\n", a_data1);
		
		return "/WEB-INF/views/result4.jsp";
	}
}
