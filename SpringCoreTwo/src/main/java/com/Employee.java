package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int empId;
	
	private List<String> skills;
	
	private Set<String> languages;
	
	private Map<String, String> number;

	public Map<String, String> getNumber() {
	    return number;
	}

	public void setNumber(Map<String, String> number) {
	    this.number = number;
	}

	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getSkills() {
		return skills;
	}

	public Set<String> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", skills=" + skills + ", languages=" + languages + ", number=" + number
				+ "]";
	}
}

// How to write a list for a bean tag...
// 
