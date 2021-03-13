package com.divya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class CustomConfiguration
{
	@Bean
	public JdbcTemplate getTemplate()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/javabatch1");
		ds.setUsername("root");
		ds.setPassword("4420");
		JdbcTemplate temp=new JdbcTemplate();
		temp.setDataSource(ds);
		return temp;
	}
}
