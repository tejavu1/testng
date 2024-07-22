package org.day3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {
	
	@Test
	private void test1() {
		System.out.println("test1B");
	}
	@Parameters({"username"})
		@Test
		private void test2(String user) {
			System.out.println("test2B");
			System.out.println(user);
		}		
			@Test
			private void test3() {
				System.out.println("test3B");
			}
}
