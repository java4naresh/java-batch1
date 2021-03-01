package com.sai.bean;

public class Address {
   private String address1;
   private String address2;
   private String city;
   private String pincode;
   
   public Address() {
	   
   }
   
public Address(String address1, String address2, String city, String pincode) {
	super();
	this.address1 = address1;
	this.address2 = address2;
	this.city = city;
	this.pincode = pincode;
}

@Override
public String toString() {
	return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", pincode=" + pincode + "]";
}
   
   
}
