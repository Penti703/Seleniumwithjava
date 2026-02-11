package qaJava;

import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandleMethod {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	}
	@Test
	
	public void windowhandling() throws InterruptedException {
		driver.findElement(By.linkText("Multiple Windows")).click();
		System.out.println("Parent title is :"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Thread.sleep(3000);
		String parentWindow=driver.getWindowHandle();
		//get all window handles 
		Set<String>allWindows=driver.getWindowHandles();
		for(String win : allWindows ) {
			if(!win.equals(parentWindow)) {
				driver.switchTo().window(win);
				System.out.println("Child window title is  "+driver.getTitle());
				driver.close();
				
			}
		}
		driver.switchTo().window(parentWindow);
	System.out.println("Parent title is :"+driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
		//driver.quit();
	}

}
