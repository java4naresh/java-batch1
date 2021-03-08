package com.divya.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divya.annotation.CustomConfig;
import com.divya.annotation.Demo1;
import com.divya.annotation.Demo2;
import com.divya.pen.Pen;

public class MainClass {

	public static void main(String[] args)
	{
/*		ApplicationContext app=new AnnotationConfigApplicationContext(CustomConfig.class);
		System.out.println(app.getBean(Demo1.class));
		System.out.println(app.getBean(Demo2.class));
*/	
		ApplicationContext app1=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(app1.getBean(Pen.class));

	}

}
