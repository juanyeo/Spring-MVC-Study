package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetParameterController {
	
	@RequestMapping(value="/getparameter", method= {RequestMethod.GET, RequestMethod.POST})
	public String parameter1(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		return "/WEB-INF/views/getparameter1.jsp";
	}
	
	@GetMapping("/pathvariable/{data1}/{data2}/{data3}")
	public String parameter2(@PathVariable String data1,
							 @PathVariable String data2,
							 @PathVariable String data3) {
		
		System.out.println("@PathVariable");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		
		return "/index.jsp";
	}
	
	@GetMapping("/requestparam")
	public String parameter2(@RequestParam int data1,
							 @RequestParam int data2) {
		
		System.out.println("@RequestParam");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		return "/index.jsp";
	}
	
}
