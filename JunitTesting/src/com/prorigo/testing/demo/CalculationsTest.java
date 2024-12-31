package com.prorigo.testing.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculationsTest {

	Calculations cal = new Calculations();
	
	@DisplayName("Test for add operation")
	@Test
	void addTest() {
		int addition = cal.add(12, 23);
		int expected = 35;
		assertEquals(addition, expected);
	}
	
	@DisplayName("Test for sub operation")
	@Test
	void subTest() {
		int subtraction = cal.sub(-12, -23);
		int expected = 11;
		assertEquals(subtraction, expected);
	}
	
	@DisplayName("Test for comparing Strings")                  // Used to give some different names to our test cases
	@Test
	void compareStringsTest() {
		String s1 = "Ram";
		String s2 = "Ram";
		String s3 = new String("Ram");
		assumeTrue(cal.compareStrings(s1,s3));
		assertTrue(cal.compareStrings(s1,s2));
	
	}
	
	@Disabled                           // Can disabled test cases
	void compareStringsnewTest() {
		String s1 = "Ram";
		String s2 = "Ram";
		String s3 = new String("Ram");
		assumeTrue(cal.compareStrings(s1,s3));
		assertTrue(cal.compareStrings(s1,s2));
		assumeFalse(cal.compareStrings(s1,s3));
	
	}

}
