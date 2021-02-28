package com.divya.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.divya.spring.SpringEmp;

public class EmpMainClass {

	public static void main(String[] args) 
	{
		Resource resource=new FileSystemResource("H:\\Git\\repo\\Divya\\SpringCoreApp\\src\\com\\divya\\client\\applicationContext.xml");  
		  BeanFactory factory=new XmlBeanFactory(resource);  
		  SpringEmp e1= (SpringEmp) factory.getBean("record1"); // we can pass beanId or name to get the object from the spring Container
		  System.out.println(e1);
		 // SpringEmp e2= (SpringEmp) factory.getBean("emp2");
		 // System.out.println(e2);


	}

}
