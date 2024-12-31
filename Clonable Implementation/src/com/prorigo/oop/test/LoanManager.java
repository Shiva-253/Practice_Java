package com.prorigo.oop.test;

public class LoanManager {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		Customer customer = customerManager.getCustomer("BOA123");

	}

}
