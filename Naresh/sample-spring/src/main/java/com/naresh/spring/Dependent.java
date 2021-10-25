package com.naresh.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component(value="dep")
public class Dependent {
	
	
	@Autowired
	@Qualifier("dependency2")
	MyInterface mi;
	
	
	MyInterface2 mi2;
	
	public Dependent() {
		
		System.out.println("Dependent Cons");
		
	}
	
	
	public Dependent(MyInterface dependency, MyInterface2 dependency4) {
		System.out.println("Param Constructor");
		this.mi = dependency;
		this.mi2 = dependency4;
	}
	
	public Dependent(MyInterface mi, String name) {
		System.out.println(name);
		System.out.println("Param Constructor");
		//this.mi = mi;
	}


	public MyInterface getMi() {
		return mi;
	}

	public void setMi(MyInterface mi) {
		this.mi = mi;
	}


	public MyInterface2 getMi2() {
		return mi2;
	}

	@Required
	@Autowired
	public void setMi2(MyInterface2 mi2) {
		this.mi2 = mi2;
	}


	@Override
	public String toString() {
		return "Dependent [mi=" + mi + ", mi2=" + mi2 + "]";
	}
	
	
	



	/*public MyInterface getDependency() {
		return mi;
	}


	@Autowired
	public void setDependency(MyInterface dependency) {
		this.mi = dependency;
	}


	public MyInterface2 getDependency4() {
		return mi2;
	}

	@Autowired
	public void setDependency4(MyInterface2 dependency4) {
		this.mi2 = dependency4;
	}


	@Override
	public String toString() {
		return "Dependent [dependency=" + mi + ", dependency4=" + mi2 + "]";
	}*/
	
	


	
	
	
	

}
