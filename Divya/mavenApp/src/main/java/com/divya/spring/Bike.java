package com.divya.spring;

public class Bike 
{
	private BikeMilage milage;

	public Bike() 
	{
		super();
		System.out.println("Bike Details");
	}
	

	public Bike(BikeMilage milage) {
		super();
		this.milage = milage;
	}


	public final BikeMilage getMilage() {
		return milage;
	}

	public final void setMilage(BikeMilage milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "Bike [milage=" + milage + "]";
	}
	

}
