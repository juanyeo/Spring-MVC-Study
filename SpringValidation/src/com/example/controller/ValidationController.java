package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.beans.DataBean1;

@Controller
public class ValidationController {

	@GetMapping("/validation1")
	public String validation1() {
		
		return "/WEB-INF/views/validation1.jsp";
	}
	
	@PostMapping("/validation2")
	public String validation2(@Valid DataBean1 dataBean1, BindingResult result) {
		
		System.out.printf("data1 : %s\n", dataBean1.getData1());
		System.out.printf("data2 : %d\n", dataBean1.getData2());
		//System.out.printf("Binding Result : %s\n", result);
		
		// 유효성 검사 위반여부 확인
		if(result.hasErrors()) {
			for(ObjectError obj : result.getAllErrors()) {
				System.out.printf("Message : %s\n", obj.getDefaultMessage());
				System.out.printf("Code : %s\n", obj.getCode());
				System.out.printf("Object : %s\n\n", obj.getObjectName());
				
				// 특정 규칙 위반 시 대응 
				String [] codes = obj.getCodes();
				if(codes[0].equals("Size.dataBean1.data")) {
					System.out.println("!!! Size 위반 !!!");
				}
				
				System.out.println("------------------------------------");
			}
			
			return "/WEB-INF/views/validation1.jsp";
		}
		
		return "/WEB-INF/views/validation2.jsp";
	}
}
