package com.divya.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.divya.spring.CollegeDepartments;

public class CollegeMainClass {

	public static void main(String[] args)
	{
		Resource resource=new FileSystemResource("H:\\Git\\repo\\Divya\\SpringCoreApp\\src\\com\\divya\\xml\\collegeApplication.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);  
		CollegeDepartments details=(CollegeDepartments) factory.getBean("dept");
		System.out.println(details);
	}

}
