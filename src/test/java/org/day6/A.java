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

public class A {
	
	WebDriver driver;
	
	
	
	@Test(groups= {"Teja", "muthu"})
	private void test1() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("TejaA");
//		driver.findElement(By.id("pass")).sendKeys("0A456454");
		System.out.println("testA1");
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
//		driver.findElement(By.id("email")).sendKeys("vivekA");
//		driver.findElement(By.id("pass")).sendKeys("1A456454");
		System.out.println("testA2");
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
//		driver.findElement(By.id("email")).sendKeys("sandhanamA");
//		driver.findElement(By.id("pass")).sendKeys("3A456454");
		System.out.println("testA3");
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
//		driver.findElement(By.id("email")).sendKeys("muthuA");
//		driver.findElement(By.id("pass")).sendKeys("5A456454");
		System.out.println("testA4");
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
//		driver.findElement(By.id("email")).sendKeys("watermanA");
//		driver.findElement(By.id("pass")).sendKeys("6A456454");
		System.out.println("testA5");
		System.out.println(Thread.currentThread().getId());

	}
	
	

}
