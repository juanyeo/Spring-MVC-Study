package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
	@GetMapping("/main/friends")
	@ResponseBody
	public List<User> friendList() {
		User user1 = new User("David", 14);
		User user2 = new User("Jack", 25);
		User user3 = new User("Cat", 15);
		
		return Arrays.asList(new User[] {user1, user2, user3});
	}
}
