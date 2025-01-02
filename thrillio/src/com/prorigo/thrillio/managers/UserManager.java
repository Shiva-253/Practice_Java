package com.prorigo.thrillio.managers;

import com.prorigo.thrillio.entities.User;

public class UserManager { // Singleton Class
	private static UserManager instance = new UserManager();
	private UserManager() {} // As constructor is private it cannot be  accessed to create an object
	
	public static UserManager getInstance() {
		return instance;
	}
	
	public User createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;
	}
}
