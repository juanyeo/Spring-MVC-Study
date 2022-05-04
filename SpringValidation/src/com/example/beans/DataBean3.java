package com.example.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Null;

public class DataBean3 {

	@AssertTrue
	private boolean data5;
	
	@AssertFalse
	private boolean data6;
	
	@Max(10)
	private int data7;
	
	@Min(10)
	private int data8;
	
	@Null
	private String data9;
	
	@Digits(integer=3, fraction=2)
	private String data10;
	
	public int getData7() {
		return data7;
	}

	public void setData7(int data7) {
		this.data7 = data7;
	}

	public int getData8() {
		return data8;
	}

	public void setData8(int data8) {
		this.data8 = data8;
	}

	public boolean isData5() {
		return data5;
	}

	public boolean isData6() {
		return data6;
	}

	public void setData6(boolean data6) {
		this.data6 = data6;
	}

	public void setData5(boolean data5) {
		this.data5 = data5;
	}

	public String getData9() {
		return data9;
	}

	public void setData9(String data9) {
		this.data9 = data9;
	}

	public String getData10() {
		return data10;
	}

	public void setData10(String data10) {
		this.data10 = data10;
	}
	
	
}
