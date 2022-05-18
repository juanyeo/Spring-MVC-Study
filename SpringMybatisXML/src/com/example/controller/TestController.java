package com.example.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.beans.DataBean;

@Controller
public class TestController {
	
	@Autowired
	SqlSessionTemplate SqlSessionTemplate;

	@GetMapping("/input")
	public String input1(Model model) {
		
		DataBean dataBean = new DataBean();
		model.addAttribute("dataBean", dataBean);
		
		return "/WEB-INF/views/input.jsp";
	}
	
	@PostMapping("/input_pro")
	public String input2(DataBean dataBean) {
		SqlSessionTemplate.insert("mapper1.insert_data", dataBean);
		
		return "/WEB-INF/views/input_result.jsp";
	}
	
	@GetMapping("/input_result")
	public String input3(Model model) {
		
		List<DataBean> list = SqlSessionTemplate.selectList("mapper1.select_data");
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/input_result.jsp";
	}
}
