package com.prorigo.thrillio.dao;

import com.prorigo.thrillio.DataStore;
import com.prorigo.thrillio.entities.User;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
