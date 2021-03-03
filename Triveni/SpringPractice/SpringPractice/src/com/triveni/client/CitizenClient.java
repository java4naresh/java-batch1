package com.triveni.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.triveni.spring.Citizen;
import com.triveni.spring.Student;

public class CitizenClient {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\SpringPractice\\\\src\\\\com\\\\triveni\\\\client\\\\ApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Citizen c1=(Citizen) factory.getBean("citizen");
		Student s1=(Student) factory.getBean("student");
		System.out.println(c1);
		System.out.println(s1);
		main(factory);
	}
	public static void main(BeanFactory factory) {
		Citizen c1=(Citizen) factory.getBean("citizen");
		Student s1=(Student) factory.getBean("student");
		
		System.out.println(c1);
		System.out.println(s1);
	}
}
