package org.casualtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	
	@Test
	
	private void sliderr() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/slider");
		
		WebElement slider = driver.findElement(By.id("generate"));

		Actions a=new Actions(driver);
		
		a.clickAndHold(slider).moveByOffset(200, 0).release().perform();
		
		WebElement getcountries = driver.findElement(By.xpath("//button[text()='Get Countries']"));
		
		getcountries.click();
		
		String countries = driver.findElement(By.className("has-text-primary-light")).getText();
		
		System.out.println(countries);

		String[] individualcountry = countries.split(" ");
		
		int length2 = individualcountry.length;

		System.out.println(length2);
		
	for(String parts:individualcountry) {
		
		
		
		System.out.println(parts);
		
//		int length = parts.length();
//		
//		System.out.println(length);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	}

}
