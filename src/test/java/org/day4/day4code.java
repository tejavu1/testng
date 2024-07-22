package org.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4code {
	
	WebDriver driver;
	@BeforeMethod
	private void beforeMethod() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	@Test(dataProvider="login", dataProviderClass=day4Data.class)
	private void test1(String user, String pass) {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();


	}

	@Test(dataProvider="register", dataProviderClass=day4Data.class)
	private void test2(String user, String pass) {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		


	}

	
	
	}
