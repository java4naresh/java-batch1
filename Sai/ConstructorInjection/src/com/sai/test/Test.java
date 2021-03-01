package com.sai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sai.bean.Bank;

public class Test {

	public static void main(String[] args) {
		 Resource resource=new FileSystemResource("S:\\Repo\\java-batch1\\Sai\\ConstructorInjection\\src\\com\\sai\\config\\application-context.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);
            Bank b=(Bank) factory.getBean("bank");
            System.out.println(b);
	}

}
