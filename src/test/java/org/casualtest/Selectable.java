package org.casualtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	@Test
	
	private void selectable() throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/selectable");
		
		WebElement selectable1 = driver.findElement(By.id("selectable"));
		
		Actions a=new Actions(driver); 
		
		a.clickAndHold(selectable1).perform();
		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_SHIFT);
				
		List<WebElement> allelements = driver.findElements(By.id("selectable"));
		
	
		
		
		for(WebElement x:allelements) {
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_SHIFT);
			
			for(int i=0;i<10;i++) {
				
				x.click();
			}
			
			
			
			
		}
		
		

	
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_SHIFT);
//		
//		WebElement findElement = driver.findElement(By.xpath("//h3[text()='LetCode']"));
//		
//		findElement.click();
//		
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		
//		
	
	}
	
}
