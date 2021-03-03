package com.divya.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpMain {

	public static void main(String[] args)
	{
		Resource resource=new ClassPathResource("scopes.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		//System.out.println(factory.getBean("employee"));
		//singleton(factory);
		System.out.println(factory.getBean("emp1"));
		//prototype(factory);
		System.out.println(factory.getBean("emp2"));
		System.out.println(factory.getBean("emp2"));
	}
	//SINGLETON SCOPE-if we create object multiple times also,same object will be reused and singleton scope is default scope
	//To verify singleton scope,then remove tostring() and check same object address will be created in the entire application
	public static void singleton(BeanFactory factory)
	{
		System.out.println(factory.getBean("employee"));

	}
	//PROTOTYPE SCOPE-multiple objects will be created
	public static void prototype(BeanFactory factory)
	{
		System.out.println(factory.getBean("emp1"));

	}
}
