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
