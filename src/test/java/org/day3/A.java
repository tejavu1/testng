package org.day3;

import org.testng.annotations.*;

public class A {
	
	@Parameters({"username","password"})
	@Test
	private void test1(String user, String pass) {
		System.out.println("test1A");
		System.out.println(user);
		System.out.println(pass);
		

	}
	
	@Test
	private void test2() {
		System.out.println("test2A");

	}
	
	@Test
	private void test3() {
		System.out.println("test3A");

	}

}
