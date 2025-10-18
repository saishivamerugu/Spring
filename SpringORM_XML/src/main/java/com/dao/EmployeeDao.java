package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.model.Employees;
import jakarta.transaction.Transactional;

@Component
@Transactional
public class EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Employees getEmployees(int id) {
    	Session session = getSession();
    	Employees employees = session.find(Employees.class, id);
    	return employees;
    }
    
    public void saveEmployees(Employees emp) {
    	Session session = getSession();
    	session.persist(emp);
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}

// It takes only one session until we will close the session and 
// If we use openSession it will create the session every time 