package org.testing;

import org.testng.annotations.*;

public class sample {
	
	@BeforeClass(enabled=false)
	private void beforeclass() {
System.out.println("before class");
	}

	@AfterClass(enabled=false)
	private void afterclass() {
System.out.println("after class");
	}
	
	@BeforeMethod(enabled=false)
	private void beforemethod() {
System.out.println("before method");
	}
	
	@AfterMethod(enabled=false)
	private void aftermethod() {
System.out.println("after method");
	}
	
	@Test(enabled=true,invocationCount=10)
	private void test1() {
System.out.println("test1");
	}
	
	@Test(enabled=true)
	private void test2() {
	System.out.println("test2");	

	}
	
	
	
	
	
	
	
}
