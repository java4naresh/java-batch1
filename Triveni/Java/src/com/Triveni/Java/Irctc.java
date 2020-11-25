package com.Triveni.Java;

public class Irctc 
{
	private String FirstName;
	private String LastName;
	private String EmailId;
	private String MobileNo;
	private String Address;
	
	private String UserName;
	private String Password;
	private String OTP;
	
	private String FullName;
	private String Age;
	private String Gender;
	private String BerthPreference;
	
	// Registration properties----
	public String getLastName()
	{
		return LastName;
	}
	public void setLastName(String LastName)
	{
		this.LastName=LastName;
	}

	public String getFirstName()
	{
		return FirstName;
	}
	public void setFirstName(String FirstName)
	{
		this.FirstName=FirstName;
	}

	public String getEmailId()
	{
		return EmailId;
	}
	public void setEmailId (String EmailId) 
	{
		this.EmailId=EmailId+"@gmail.com"; 
	}
	
	public String getMobileNo()
	{
		return  MobileNo;
	}
	public void setMobileNo(String   MobileNo)
	{
		this. MobileNo= MobileNo;
	}
	
	public String getAddress()
	{
		return   Address;
	}
	public void setAddress(String  Address)
	{
		this.  Address=  Address;
	}
	// Login properties-----
	
	public String getUserName()
	{
		return   UserName;
	}
	public void setUserName(String  UserName)
	{
		this.  UserName=  UserName;
	}
	
	public String getPassword()
	{
		return   Password;
	}
	public void setPassword(String  Password)
	{
		this.  Password=  Password;
	}
	
	public String getOTP()
	{
		return   OTP;
	}
	public void setOTP(String  OTP)
	{
		this.  OTP= OTP;
	}
	
	public String getFullName()
	{
		return   FullName;
	}
	public void setFullName(String  FullName)
	{
		this.  FullName= FullName;
	}
	
	
	public String getAge()
	{
		return   Age;
	}
	public void setAge(String  Age)
	{
		this.  Age= Age;
	}
	public String getGender()
	{
		return   Gender;
	}
	public void setGender(String  Gender)
	{
		this.  Gender= Gender;
	}
	public String getBerthPreference()
	{
		return   BerthPreference;
	}
	public void setBerthPreference(String  BerthPreference)
	{
		this.  BerthPreference= BerthPreference;
	}
}
