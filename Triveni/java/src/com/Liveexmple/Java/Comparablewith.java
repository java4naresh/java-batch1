package com.Liveexmple.Java;

public class Comparablewith implements Comparable< Comparablewith>{
	 private String brand;
	 private int ram;
	 private int price;
	 
	 
	 
	 
	public Comparablewith(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Comparablewith s2) {
		if(this.getRam()>s2.getRam())
		return 1;
		else
		return -1;
	}
	@Override
	public String toString() {
		return "Comparablewithset [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

	 
	

}
