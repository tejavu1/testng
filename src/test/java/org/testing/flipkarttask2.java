package org.testing;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkarttask2 {

	
WebDriver driver; 
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		
		List<WebElement> proddesc = driver.findElements(By.className("_4rR01T"));
		
		for(List<WebElement> newproddesc:proddesc) {
			
			Map proddesc1 = newproddesc.getText();
			
			Map mp1=new LinkedHashMap();
			
			mp1.putAll(proddesc1);
			
			
		}
			
//			String printprod = newproddesc.getText();
//			
//			System.out.println(printprod);
//			
//		}
//			
//			List<WebElement> prices = driver.findElements(By.xpath("//div[contains(@class,'30jeq3')]"));
//		
//			for(WebElement newprices:prices) {
//				
//				String printprices = newprices.getText();
//				System.out.println(printprices);
//			}
//			
//          Map<String,String> mp=new LinkedHashMap();
//			
//			mp.put(printprod, printprices);
//			
//		System.out.println(mp);
//		}
//	
	
	
}}