package com.naresh.javabatch1;

public class EmailRegistration {

	private String firstName;
	private String lastName;
	private String gender;
	private String phoneNo;
	private String address;
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first) {
		firstName = first.toUpperCase();
		//firstName = first;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last) {
		lastName = last;
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
	public void setEmail(String em) {
		
		email = em+"@gmail.com";
	}
	
	

}
