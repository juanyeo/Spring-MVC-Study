package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.beans.DataBean2;

@Controller
public class CommandObjectController {
	@GetMapping("/commandobject")
	public String commandObject1() {
		return "/WEB-INF/views/commandobject1.jsp";
	}
	
	@PostMapping("/commandobject")
	public String commandObject2(DataBean2 bean) {
		System.out.println("command1 : " + bean.getCommand1());
		System.out.println("command2 : " + bean.getCommand2());
		
		return "/WEB-INF/views/commandobject2.jsp";
	}
}
