package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewResolverController {
	
	@GetMapping("/viewresolver1")
	public String viewResolver1(HttpServletRequest request) {
		request.setAttribute("data1", 150);
		request.setAttribute("data2", 250);
		
		return "/WEB-INF/views/viewresolver1.jsp";
	}
	
	@GetMapping("/viewresolver2")
	public String viewResolver1(Model model) {
		model.addAttribute("data1", 135);
		model.addAttribute("data2", 235);
		
		return "/WEB-INF/views/viewresolver1.jsp";
	}
	
	@GetMapping("/viewresolver3")
	public ModelAndView viewResolver1(ModelAndView mv) {
		mv.addObject("data1", 224);
		mv.addObject("data2", 336);
		
		mv.setViewName("/WEB-INF/views/viewresolver1.jsp");
		
		return mv;
	}
}
