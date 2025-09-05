package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate template = container.getBean("template", JdbcTemplate.class);
		
		template.update("Insert into employees values(?,?,?)",1,"akash",40000);
		System.out.println("Data Updated!...");
		List<Employees> employees = template.query(
			    "select * from employees",
			    (rs, num) -> new Employees(rs.getInt(1), rs.getString(2), rs.getDouble(3))
			);
		System.out.println(employees);
	}
}
