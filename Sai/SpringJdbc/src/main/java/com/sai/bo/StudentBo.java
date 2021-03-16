package com.sai.bo;

public class StudentBo {

	private int id;
	private String name;
	private String address;
	private String mobileNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "StudentBo [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	
}
