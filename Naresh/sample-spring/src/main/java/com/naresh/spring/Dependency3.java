package com.naresh.spring;

import org.springframework.stereotype.Component;
@Component("dependency3")
public class Dependency3 implements MyInterface {
	
public Dependency3() {
		
		System.out.println("Dependency3 Cons");
		
	}

}
