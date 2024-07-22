package org.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day3test {
	
	WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
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
	@Parameters({"username","username","password"})
	@Test
	private void test1(@Optional("madhu")String username,@Optional("madhu23")String username1, @Optional("hjfhsbfhbhhsdbfhjbds") String password) {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username1);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();

	
	
	}
	
	@Test(invocationCount=3)
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
