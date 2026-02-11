package com.venkat.java;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeybordKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeOptions options=new ChromeOptions();
				options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.google.com/");
				String ExpectedResult=driver.getTitle();
				System.out.println("Title Name is :"+ExpectedResult);
				
				
				
				Actions actions=new Actions(driver);
				WebElement Search=driver.findElement(By.name("q"));
				actions.moveToElement(Search);
				actions.click();//to performaing the click button 
				actions.keyDown(Keys.SHIFT);
				actions.sendKeys("selenium");
				actions.keyUp(Keys.SHIFT);
				//actions.sendKeys(Keys.ENTER).perform();//Keybord keys suing enter the values
				actions.sendKeys(Keys.DOWN).perform();
				
				Thread.sleep(3000);
				
				driver.close();				
	}

}
