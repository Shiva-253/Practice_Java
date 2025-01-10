package com.prorigo.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		
		ArrayList<Student> stu = new ArrayList<>();
		stu.add(new Student("Krishna",101,"krishna@gmail.com"));
		stu.add(new Student("Shiva",100,"shiva@gmail.com"));
		stu.add(new Student("Vaishnavi",102,"vaishnavi@gmail.com"));
		stu.add(new Student("Bhramha",99,"bhramha@gmail.com"));
		
		System.out.println(stu.toString());
		
		Collections.sort(stu, new nameComparator());  // Using Comparable
		
		System.out.println(stu.toString());
	}

}
