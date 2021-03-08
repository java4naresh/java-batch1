package com.divya.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuartion annotation is used instead of dependencies in XML File
@Configuration
public class CustomConfig 
{
	//Instead of creating XML file bean id(object creation) ,we use @Bean Annotation for creating Object 
	//Manually creating object
	@Bean
	public Demo1 getDemo1() 
	{
		return new Demo1();
	}
	@Bean
	public Demo2 getDemo2()
	{
		return new Demo2();
	}
	

}
