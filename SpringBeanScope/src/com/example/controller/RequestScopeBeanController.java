package com.example.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.beans.DataBean1;
import com.example.beans.DataBean2;
import com.example.beans.DataBean3;
import com.example.beans.DataBean4;

@Controller
public class RequestScopeBeanController {
	
	@Autowired
	@Lazy
	DataBean1 requestBean1;
	
	@Resource(name = "requestBean2")
	@Lazy
	DataBean2 requestBean2;
	
	@Autowired
	@Lazy
	DataBean3 requestBean3;
	
	@Resource(name = "requestBean4")
	@Lazy
	DataBean4 requestBean4;
	
	@GetMapping("/requestscopebean")
	public String requestbean() {
		
		requestBean1.setData1("11");
		requestBean1.setData2("22");
		
		requestBean2.setData3("33");
		requestBean2.setData4("44");
		
		requestBean3.setData5("55");
		requestBean3.setData6("66");
		
		requestBean4.setData7("77");
		requestBean4.setData8("88");
		
		return "forward:/result2";
	}
	
	@GetMapping("/result2")
	public String result2(Model model) {
		
		System.out.printf("requestBean1.data1 : %s\n", requestBean1.getData1());
		System.out.printf("requestBean1.data2 : %s\n", requestBean1.getData2());
		
		System.out.printf("requestBean2.data3 : %s\n", requestBean2.getData3());
		System.out.printf("requestBean2.data4 : %s\n", requestBean2.getData4());
		
		System.out.printf("requestBean3.data5 : %s\n", requestBean3.getData5());
		System.out.printf("requestBean3.data6 : %s\n", requestBean3.getData6());

		System.out.printf("requestBean4.data7 : %s\n", requestBean4.getData7());
		System.out.printf("requestBean4.data8 : %s\n", requestBean4.getData8());
		
		model.addAttribute("requestBean1", requestBean1);
		//model.addAttribute("requestBean2", requestBean2);
		model.addAttribute("requestBean3", requestBean3);
		model.addAttribute("requestBean4", requestBean4);
		
		return "/WEB-INF/views/result2.jsp";
	}
}
