package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.beans.DataBean3;

@Controller
public class JSR303Controller {
	@GetMapping("/jsr303")
	public String jsr303(DataBean3 dataBean3) {
		
		return "/WEB-INF/views/jsr303.jsp";
	}
	
	@PostMapping("/jsr303")
	public String jsr303p(@Valid DataBean3 dataBean3, BindingResult result) {
		
		if(result.hasErrors()) {
			return "/WEB-INF/views/jsr303.jsp";
		}
		
		return "/index.jsp";
	}
}
