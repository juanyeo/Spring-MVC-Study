package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.beans.UserBean;

@Controller
public class FormCustomController {
	
	@RequestMapping(value="/formcustom", method= {RequestMethod.GET, RequestMethod.POST})
	public String formcustom(UserBean bean) {
		
		//bean.setUser_name("홍길동");
		bean.setUser_id("abcde");
		//bean.setUser_pw("1234");
		System.out.println(bean.getUser_id());
		
		return "/WEB-INF/views/formcustom.jsp";
	}
	
}
