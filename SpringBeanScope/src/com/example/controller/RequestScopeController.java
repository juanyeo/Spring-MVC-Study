package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestScopeController {
	
	@GetMapping("/redirect1")
	public String redirect1(HttpServletRequest request) {
		request.setAttribute("data1", "100");
		
		return "redirect:/result1";
	}
	
	@GetMapping("/forward1")
	public String forward1(HttpServletRequest request) {
		request.setAttribute("data1", "100");
		
		return "forward:/result1";
	}
	
	@GetMapping("/model1")
	public String model1(Model model) {
		model.addAttribute("data1", "150");
		
		return "forward:/result1";
	}
	
	@GetMapping("/modelandview1")
	public ModelAndView modelandview1(ModelAndView mv) {
		mv.addObject("data1", "200");
		mv.setViewName("forward:/result1");
		
		return mv;
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		String d1 = (String) request.getAttribute("data1");
		
		System.out.println(d1);
		
		return "/WEB-INF/views/result1.jsp";
	}
}
