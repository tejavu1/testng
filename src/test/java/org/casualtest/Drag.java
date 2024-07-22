package org.casualtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag {
	
	@Test
	
	private void dragg() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/draggable");
		
		WebElement draggablebox = driver.findElement(By.id("sample-box"));
		
		Actions a=new Actions(driver);
		
		a.dragAndDropBy(draggablebox, 162, 198).perform();
		
		
		
		

	}

}
