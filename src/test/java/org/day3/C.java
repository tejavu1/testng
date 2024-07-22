package org.day3;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C {
	@Parameters({"password"})
	@Test
	private void test1(String pass) {
		System.out.println("test1C");
		System.out.println(pass);
	}
		
		@Test
		private void test2() {
			System.out.println("test2C");
		}		
		
		@Parameters({"username","password"})
			@Test
			private void test3(@Optional("madhu")String user, @Optional("hjfhsbfhbhhsdbfhjbds") String pass) {
				System.out.println("test3C");
				System.out.println(user);
				System.out.println(pass);
				
			}

}
