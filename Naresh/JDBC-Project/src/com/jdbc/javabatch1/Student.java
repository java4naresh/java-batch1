package com.jdbc.javabatch1;

public class Student {
	
	private int stdId;
	
	private String stdFirstName;
	
	private String stdLastName;
	
	private String stdEmail;
	
	private String branch;
	
	private int addId;
	
	private String  city;
	
	public Student() {
		
	}

	public Student(int stdId, String stdFirstName, String stdLastName, String stdEmail, String branch, int addId,
			String city) {
		super();
		this.stdId = stdId;
		this.stdFirstName = stdFirstName;
		this.stdLastName = stdLastName;
		this.stdEmail = stdEmail;
		this.branch = branch;
		this.addId = addId;
		this.city = city;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdFirstName() {
		return stdFirstName;
	}

	public void setStdFirstName(String stdFirstName) {
		this.stdFirstName = stdFirstName;
	}

	public String getStdLastName() {
		return stdLastName;
	}

	public void setStdLastName(String stdLastName) {
		this.stdLastName = stdLastName;
	}

	public String getStdEmail() {
		return stdEmail;
	}

	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdFirstName=" + stdFirstName + ", stdLastName=" + stdLastName
				+ ", stdEmail=" + stdEmail + ", branch=" + branch + ", addId=" + addId + ", city=" + city + "]";
	}
	
	

}
