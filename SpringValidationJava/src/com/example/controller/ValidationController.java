package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.beans.DataBean1;
import com.example.validator.DataBean1Validator;

@Controller
public class ValidationController {

	@GetMapping("/validation1")
	public String validation1(DataBean1 dataBean1) {
		
		return "validation1";
	}
	
	@PostMapping("/validation2")
	public String validation2(@Valid DataBean1 dataBean1, BindingResult result) {
		
		System.out.printf("Binding Result : %s\n", result);
		
		if(result.hasErrors()) {
			return "validation1";
		}
		
		return "validation2";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DataBean1Validator validator1 = new DataBean1Validator();
		//binder.setValidator(validator1);
		binder.addValidators(validator1);
	}
}
