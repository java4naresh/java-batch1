package com.divya.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.divya.spring.Spring1;
import com.divya.spring.Spring2;

public class SpringMain
{

	public static void main(String[] args)
	{
		  Resource resource=new FileSystemResource("H:\\Git\\repo\\Divya\\SpringCoreApp\\src\\com\\divya\\client\\applicationContext.xml");  
		  BeanFactory factory=new XmlBeanFactory(resource);  
		  Spring1 s1=(Spring1) factory.getBean("spring1");
		  Spring2 s2=(Spring2) factory.getBean("spring2");
		  m1(factory);
		  System.out.println(s1);
		  System.out.println(s2);
				   
	}
	//IN m1(),again we created object,but in spring we call it as reusing the object again and again...
	//so if we create multiple times also,it will reuse the same(Multiple Objects will not create and space will saved)
	public static void m1( BeanFactory factory)
	{
		Spring1 s1=(Spring1) factory.getBean("spring1");
		Spring1 spr1=(Spring1) factory.getBean("spr1");
		System.out.println(spr1);
	}

}
