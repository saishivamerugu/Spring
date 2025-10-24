package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com")
@EnableWebMvc
public class Config {
	
	@Bean // <- To register this bean at the spring container and it is a pre-defined class so i can't use the @Component
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/views/");
		irvr.setSuffix(".jsp");
		return irvr;
	}	
	
	public DispatcherServlet dispatcherServlet() {
		DispatcherServlet ds = new DispatcherServlet();
		return ds;
		
	}
}


// If we want to use the mvc we has to use the EnableWebMVC annoataion 
/*
 * Here we are enabling the enableWebmvc 
 * similar to the web orm .. 
 * 
 * 
 * We has to configure the ds - configuration
 * we have the url pattern 
 * the main role is url pattern .. all the requests work on them 
 * it is the main part 
 * to work with it we have a class 
 *AbstractAnnotationConfigDispatcherServletInitialize 
 *
 * it is an abstract 
 * we are congiuring the dispatcher servlet using the annoatiaion conig for iitalising the nean of the dispatcher servlet 
 * 
 * the abstract class have some implememntations we have to extend that class and we will 
 * do those methods 
 * 
 * give implementation to those methods 
 * extend that class and work with it 
 *  
 */



