package com.prorigo.demo;

public class Student {
	private String name;
	private int rollno;
	private String email;
	
	public Student(String name, int rollno, String email) {
		this.name = name;
		this.rollno = rollno;
		this.email = email;
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", email=" + email + "]";
	}

//	@Override
//	public int compareTo(Student o) {
//		if( this.getRollno() > o.getRollno()) {
//			return 1;
//		}
//		else if(this.getRollno() < o.getRollno()) {
//			return -1;
//		}
//		return 0;
//	}
}
