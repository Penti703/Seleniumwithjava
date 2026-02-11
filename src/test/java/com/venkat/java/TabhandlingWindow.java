package com.venkat.java;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TabhandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      // Opening the webpage with new tab
	      driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
	      
	      System.out.println(driver.getCurrentUrl());
	      
	      WebElement newTab=driver.findElement(By.xpath("//button[contains(text(),'New Tab')]"));
	      newTab.click();
	      System.out.println(driver.getCurrentUrl());
	      Thread.sleep(3000);
	      String Tab=driver.getWindowHandle();
	      driver.switchTo().window(Tab);
	      
	      driver.close();
	      driver.quit();
	      
	}

}
