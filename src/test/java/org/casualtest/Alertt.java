package org.casualtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertt {
	
	WebDriver driver;
	
	@Test
	
	public void Alert() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("accept")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println("1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirm")).click();
		
		String text2 = driver.switchTo().alert().getText();
		
		System.out.println(text2);
		
		driver.switchTo().alert().dismiss();
		
		System.out.println("2");
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Teja");
		driver.switchTo().alert().accept();
		
		System.out.println("3");
	
		
		driver.findElement(By.id("modern")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		
		System.out.println("4");
	}

}
