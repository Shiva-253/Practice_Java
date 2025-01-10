package com.prorigo.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prorigo.beans.Address;
import com.prorigo.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		Address add = new Address();
		
		add.setHouseno(100);
		add.setCity("Pune");
		add.setPincode(424525);
		
		return add;
	}
	
	@Bean
	public Student createStdObj() {
		Student stud = new Student();
		
		stud.setName("Krishna");
		stud.setRollno(101);
		//stud.setAddress(createAddrObj());  // manually DI
		
		return stud;
	}
	
}
