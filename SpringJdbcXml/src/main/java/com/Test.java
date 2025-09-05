package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Test {

	public static void main(String[] args) {
//		addEmployee();
//		updateEmployee();
//		deleteEmployee();
//		retriveEmployee();
//		retriveAllEmployees();
		
		retriveUsingLambdaExpression();


		

	}

	private static void retriveUsingLambdaExpression() {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = container.getBean("template",JdbcTemplate.class);
		List<Employees> employees = template.query(
			    "select * from employees",
			    (rs, num) -> new Employees(rs.getInt(1), rs.getString(2), rs.getDouble(3))
			);
			System.out.println(employees);
	}

	private static void retriveAllEmployees() {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = container.getBean("template",JdbcTemplate.class);
		List<Employees> list = template.query("select * from employees", new RowMapper<Employees>() {
		    @Override
		    public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
		        return new Employees(rs.getInt(1), rs.getString(2), rs.getDouble(3));
		    }
		});
		System.out.println(list);
	}

	private static void retriveEmployee() {
		// we use RowMapper rather than the result set it is more good than the resultSet
		// But RowMapper is an interface we cannot create the object .. but we can store the address or we can write the lambda expression or anonymous implementation
		// IT expects a row mapper it may be lambda or anonymous inner type
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = container.getBean("template",JdbcTemplate.class);
		Employees employee = template.queryForObject("select *from employees where id=?", new RowMapper<Employees>() {
			// we has to override a method called mapRow inside the anonymous inner class
			@Override
			public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Employees(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			}
		},3);
		System.out.println(employee);
	}

	private static void deleteEmployee() {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = container.getBean("template",JdbcTemplate.class);
		template.update("delete from employees where id=?",1);
		System.out.println("data updated");
	}

	private static void updateEmployee() {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = container.getBean("template",JdbcTemplate.class);
		template.update("update employees set name=? where id = ?","sai",1);
		System.out.println("data updated");
	}

	private static void addEmployee() {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = container.getBean("template",JdbcTemplate.class);
		template.update("Insert into employees values(?,?,?)",1,"akash",40000);
		// at 1st parameter it takes only query ... from second it takes multiple parameters using the var args
		System.out.println("data updated");
	}
}
