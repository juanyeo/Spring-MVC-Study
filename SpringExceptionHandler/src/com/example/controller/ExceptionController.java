package com.example.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {
	
	@GetMapping("/exception1")
	public String exception1(Model model) {
		
		int [] array1 = {10, 20, 30};
		
		model.addAttribute("array1", array1[10]);
		
		return "view1";
	}
	
	@GetMapping("/exception2")
	public String exception2() {
		
		ArrayList<String> list = null;
		list.add("aaa");
		
		return "view1";
	}
	
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String exception3() {
		return "error_view";
	}
	
}
