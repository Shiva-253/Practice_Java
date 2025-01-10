package com.prorigo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prorigo.beans.Student;


public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/prorigo/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdId");
		std.display();
	}
}
