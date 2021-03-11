package com.divya.dto;

public class StudentDTO
{
	private int id;
	private String name;
	private String email;
	private String branch;
	private int mobileNum;
	
	public StudentDTO(int id, String name, String mailId, String branch, int mobileNum)
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.mobileNum = mobileNum;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public final String getBranch() {
		return branch;
	}

	public final void setBranch(String branch) {
		this.branch = branch;
	}

	public final int getMobileNum() {
		return mobileNum;
	}

	public final void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", email=" + email + ", branch=" + branch + ", mobileNum="
				+ mobileNum + "]";
	}
	
	

}
