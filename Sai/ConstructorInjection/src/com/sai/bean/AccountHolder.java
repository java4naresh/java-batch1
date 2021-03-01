package com.sai.bean;

public class AccountHolder {
     private String AccNo;
     private String Name;
     private String MobileNo;
     private Address add;
     public AccountHolder() {
    	 
     }
	public AccountHolder(String accNo, String name, String mobileNo, Address add) {
		super();
		AccNo = accNo;
		Name = name;
		MobileNo = mobileNo;
		this.add = add;
	}
	@Override
	public String toString() {
		return "AccountHolder [AccNo=" + AccNo + ", Name=" + Name + ", MobileNo=" + MobileNo + ", add=" + add + "]";
	}
     
	
     
     
}
