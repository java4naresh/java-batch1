package com.sai.spring;

import java.util.Set;

public class Employee {
       private Set<Integer> id;
       
       public Employee() {
    	   System.out.println("Singleton");
       }
}
