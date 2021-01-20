package com.Liveexmple.Java;

public class Laptop {

	public Laptop(int gb, String name) {
		this.gb = gb;
		this.name = name;
	}

	private int gb;
	private String name;

	public int getGb() {
		return gb;
	}

	public void setGb(int gb) {
		this.gb = gb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return gb;
	}

	@Override
	public boolean equals(Object obj) {
		Laptop lap = (Laptop) obj;
		return (this.getGb() == lap.getGb() && this.name.equals(lap.getName())) ? true : false;
	}

	@Override
	public String toString() {
		return "Laptop [gb=" + gb + ", name=" + name + "]";
	}

}
