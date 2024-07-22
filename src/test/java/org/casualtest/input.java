package org.casualtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class input {
	
	WebDriver driver;
	
	@Test
	
	public void test() throws InterruptedException {
				
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://letcode.in/edit");
			
			driver.findElement(By.id("fullName")).sendKeys("teja");
			
			System.out.println("1");
			
			driver.findElement(By.xpath("//input[@id='join']")).sendKeys("added new text",Keys.TAB);
			
			System.out.println("2");
			
			WebElement element1 = driver.findElement(By.xpath("//input[contains(@id,'get')]"));
			
			 System.out.println(element1.getAttribute("value"));
			
			 System.out.println("3");
			 
			 Thread.sleep(3000);
			 
			driver.findElement(By.xpath("//input[contains(@value,'Kou')]")).clear();
			
			 System.out.println("4");
			
			boolean enabledornot = driver.findElement(By.id("noEdit")).isEnabled();
			
			System.out.println(enabledornot);
			
			System.out.println("disabled");
			
			 System.out.println("5");
			
			WebElement lastelement = driver.findElement(By.id("dontwrite"));
			
			lastelement.sendKeys("is this a text box");
			
			String text1 = lastelement.getAttribute("value");
			
			System.out.println(text1);
			
			System.out.println("6");
			
			

		}

	}


