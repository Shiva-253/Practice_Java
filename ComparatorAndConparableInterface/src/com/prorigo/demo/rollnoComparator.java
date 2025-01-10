package com.prorigo.demo;

import java.util.Comparator;

public class rollnoComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getRollno() > o2.getRollno()) {
			return 1;
		}else if(o1.getRollno() < o2.getRollno()) {
			return -1;
		}
		return 0;
	}

}
