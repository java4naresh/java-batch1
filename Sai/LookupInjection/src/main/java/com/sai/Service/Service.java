package com.sai.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sai.Dao.DAO;


public class Service {

	
	private DAO dao;

	public DAO getDao() {
		return dao;
	}
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	public void m1() {
		AbstractApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		dao=cxt.getBean(DAO.class);
		System.out.println(dao);
	}
	public void m2() {
		AbstractApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		dao=cxt.getBean(DAO.class);
		System.out.println(dao);
	}

	@Override
	public String toString() {
		return "Service [dao=" + dao + "]";
	}
	   
	  
      public void New() {
    	  System.out.println("init");
      }
	  
      public void End() {
    	  System.out.println("destroy");
      }
}
