package com.venkat.java;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		String ExpectedResult=driver.getTitle();
		System.out.println("Title Name is :"+ExpectedResult);
		
		driver.findElement(By.linkText("Droppable")).click();

		
		//Drag and drop method 
		Actions actions=new Actions(driver);
		driver.switchTo().frame(0);//it is help to identifying the 
		WebElement dragElement= driver.findElement(By.id("draggable"));
		WebElement dropElement= driver.findElement(By.id("droppable"));
	   actions.dragAndDrop(dragElement, dropElement).perform();
		

	}

}
