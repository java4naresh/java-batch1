package com.naresh.javabatch1;

public class Citizens {
	
	static int sum = getSum(10,20);
	
	int num = getNum();
	
	String pincode;
	
	static String fullName = getFullName("Naresh", "Kambala");
	
	public int getNum() {
		System.out.println(num);
		System.out.println("getNum");
		return 10;
	}
	
	public static String getFullName(String firstName, String lastName) {
		System.out.println("getFullName");
		return firstName+" "+lastName;
	}

	public static int getSum(int i, int j) {
		System.out.println("getSum");
		return i+j;
	}

	{
		System.out.println("Non-static block");
		System.out.println(num);
	}
	
	static {
		System.out.println(sum);
		System.out.println("Hello World!");
	}
	
	static {
		System.out.println(fullName);
		System.out.println("Static");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main");
		getFullName("Hello", " World!");
		Citizens c = new Citizens();
		System.out.println(c.num);
		System.out.println(c);
	}
	
	

	private String name;
	
	private String aadharNumber;
	
	private String phoneNumber;
	
	private String area;
	
	private static String city;
	
	public Citizens() {
		
	}
	
	public Citizens(String name, String aadharNumber, String phoneNumber, String area, String city) {
		super();
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.phoneNumber = phoneNumber;
		this.area = area;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Citizens [name=" + name + ", aadharNumber=" + aadharNumber + ", phoneNumber=" + phoneNumber + ", area="
				+ area + ", city=" + city + "]";
	}
}
