package com;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	// I need JdbcTemplate but it is Pre - defined class 
	// So i need a bean .. for it so now we write a method 
	// which return a JdbcTemplate - on this method we annotate with the Bean
	// The object we return manually this is captured by the spring and handled by spring as a singleton pattern
	// It ensures to create the object only once ... 
	// @Bean -> the returning object is handled by the spring ...
	// We has to pass the data source
	
	@Bean("template") // <- name for the bean 
	public JdbcTemplate getJdbcTemplate() {
		DataSource dataSource = getDataSource();
		return new JdbcTemplate(dataSource); // the returning object is handled by the spirng .. using @Bean annotation
	}
	
	// TO this JDBC template we has to pass the data source...
	
	// We are returning the DMDS but type is DataSource it works .. because it is the parent 
	@Bean("dmds")
	public DataSource getDataSource() { // URL, USERNAME, PASSWORD
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/spring","root","root");
	}
	
	// JdbcTemplate needs the data source we has to call the method ... 
}
