package com.sai.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.dao.EmployeeDao;

public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao dao=cxt.getBean(EmployeeDao.class);
          dao.AllEmloyees();
         dao.ListOfEmployees();
         dao.insert("Ram", 100, 1007, "SE");
         

	}

}
