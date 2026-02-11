package com.venkat.java;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String ExpectedResult=driver.getTitle();
		System.out.println("Title Name is :"+ExpectedResult);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		// Initialize wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait until the button is clickable, then click it
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))).click();
		System.out.println("AFterLogin TitleIs:"+driver.getTitle());
		
		
		//Action Class using 
		
		Actions actions=new Actions(driver);
		WebElement testMouse= driver.findElement(By.linkText("Admin"));
		//Mouse Hover (Move to Element)
		actions.moveToElement(testMouse).perform();
		//Right click contextClick 
		//actions.contextClick(testMouse).perform();
		
		actions.doubleClick(testMouse).perform();
		
		//
		
		
		
	
		

	}

}
