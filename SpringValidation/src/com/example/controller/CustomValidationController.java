package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.beans.DataBean2;

@Controller
public class CustomValidationController {
	
	@GetMapping("/customval")
	public String customval() {
		return "/WEB-INF/views/customval1.jsp";
	}
	
	@PostMapping("/customval2")
	public String customval2(@Valid DataBean2 dataBean2, BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "/WEB-INF/views/customval1.jsp";
		}
		
		return "/WEB-INF/views/customval2.jsp";
	}
	
	@GetMapping("/customval3")
	public String customval3(DataBean2 dataBean2) {
		return "/WEB-INF/views/customval3.jsp";
	}
	
	@PostMapping("/customval4")
	public String customval4(@Valid DataBean2 dataBean2, BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "/WEB-INF/views/customval3.jsp";
		}
		
		return "/WEB-INF/views/customval2.jsp";
	}
}
