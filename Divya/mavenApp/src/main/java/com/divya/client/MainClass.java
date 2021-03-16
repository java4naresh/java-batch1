package com.divya.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.divya.dao.EmployeeDAO;

public class MainClass {

	public static void main(String[] args) 
	{
		/*Resource resource=new ClassPathResource("appContext.xml");
	       BeanFactory factory= new XmlBeanFactory(resource);
	         System.out.println(factory.getBean("bike"));
	         System.out.println(factory.getBean("aClass"));*/
	         
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
		EmployeeDAO dao=app.getBean(EmployeeDAO.class);
		dao.printAllEmployees();
		dao.printSalary(39);
		dao.printName(39);
		dao.insert(52,"Hasini","Analyst",15000);
		dao.update(39,"M.Divya");
		dao.delete(46);
	}

}
