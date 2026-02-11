package com.venkat.java;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandleMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      // Opening the webpage with new tab
	      driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
	      
	      System.out.println(driver.getCurrentUrl());

	}

}
