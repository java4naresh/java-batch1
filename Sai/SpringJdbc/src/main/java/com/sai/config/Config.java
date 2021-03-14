package com.sai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	  @Bean
	  public JdbcTemplate getTemplate() {
		 DriverManagerDataSource dm=new DriverManagerDataSource();
		  dm.setDriverClassName("com.mysql.jdbc.Driver");
		  dm.setUrl("jdbc:mysql://localhost:3306/javabatch");
		  dm.setUsername("root");
		  dm.setPassword("sai25");
		  JdbcTemplate template=new JdbcTemplate();
		  template.setDataSource(dm);
		return template;
		  
	  }
		
	
	
}
