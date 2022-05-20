package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.beans.BoardInfoBean;
import com.example.mapper.TopMenuMapper;

@Repository
public class TopMenuDao {
	
	@Autowired
	private TopMenuMapper topMenuMapper;
	
	public List<BoardInfoBean> getTopMenuList() {
		List<BoardInfoBean> topMenuList = topMenuMapper.getTopMenuList();
		System.out.println("Dao - Got Menu List");
		return topMenuList;
	}
}
