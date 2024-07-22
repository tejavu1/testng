package org.day4;

import org.testng.annotations.DataProvider;

public class day4Data {
	
	@DataProvider(name="login",indices= {2,4})
	private Object[][] data() {
		
		Object[][] obj=new Object[][] {
			
			{"Teja1","14654545"},
			{"Teja2","24654545"},
			{"Teja3","34654545"},
			{"Teja4","44654545"},
			{"Teja5","54654545"},
			{"Teja6","64654545"}
		
		

		};
		return obj;
	}	
		
		@DataProvider(name="register")
		private Object[][] data1() {
			
			Object[][] obj=new Object[][] {
				
				{"Teja1","14654545"},
				{"Teja2","24654545"},
				{"Teja3","34654545"},
				{"Teja4","44654545"},
				{"Teja5","54654545"},
				{"Teja6","64654545"}
			
			

				};
			return obj;
	
	
}

}
