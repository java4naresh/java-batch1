package com.sai.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.Service.Service;

public class Main {

	public static void main(String[] args) {
    
		//ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		AbstractApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		Service s=cxt.getBean(Service.class);
		s.m1();
		s.m2();
		cxt.close();
	}

}
