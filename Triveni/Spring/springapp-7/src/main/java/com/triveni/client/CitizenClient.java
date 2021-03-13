package com.triveni.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.triveni.spring.Citizen;

public class CitizenClient {

	public static  void main(String[] args) {
			Resource resource=new FileSystemXmlApplicationContext("C:\\Users\\admin\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\springapp-7\\src\\main\\resources\\applicationContext.xml");  
			BeanFactory bf= new xmlBeanFactory(resource);
		   // ApplicationContext ctx=new FileSystemXmlApplicationContext("D:\\Users\\admin\\eclipse-workspace\\SpringPractice\\src\\com\\triveni\\client\\applicationContext.xml");
		    Citizen c1=(Citizen) bf.getBean("citizen");
			//Student s1=(Student) factory.getBean("student");
			//A a1= (A) factory.getBean("a");
			System.out.println(bf.getBean("citizen");
			//System.out.println(s1);
			//System.out.println(a1);
			//main(factory);
		}
}
