package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;

import org.hibernate.SessionFactory;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao employeeDao = container.getBean("employeeDao",EmployeeDao.class);
		Employees employee = employeeDao.getEmployees(1);
		System.out.println(employee);
		employeeDao.saveEmployees(new Employees(0, "akash", 234567));
	}
}
