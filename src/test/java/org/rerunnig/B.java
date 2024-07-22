package org.rerunnig;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(withoutKnownFailed.class)
public class B {
	
	WebDriver driver;
	
	
	
	@Test(groups="Teja")
	private void test1() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("TejaB");
//		driver.findElement(By.id("pass")).sendKeys("1B456454");
		System.out.println("testB1");
		Assert.assertTrue(false);
//		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups="vivek")
	private void test2() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("vivekB");
//		driver.findElement(By.id("pass")).sendKeys("1B456454");
		System.out.println("testB2");
//		System.out.println(Thread.currentThread().getId());

	}
	
	
	@Test(groups="sandhanam")
	private void test3() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("sandhanamB");
//		driver.findElement(By.id("pass")).sendKeys("3B456454");
		System.out.println("testB3");
//		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(groups="muthu")
	private void test4() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("muthuB");
//		driver.findElement(By.id("pass")).sendKeys("5B456454");
		System.out.println("testB4");
//		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(groups="waterman")
	private void test5() {
//		WebDriverManager.edgedriver().setup();
//		 driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("watermanB");
//		driver.findElement(By.id("pass")).sendKeys("6B456454");
		System.out.println("testB5");
		Assert.assertTrue(false);
//		System.out.println(Thread.currentThread().getId());

	}
	
	

}



