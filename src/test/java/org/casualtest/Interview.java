package org.casualtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview {
	
	@Test
	
	private void interview() {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://news.google.com/");

	driver.findElement(By.xpath("(//a[@class='WwrzSb'])[1]")).click();
	
	Set<String> allwindows = driver.getWindowHandles();
	
	List<String> li=new ArrayList();
	
	li.addAll(allwindows);
	
	driver.switchTo().window(li.get(1));
	
	String pagetitle = driver.getTitle();
	
	
	Assert.assertTrue(pagetitle.contains("India T20"), "title fetch failed");
		
	System.out.println("done1");
	
	WebElement pageheading = driver.findElement(By.xpath("//h1[contains(text(),'India')]"));
	
	String texthead = pageheading.getText();
		
	Assert.assertTrue(texthead.contains("India T20"), "page heading not equal");
	
	System.out.println("done2");
	
	
	
	
	}

}
