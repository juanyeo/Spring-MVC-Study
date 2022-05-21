package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectForwardController {
	
	@RequestMapping(value="/redirect", method=RequestMethod.GET)
	public String redirect() {
		return "redirect:/destination";
	}
	
	@RequestMapping(value="/forward", method=RequestMethod.GET)
	public String forward() {
		return "forward:/destination";
	}
	
	@RequestMapping(value="/destination", method=RequestMethod.GET)
	public String destination() {
		return "/WEB-INF/views/destination.jsp";
	}
}
