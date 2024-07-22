package org.casualtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framess {
	
	WebDriver driver;
	
	@Test
	
	public void framessss() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/frame");
		
		WebElement frame1 = driver.findElement(By.id("firstFr"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.name("fname")).sendKeys("Teja");
		driver.findElement(By.name("lname")).sendKeys("vu");
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		

	}

}
