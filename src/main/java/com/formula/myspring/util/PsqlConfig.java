package com.formula.myspring.util;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class PsqlConfig {
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource driver = new DriverManagerDataSource();
		driver.setDriverClassName("org.postgresql.Driver");
		driver.setUrl("jdbc:postgresql:activitydb");
		driver.setUsername("ptadmin");
		driver.setPassword("P@ssw0rd");
		return driver;
	}
	
}
