package com.divya.spring;

public class BikeMilage
{
	private int milage;

	public BikeMilage() 
	{
		super();
		System.out.println("Bike Milage");
	}
	

	public BikeMilage(int milage) {
		super();
		this.milage = milage;
	}


	public final int getMilage() {
		return milage;
	}

	public final void setMilage(int milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "BikeMilage [milage=" + milage + "]";
	}
	

}
