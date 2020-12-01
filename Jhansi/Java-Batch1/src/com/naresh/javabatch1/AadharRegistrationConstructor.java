package com.naresh.javabatch1;

public class AadharRegistrationConstructor {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String phoneNo;
	private String address;
	private String email;
	
	public AadharRegistrationConstructor() {
	
	}
	
	
	
	public AadharRegistrationConstructor(String firstName, String lastName, String gender, String phoneNo,
			String address, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.address = address;
		this.email = email;
	}
	public AadharRegistrationConstructor(String firstName) {
		this.firstName = firstName;
			}
	public AadharRegistrationConstructor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public AadharRegistrationConstructor(String firstName, String lastName, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public AadharRegistrationConstructor(String firstName, String lastName, String gender, String phoneNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNo = phoneNo;
	}
	public AadharRegistrationConstructor(String firstName, String lastName, String gender, String phoneNo,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.address = address;
	}
			
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
