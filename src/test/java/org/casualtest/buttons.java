package org.casualtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttons {
	
WebDriver driver;
	
	@Test
	
	public void test() throws InterruptedException {
				
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://letcode.in/buttons");
			
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().forward();
			
			System.out.println("1");
			
			Point location = driver.findElement(By.xpath("//button[contains(@id,'pos')]")).getLocation();
	
	System.out.println(location);
	
	System.out.println("2");
	
	String cssValue = driver.findElement(By.xpath("//button[contains(@id,'col')]")).getCssValue("background-color");
	
	System.out.println(cssValue);
	
	System.out.println("3");
	
	Dimension size = driver.findElement(By.xpath("//button[@id='property']")).getSize();
	
	System.out.println(size);
	
	System.out.println("4");
	
	boolean enabledornot = driver.findElement(By.xpath("//button[@id='isDisabled']")).isEnabled();
	
	System.out.println("button is disabled");
	
	System.out.println(enabledornot);

	System.out.println("5");
	
	Actions a=new Actions(driver);
	
	WebElement clickandhold = driver.findElement(By.xpath("//h2[text()='Button Hold!']"));
	
	a.clickAndHold(clickandhold);
	
	System.out.println("6");
	
	
	
	
	
	
	
	
	}}