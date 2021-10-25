package com.naresh.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext.xml");
		//BeanFactory ctx = new XmlBeanFactory(r);
		//ApplicationContext ctx = new ClassPathXmlApplicationContext();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Dependent mi =  (Dependent) ctx.getBean("dep");
	    System.out.println(mi);
	    //Dependent mi2 =  (Dependent) ctx.getBean("dep");
	    //mi2.setMi((MyInterface)factory.getBean("id3"));
		System.out.println(mi.hashCode());
		//System.out.println(mi2.hashCode());
		/*System.out.println(mi.getDependency().getClass());
		System.out.println(mi.getDependency4().getClass());
		System.out.println(mi2.getDependency().getClass());
		System.out.println(mi2.getDependency4().getClass());*/
		
		System.out.println(mi.getMi().getClass());
		System.out.println(mi.getMi2().getClass());
		//System.out.println(mi2.getMi().getClass());
		//System.out.println(mi2.getMi2().getClass());
	}

}
