package com.triveni.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.triveni.spring.AccountImpl;
import com.triveni.spring.BankImpl;
import com.triveni.spring.LoansImpl;

public class BankClient {

	public static void main(String[] args) {
		Resource resource=new FileSystemResource("C:\\Users\\admin\\eclipse-workspace\\SpringPractice\\src\\com\\triveni\\client\\ApplicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	    BankImpl bank1=(BankImpl) factory.getBean("imp");
	    AccountImpl acct=(AccountImpl) factory.getBean("impls");
	    LoansImpl loan=(LoansImpl) factory.getBean("imp1");
	    System.out.println(bank1);
	    //System.out.println(acct);
	    //System.out.println(loan);

	}

}
