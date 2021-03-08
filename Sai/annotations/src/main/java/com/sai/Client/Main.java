package com.sai.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.Service.Service;

public class Main {

	public static void main(String[] args) {
    
		ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(cxt.getBean(Service.class));
	}

}
