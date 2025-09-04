package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		TestSim testSim = container.getBean("testSim",TestSim.class);
		
		testSim.addCall();
		
	}
}

/*
 * 
 * Qualifier is used to qualify a bean which bean to inject 
 * 
 * @Primary -> we can directly annotate class as @Primary -> when we autowire this class is picked 
 * 
 * Qualifier have more preecedence than the 
 */
