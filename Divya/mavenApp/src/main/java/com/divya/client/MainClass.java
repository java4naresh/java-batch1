package com.divya.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) 
	{
		/*Resource resource=new ClassPathResource("appContext.xml");
	       BeanFactory factory= new XmlBeanFactory(resource);
	         System.out.println(factory.getBean("bike"));
	         System.out.println(factory.getBean("aClass"));*/
	         
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");

	}

}
