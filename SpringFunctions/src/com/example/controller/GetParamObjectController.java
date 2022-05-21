package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.beans.DataBean;

@Controller
public class GetParamObjectController {
	@RequestMapping(value="/getobject1", method=RequestMethod.GET)
	public String getMap(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		
		System.out.println("Map Object");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		String dataList = map.get("data3");
		
		System.out.println("List Object");
		for(String number : data3) {
			System.out.println("data3 : " + number);
		}
		
		return "/index.jsp";
	}
	
	@RequestMapping(value="/getobject2", method=RequestMethod.GET)
	public String getMap(@ModelAttribute DataBean bean1) {
		String data1 = bean1.getData1();
		String data2 = bean1.getData2();
		
		System.out.println("Bean Object");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		System.out.println("Bean List Object");
		for(String number : bean1.getData3()) {
			System.out.println("data3 : " + number);
		}
		
		return "/index.jsp";
	}
}
