package com.divya.spring;

public class CollegeStudent
{
	private int studentId;
	private String name;
	private String address;
	private String mobile;
	private String branch;
	public CollegeStudent() 
	{
		super();
	}
	public CollegeStudent(int studentId, String name, String address, String mobile, String branch) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.branch = branch;
	}
	public final int getStudentId() {
		return studentId;
	}
	public final void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getAddress() {
		return address;
	}
	public final void setAddress(String address) {
		this.address = address;
	}
	public final String getMobile() {
		return mobile;
	}
	public final void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public final String getBranch() {
		return branch;
	}
	public final void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "CollegeStudent [studentId=" + studentId + ", name=" + name + ", address=" + address + ", mobile="
				+ mobile + ", branch=" + branch + "]";
	}
	
}
