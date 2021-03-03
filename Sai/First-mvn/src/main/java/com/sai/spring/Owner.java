package com.sai.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Owner {
   
	   private List<String> companies;
	   private Set<String>  address;
	   private Map<Integer,String> employees;

	   public Owner() {
		   
	   }

	public Owner(List<String> companies, Set<String> address, Map<Integer, String> employees) {
		super();
		this.companies = companies;
		this.address = address;
		this.employees = employees;
}

	public List<String> getCompanies() {
		return companies;
	}

	public void setCompanies(List<String> companies) {
		this.companies = companies;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<Integer, String> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<Integer, String> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Owner [companies=" + companies + ", address=" + address + ", employees=" + employees + "]";
	}   
}
