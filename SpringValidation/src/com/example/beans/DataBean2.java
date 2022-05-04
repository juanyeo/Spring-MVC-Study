package com.example.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class DataBean2 {
	
	@Size(min=2, max=10)
	private String data3;
	
	@Max(100)
	private int data4;
	
	public String getData3() {
		return data3;
	}
	public void setData3(String data3) {
		this.data3 = data3;
	}
	public int getData4() {
		return data4;
	}
	public void setData4(int data4) {
		this.data4 = data4;
	}
	
	
}
