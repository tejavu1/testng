package org.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B {
	
	WebDriver driver;
	
	
	
	@Test(groups="Teja")
	private void test1() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("TejaB");
		driver.findElement(By.id("pass")).sendKeys("1B456454");

	}
	
	@Test(groups="vivek")
	private void test2() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vivekB");
		driver.findElement(By.id("pass")).sendKeys("1B456454");

	}
	
	@Test(groups="surya")
	private void test3() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("suryaB");
		driver.findElement(By.id("pass")).sendKeys("2B456454");
	}
	
	@Test(groups="sandhanam")
	private void test4() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sandhanamB");
		driver.findElement(By.id("pass")).sendKeys("3B456454");

	}
	
	@Test(groups="alwin")
	private void test5() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("alwinB");
		driver.findElement(By.id("pass")).sendKeys("4B456454");
	}
	
	
	
	@Test(groups="muthu")
	private void test6() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("muthuB");
		driver.findElement(By.id("pass")).sendKeys("5B456454");

	}
	
	@Test(groups="waterman")
	private void test7() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("watermanB");
		driver.findElement(By.id("pass")).sendKeys("6B456454");

	}
	
	

}



