package com.prorigo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private int rollno;
	@Autowired
	private Address address;  // Automatic DI
	
	@Autowired
	private Subjects subjects;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	public void display() {
		System.out.println("Name : "+ name);
		System.out.println("Roll no: "+ rollno);
		System.out.println("Address: "+ address.toString());
	}
	
}
