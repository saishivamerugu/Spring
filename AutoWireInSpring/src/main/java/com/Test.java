package com;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Context Loaded");
		
		Student student = container.getBean("st",Student.class);
		
		System.out.println(student);
		System.out.println(student.getAddress());
	}
}
