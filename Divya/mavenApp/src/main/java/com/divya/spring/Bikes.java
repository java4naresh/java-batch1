package com.divya.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bikes
{
	private List<String> bikes;
	private Set<String> cars;
	private Map<String,String> mobiles;
	public Bikes() 
	{
		super();
	
	}
	public Bikes(List<String> bikes, Set<String> cars, Map<String, String> mobiles)
	{
		super();
		this.bikes = bikes;
		this.cars = cars;
		this.mobiles = mobiles;
	}
	public final List<String> getBikes() {
		return bikes;
	}
	public final void setBikes(List<String> bikes) {
		System.out.println("List Type---Bikes");
		this.bikes = bikes;
	}
	public final Set<String> getCars() {
		return cars;
	}
	public final void setCars(Set<String> cars) {
		System.out.println("Set Type---Cars");
		this.cars = cars;
	}
	public final Map<String, String> getMobiles() {
		return mobiles;
	}
	public final void setMobiles(Map<String, String> mobiles) {
		System.out.println("Map Type----Mobiles");
		this.mobiles = mobiles;
	}
	@Override
	public String toString()
	{
		return "Bikes [bikes=" + bikes + ", cars=" + cars + ", mobiles=" + mobiles + "]";
	}
	
	
	

}
