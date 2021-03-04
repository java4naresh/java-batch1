package com.sai.spring;

public class University {
   
	Departments dp;
	
	public University() {
		System.out.println("University");
	}

	public University(Departments dp) {
		super();
		this.dp = dp;
	}

	public Departments getDp() {
		return dp;
	}

	public void setDp(Departments dp) {
		this.dp = dp;
	}
	
	
}
