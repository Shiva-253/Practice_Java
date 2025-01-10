package com.prorigo.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prorigo.beans.Address;
import com.prorigo.beans.Student;

@Configuration
public class SpringConfFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		
		addr.setHouseno(100);
		addr.setCity("Pune");
		addr.setPincode(390193);
		
		return addr;
	}
	
	@Bean("Std")
	public Student createStudObj() {
		Student stud = new Student();
		
		stud.setRollno(101);
		stud.setName("Krishna");
		stud.setAddress(createAddrObj());
		
		return stud;
	}
}
