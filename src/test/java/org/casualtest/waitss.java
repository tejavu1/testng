package org.casualtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitss {
	
	@Test
	
	private void waitssss() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://letcode.in/waits");
		
		driver.findElement(By.id("accept")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		driver.switchTo().alert().accept();
		
		
		
	}
}
