package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@PropertySource("/WEB-INF/properties/data1.properties")
//@PropertySource("/WEB-INF/properties/data2.properties")
@PropertySource(value={"/WEB-INF/properties/data1.properties",
						"/WEB-INF/properties/data2.properties"})
public class PropertiesController {
	
		@Value("${aaa.a1}")
		private int a1;
		
		@Value("${aaa.a2}")
		private String a2;
		
		@Value("${bbb.b1}")
		private int b1;
		
		@Value("${bbb.b2}")
		private String b2;
		
		@Value("${ccc.c1}")
		private int c1;
		
		@Value("${ccc.c2}")
		private String c2;
		
		@Value("${ddd.d1}")
		private int d1;
		
		@Value("${ddd.d2}")
		private String d2;

		@GetMapping("/properties")
		public String properties() {
			System.out.printf("aaa.a1 = %d\n", a1);
			System.out.printf("ddd.d2 = %s\n", d2);
			
			return "/WEB-INF/views/home.jsp";
		}
}
