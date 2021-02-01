package com.naresh.javabatch1.pack2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String address1;
	private String address2;
	private String city;
	
	public Address() {
		
	}
	
	
	public Address(String address1, String address2, String city) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + "]";
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}

class Parent implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8901844055434047944L;
	
	private String name;
	
	
    public Parent() {
    	
    }
    
	public Parent(String name) {
		super();
		this.name = name;
	}



	@Override
	public String toString() {
		return "Parent [name=" + name + "]";
	}
	
	
}

class Child extends Parent {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2523895095137964945L;
	
	private String name;
	private Address address;
	private transient String gender;
	
	
	
	
	public Child(String name, Address address, String gender) {
		super("");
		this.name = name;
		this.address = address;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Child [name=" + name + ", address=" + address + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		this.gender = (String) ois.readObject();
	}
	
	private void writeObject(ObjectOutputStream ois) throws IOException {
		ois.defaultWriteObject();
		ois.writeObject(this.gender);
	}
	
	
}

public class SerializationClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Address a = new Address();
		Child c = new Child("S", a, "Male");
		FileOutputStream fos = new FileOutputStream("D:\\Serialization\\child.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		System.out.println("Serialization Completed");
		FileInputStream fis = new FileInputStream("D:\\Serialization\\child.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child c2 = (Child) ois.readObject();
		System.out.println(c2);
		oos.close();
		fos.close();
		ois.close();
		fis.close();
	}

}
