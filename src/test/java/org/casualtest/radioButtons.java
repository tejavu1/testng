package org.casualtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButtons {
	
	WebDriver driver;
	
	@Test
	
	private void radiobuttons() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://letcode.in/radio");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.id("yes")).click();
		
		WebElement button21 = driver.findElement(By.id("one"));
		
		button21.click();
		
		
		WebElement button22 = driver.findElement(By.id("two"));
		
		button22.click();
		
		boolean trueorfalse = button22.isSelected();
		
		boolean buttonfalse2 = button21.isSelected();
		
		System.out.println(trueorfalse);
			
		
//		Assert.assertEquals(false, trueorfalse, "it is a single select");
		
		
		if (trueorfalse==true && buttonfalse2==false) {
			
			System.out.println("it is a single select");
		}
		
		else {
			System.out.println("it is a double select");
		}
		
		
		WebElement button31 = driver.findElement(By.id("nobug"));
		
		button31.click();
		
		WebElement button32 = driver.findElement(By.id("bug"));
		
		button32.click();
		
		if(button31.isSelected()==button32.isSelected()) {
			
			System.out.println("it is a bug");
		}
		else {
			
			System.out.println("it is not a bug");
		}

//		WebElement button42 = driver.findElement(By.id("notfoo"));
//		
//		boolean button42s = button42.isSelected();
//		
//		if(button42s==true) {
//			
//			String text1 = button42.getText();
//			
//			System.out.println(text1);
//		}
//		
		
		boolean button5 = driver.findElement(By.id("maybe")).isEnabled();
		
		System.out.println(button5);
		
		if(button5==false) {
			
			System.out.println("it is disabled");
		}
		else {
			System.out.println("it is enabled");
			
		}
		
		
		WebElement button6 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
		
		boolean button6e = button6.isEnabled();
		
		System.out.println(button6e);
		
//		Assert.assertTrue(button6e, "it is selected");
		
		if(button6e==true) {
			
			System.out.println("it is selected");
		} else {
			System.out.println("it is not selected");
		}
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
		
		
		
		
		
		
		
		
	}

}
