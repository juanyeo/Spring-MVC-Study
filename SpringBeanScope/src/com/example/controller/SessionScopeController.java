package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.beans.DataBean1;

@Controller
@SessionAttributes("sessionBean1")
public class SessionScopeController {
	
	@ModelAttribute("sessionBean1")
	public DataBean1 sessionBean1() {
		return new DataBean1();
	}
	
	@GetMapping("/session1")
	public String session1(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.setAttribute("s_data1", "1870");
		
		return "redirect:/result3";
	}
	
	@GetMapping("/session2")
	public String session2(@ModelAttribute("sessionBean1") DataBean1 sessionBean1) {
		
		sessionBean1.setData1("1230");
		sessionBean1.setData2("3260");
		
		return "redirect:/result3";
	}
	
	@GetMapping("/result3")
	public String result3(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		String s_data1 = (String)session.getAttribute("s_data1");
		System.out.printf("session data : %s\n", s_data1);
		
		return "/WEB-INF/views/result3.jsp";
	}
	
	

}
