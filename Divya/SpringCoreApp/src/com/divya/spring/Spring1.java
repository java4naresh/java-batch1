package com.divya.spring;

public class Spring1
{
	private String name;
	private int age;
	private long mobile;
	
	public Spring1()
	{
		System.out.println("Welcome to spring1");
	}

	public Spring1(String name, int age, long mobile) 
	{
		super();
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final long getMobile() {
		return mobile;
	}

	public final void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString()
	{
		return "Spring1 [name=" + name + ", age=" + age + ", mobile=" + mobile + "]";
	}
	

}
