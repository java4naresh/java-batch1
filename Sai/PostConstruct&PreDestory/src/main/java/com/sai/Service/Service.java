package com.sai.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sai.Dao.DAO;

@Component
public class Service {

	
	private DAO dao;

	public DAO getDao() {
		return dao;
	}
	@Autowired
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "Service [dao=" + dao + "]";
	}
	   
	  @PostConstruct
      public void New() {
    	  System.out.println("init");
      }
	  @PreDestroy
      public void End() {
    	  System.out.println("destroy");
      }
}
