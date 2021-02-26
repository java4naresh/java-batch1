package com.sai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sai.Student;

public class Test {

	public static void main(String[] args) {
		  Resource resource=new FileSystemResource("S:\\Repo\\java-batch1\\Sai\\SprinFirstPro\\src\\com\\sai\\application-context.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		    Student s=(Student) factory.getBean("st");
		    System.out.println(s);
		    
		    
		
		  }
		
	

}
