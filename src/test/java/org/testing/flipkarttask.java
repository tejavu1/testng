package org.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkarttask {
	
	WebDriver driver;
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(@class,'30jeq3')]"));
		
//		List<Double> price1=new ArrayList(); 
		
		for(WebElement pricelist:prices ) {
			
//			String price = pricelist.getText().replaceAll("[^a-zA-Z0-9]", "");
//			
//			System.out.println(price);
			
			List<WebElement> price = pricelist.getText();
			
			for(WebElement finallist:price) {
				
				
			}
			
			
			
			
		}
		
		
//		List<Double> ascprices=new ArrayList();
//		
//		for(WebElement price:pricelist) {
//			
//			String pricetext = price.getText().replaceAll("[^\\d.]", "");
//			
//			 double price = Double.parseDouble(priceText);
//	            prices.add(price);
//			
//	Collections.sort(ascprices);
//			
//		}
//	
//		
//		
//	}


//		 List<Double> prices = new ArrayList();
//	        for (WebElement element : pricelist) {
//	            String priceText = element.getText().replaceAll("[^a-zA-Z0-9]", ""); // Remove non-numeric characters
//	            double price = Double.parseDouble(priceText);
//	            prices.add(price);
//	        }
//
//	        // Sort the prices in ascending order
//	        Collections.sort(prices,Collections.reverseOrder());
//
//	        // Print the prices in ascending order
//	        for (Double price : prices) {
//	            System.out.println(price);
//	        }
//
//	        // Close the WebDriver
//	        driver.quit();
//	    }
//	
}
}