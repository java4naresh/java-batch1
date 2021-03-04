package com.sai.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
          
		Resource resource=new ClassPathResource("applicationContext.xml");
	       BeanFactory factory= new XmlBeanFactory(resource);
	         System.out.println(factory.getBean("car"));
	         System.out.println(factory.getBean("un"));
	         
		//ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		

	}

}
