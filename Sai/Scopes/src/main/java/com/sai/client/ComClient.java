package com.sai.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ComClient {

	public static void main(String[] args) {
    
		  Resource resource=new ClassPathResource("applicationContext.xml");
		  BeanFactory factory=new XmlBeanFactory(resource);
		 System.out.println(factory.getBean("company"));
		 System.out.println(factory.getBean("employee"));
		 m1(factory);
	}
     public static void m1(BeanFactory factory) {
    	 System.out.println(factory.getBean("company"));
    	 System.out.println("---------------------------");
    	 System.out.println(factory.getBean("employee"));
     }
}
