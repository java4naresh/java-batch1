package com.triveni.spring;

import java.util.List;

public class Citizen {
	private List<String> cities;

	public Citizen() {
		System.out.println("prototype");

	}
	

	public Citizen(List<String> cities) {
		super();
		this.cities = cities;
	}


	/**
	 * @return the cities
	 */
	public List<String> getCities() {
		return cities;
	}

	/**
	 * @param cities
	 *            the cities to set
	 */
	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Citizen [cities=" + cities + "]";
	}

}
