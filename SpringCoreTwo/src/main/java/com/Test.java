package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Context Loaded");
		
		Employee emp = container.getBean("emp",Employee.class);
		System.out.println(emp);
		System.out.println(emp.getSkills());
		System.out.println(emp.getLanguages());
		System.out.println(emp.getNumber());
	}
}
