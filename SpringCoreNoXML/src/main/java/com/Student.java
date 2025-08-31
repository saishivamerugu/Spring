package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	@Value("${id}")
	private int studentId;
	
	@Value("${name}")
	private String name;
//	@Autowired
	private Address address;
//	@Autowired
	public Student() {
	}
	
	public Student(int studentId,String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + "]";
	}
}

