package org.casualtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowss {
	
	
	
	@Test
	
	private void windowshandling() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/windows");
		
		WebElement firstbutton = driver.findElement(By.id("home"));
		
		firstbutton.click();
		
		Set<String> handles = driver.getWindowHandles();

		System.out.println(handles);
		
	List<String>	li=new ArrayList<String>();
	
	li.addAll(handles);
	
	driver.switchTo().window(li.get(1));
	String pagetitle = driver.getTitle();
	
	System.out.println(pagetitle);
	
	Thread.sleep(2000);
	
	driver.switchTo().parentFrame();
	
	driver.close();
	
	driver.switchTo().window(li.get(0));
	
	driver.close();
	
	
		
	}

}
