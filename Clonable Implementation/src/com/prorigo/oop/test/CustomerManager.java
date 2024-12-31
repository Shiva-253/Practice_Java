package com.prorigo.oop.test;

public class CustomerManager {
	
	public Customer getCustomer(String acctId) {
		Customer customer = fetchCustomer(acctId);
		Customer clone = customer.clone();
		
		if (clone != null && clone != customer) {
			System.out.println("Clone successful");
			
			String[] accountTypes = clone.getAccountTypes();
			accountTypes[1] = "jfid";
			
			clone.setCreditScore(200);
			
			System.out.println(clone.toString());	
			
			System.out.println(customer.toString());	
		}
		
		return customer;
	}
	
	private Customer fetchCustomer(String acctId) {
		Customer customer = new Customer(acctId, "Krishna", 400, new String[] {"savings", "current"} );
		return customer;
	}
}
