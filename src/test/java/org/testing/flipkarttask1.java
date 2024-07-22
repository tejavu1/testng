package org.testing;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkarttask1 {
	
WebDriver driver;
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		List<WebElement> allprices = driver.findElements(By.xpath("//div[contains(@class,'30jeq3')]"));
		
		for(WebElement addprices:allprices) {
			
		String printpricelist = addprices.getText();
			System.out.println(printpricelist);
			
Set<Double> s1=new TreeSet<Double>();
            
           
		
		}
		
            
		
}
	
}