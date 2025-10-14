package com;

public class Student {
	
	private int studentId;
	
	private String name;
	@Autowire
	private Address address;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
	}
	
	public Student(int studentId, String name, Address address) {
	    this.studentId = studentId;
	    this.name = name;
	    this.address = address;
	}

		

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
}


