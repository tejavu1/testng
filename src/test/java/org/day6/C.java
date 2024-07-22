package org.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C {
	
	WebDriver driver;
	
	
	
	@Test(groups= {"Teja", "muthu"})
	private void test1() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("TejaC");
//		driver.findElement(By.id("pass")).sendKeys("0C456454");
		System.out.println("testC1");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(groups= {"vivek", "sandhanam"})
	private void test2() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("vivekC");
//		driver.findElement(By.id("pass")).sendKeys("1C456454");
		System.out.println("testC2");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(groups= {"sandhanam", "muthu", "Teja", "vivek"})
	private void test3() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("sandhanamC");
//		driver.findElement(By.id("pass")).sendKeys("3C456454");
		System.out.println("testC3");
		System.out.println(Thread.currentThread().getId());

	}
		
	
	@Test(groups= {"muthu", "sandhanam", "Teja"})
	private void test4() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("muthuC");
//		driver.findElement(By.id("pass")).sendKeys("5C456454");
		System.out.println("testC4");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(groups="waterman")
	private void test5() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("watermanC");
//		driver.findElement(By.id("pass")).sendKeys("6C456454");
		System.out.println("testC5");
		System.out.println(Thread.currentThread().getId());

	}
	
	

}
