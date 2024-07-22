package org.casualtest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	
	@Test
	
	private void screens() throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\tejav\\eclipse-workspace-1\\testngproject1\\test-output\\screenshots\\image.png");
		
	
		
		FileUtils.copyFile(src, des);
		

	}

	
}
