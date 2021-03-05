package com.triveni.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.triveni.spring.A;
import com.triveni.spring.Citizen;
import com.triveni.spring.Student;

public class CitizenClient {

	public static void main(String[] args) {
		Resource resource=new FileSystemResource("D:\\Users\\admin\\eclipse-workspace\\SpringPractice\\src\\com\\triveni\\client\\applicationContext.xml");  
	   //BeanFactory factory=new XmlBeanFactory(resource);
	    ApplicationContext ctx=new FileSystemXmlApplicationContext("D:\\Users\\admin\\eclipse-workspace\\SpringPractice\\src\\com\\triveni\\client\\applicationContext.xml");
	   // Citizen c1=(Citizen) factory.getBean("citizen");
		//Student s1=(Student) factory.getBean("student");
		//A a1= (A) factory.getBean("a");
		//System.out.println(c1);
		//System.out.println(s1);
		//System.out.println(a1);
		//main(factory);
	}
	public static void main(BeanFactory factory) {
		Citizen c1=(Citizen) factory.getBean("citizen");
		Student s1=(Student) factory.getBean("student");
		
		System.out.println(c1);
		System.out.println(s1);
	}

	}

