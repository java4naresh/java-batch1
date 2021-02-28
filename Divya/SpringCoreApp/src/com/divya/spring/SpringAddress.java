package com.divya.spring;

public class SpringAddress 
{
	private String address1;
	private String address2;
	private String city;
	private int pincode;
	public SpringAddress()
	{
		super();
		
	}
	public final String getAddress1() {
		return address1;
	}
	public final void setAddress1(String address1) {
		this.address1 = address1;
	}
	public final String getAddress2() {
		return address2;
	}
	public final void setAddress2(String address2) {
		this.address2 = address2;
	}
	public final String getCity() {
		return city;
	}
	public final void setCity(String city) {
		this.city = city;
	}
	public final int getPincode() {
		return pincode;
	}
	public final void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "SpringAddress [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
	
	

}
