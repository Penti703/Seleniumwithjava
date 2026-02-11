package openweb;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
	@Test
	public void googleSearch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("Mahesh Babu");
		String title =driver.getTitle();
		System.out.println("title is "+title);
		driver.quit();
	}
	
	@Test
	public void faceBook() {
		
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
			WebDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			System.out.println("title is "+driver.getTitle());
			driver.quit();
		
	}

}
