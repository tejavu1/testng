package org.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2test  {
	WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}

	@AfterClass
	private void afterClass() {
		System.out.println("After class");

	}
	
	
	@BeforeMethod
	private void beforemethod() {
	System.out.println("Befoore method");

	}
	
	@AfterMethod
	private void afterMethod() {
	System.out.println("after method");

	}
	
	@Test(enabled=true,invocationCount=3)
	private void test1() {
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("teja");
	driver.findElement(By.id("pass")).sendKeys("6546524");
	driver.findElement(By.name("login")).click();
	}
	
	@Test(priority=-1)
	private void test2() {
		driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		  driver.findElement(By.name("firstname")).sendKeys("teja");
		    driver.findElement(By.name("lastname")).sendKeys("vu");
		    driver.findElement(By.name("reg_email__")).sendKeys("teja@gmail.com");
		    driver.findElement(By.name("reg_passwd__")).sendKeys("teja@gmail.com");
		    driver.findElement(By.xpath("(//button[contains(@class,'_6j mvm')])[1]")).click();
		    

	}
}
