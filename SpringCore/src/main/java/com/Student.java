package com;

public class Student {
	
	private int studentId;
	private String name;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		System.out.println("Constructor object called");
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

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
}

//I have student class i have an id
// But how to create the object 
// How to give the id value to the values 
//1. using the property -- 
//  it calls setter setter to set value 
//2. Constructor - arg tag --- it calls constructor to set value

// we has to write only one object ok ...