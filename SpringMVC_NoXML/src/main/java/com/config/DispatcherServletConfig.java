package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig extends  AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
	/*
	 * no need to change the above 
	 */

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClasses = {Config.class};
		return configClasses;
	}

	/*
	 * It requires some classes .. 
	 * It need the configuration classes .. 
	 * it needs the config class of array type of class 
	 */
	@Override
	protected String[] getServletMappings() {
		String[] mappings = {"/answer/*"}; // size assigned to one and the array cannot be modified 
		return mappings;
	}
	/*
	 * we has to give the mapping like /answer/* -> using the method 
	 */

}
