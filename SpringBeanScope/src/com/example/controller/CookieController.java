package com.example.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {

	@GetMapping("/save_cookie")
	public String save_cookie(HttpServletResponse response) {
		
		try {
			String str1 = URLEncoder.encode("첫번째 쿠키", "UTF-8");
			String str2 = URLEncoder.encode("두번째 쿠키", "UTF-8");
			
			Cookie cookie1 = new Cookie("cookie1", str1); 
			Cookie cookie2 = new Cookie("cookie2", str2);
			
			cookie1.setMaxAge(60 * 60);
			cookie2.setMaxAge(60 * 60);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/load_cookie";
	}
	
	@GetMapping("/load_cookie")
	//HttpServletRequest 대신 @CookieValue("cookie1") String cookie1
	public String load_cookie(HttpServletRequest request) {
		
		try {
			Cookie [] cookies = request.getCookies();
			
			for(Cookie cookie : cookies) {
				String str = URLDecoder.decode(cookie.getValue(), "UTF-8");
				
				if(cookie.getName().equals("cookie1")) {
					System.out.printf("cookie1 : %s\n", str);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "/index.jsp";
	}
}
