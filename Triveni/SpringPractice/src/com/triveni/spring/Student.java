package com.triveni.spring;

public class Student {
	private Address address;
	private String name;
	private int age;;
	public Student() {
		
	}
	
	public Student(Address address) {
		System.out.println("SingleTon");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	






	
}
