package com.syed.multiconfig.bean;

public class Teacher {
	
	private String name;
	private School school;
	
	public Teacher(String name, School school) {
		super();
		this.name = name;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", school=" + school + "]";
	}
	
	
}
