package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;

@Component("dao")
@Transactional
public class EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Employee getEmployee(int id) {
		Session session = getSession();
		Employee employee = session.find(Employee.class, id);
		return employee;
	}
	
	public void saveEmployee(Employee emp) {
		Session session = getSession();
		session.persist(emp);
		
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
