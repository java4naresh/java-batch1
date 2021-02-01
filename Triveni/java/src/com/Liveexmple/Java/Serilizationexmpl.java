package com.Liveexmple.Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address {
	private String address;
	private String address2;
	private String city;
	@Override
	public String toString() {
		return "Address [address=" + address + ", address2=" + address2 + ", city=" + city + "]";
	}
	
}

class Child implements Serializable{
		 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String name;
		 private String address;
		 
		 
		public Child(String name, String address) {
			super();
			this.name = name;
			this.address = address;
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


		@Override
		public String toString() {
			return "Child [name=" + name + ", address=" + address + "]";
		}
		
		 
	 }
	
	
	 public class Serilizationexmpl {	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Child c=new Child("Triveni","Guntur");
		FileOutputStream fos=new FileOutputStream("D:\\Serializtion\\Child.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		System.out.println("Serialization Completed");
		
		FileInputStream fis=new FileInputStream("D:\\Serializtion\\Child.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child c2=(Child)ois.readObject();
		System.out.println(c2);
		System.out.println("DeSerialization Completed");
		oos.close();
		fos.close();
		 ois.close();
		 fis.close();
	}

}
