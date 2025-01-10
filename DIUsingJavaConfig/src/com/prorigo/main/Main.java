package com.prorigo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prorigo.beans.Student;
import com.prorigo.resources.SpringConfFile;


public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfFile.class);
		
		Student std = (Student) context.getBean("Std");
		std.display();
	}
}
