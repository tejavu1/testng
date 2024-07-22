package org.casualtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select {

	WebDriver driver;
	
	@Test
	
	public void selecttt() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/dropdowns");
		
		
		WebElement element1 = driver.findElement(By.id("fruits"));
		
		Select s1=new Select(element1);
		
		s1.selectByVisibleText("Apple");
		
		System.out.println("1");

		WebElement element2 = driver.findElement(By.id("superheros"));
		
		
		
		Select s2=new Select(element2);
		
		boolean multiple = s2.isMultiple();
		
		System.out.println(multiple);
		
		s2.selectByVisibleText("Ant-Man");
		
		s2.selectByVisibleText("Daredevil");
		
		s2.selectByVisibleText("Thor");
		
		
		WebElement element3 = driver.findElement(By.id("lang"));
		
		Select s3=new Select(element3);
		
		s3.selectByValue("sharp");
		
		List<WebElement> options = s3.getOptions();
		
		for(WebElement x:options) {
			
			System.out.println(x.getText());
		}
		
		WebElement element4 = driver.findElement(By.id("country"));
		
	Select s4=new Select(element4);
	
	s4.selectByValue("India");
	
	WebElement firstSelectedOption = s4.getFirstSelectedOption();
	
	String text1 = firstSelectedOption.getText();
	
	System.out.println(text1);
		
		
	}
	
}
