package com.example.demo.dep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.demo");
		System.out.println(ctx.getBean("dependent"));
	}

}
