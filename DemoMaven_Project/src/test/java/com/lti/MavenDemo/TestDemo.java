package com.lti.MavenDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDemo {
	
	@Test
	void strcheck() {
		String s1 = "Demo1";
		System.out.println("This is TEST CASE for String Check");
		assertEquals("Demo1",s1);
	}
}
