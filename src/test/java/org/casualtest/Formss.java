package org.casualtest;

import java.awt.dnd.DropTargetDropEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Formss {

	@Test
	
	private void fromss() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/forms");
		
		driver.findElement(By.id("firstname")).sendKeys("Teja");
		
		driver.findElement(By.id("lasttname")).sendKeys("vu");
		
		driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		
		WebElement select1 = driver.findElement(By.xpath("(//div[@class='select'])[1]"));
		
		Select s1=new Select(select1);
		
		s1.selectByValue("91");
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
}
