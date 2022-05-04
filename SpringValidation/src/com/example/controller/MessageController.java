package com.example.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	// MessageSource를 주입받는다.
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/message")
	public String message(Model model, Locale locale) {
		
		String a1 = res.getMessage("aaa.a1", null, null);
		
		// {} 부분에 셋팅할 값 배열
		Object [] args = {25, "홍길"};
		String b3 = res.getMessage("bbb.b3", args, null);
		
		// 다국어 처리
		String a3 = res.getMessage("aaa.a3", null, locale);
		
		System.out.printf("Locale = %s\n", locale);
		System.out.printf("aaa.a1 = %s\n", a1);
		System.out.printf("bbb.b3 = %s\n", b3);
		System.out.printf("aaa.a3 = %s\n", a3);
		
		model.addAttribute("args", args);
		
		return "/WEB-INF/views/messages.jsp";
	}
}
