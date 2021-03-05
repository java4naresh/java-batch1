package com.triveni.spring;

public class Address {
	private String city;
	public Address() {
		System.out.println("Addres");
		
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	

}
