package testautomationPractice;

import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class LaunchBrowserwithTrycatch {
	  WebDriver driver;
	@BeforeMethod
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1)
	public void test1() {
		String title=driver.getTitle();
		String expected="Facebook – log in or sign up";
		System.out.println("Title name is :"+title);
		if(expected.equals(title)) {
			System.out.println("Title matcehd ");
		}else {
			System.out.println("Title did not  matcehd ");
		}
	}
	@Test(priority = 2)
	public void openInsta() {
		String pWind=driver.getWindowHandle();
		WebElement instGram=driver.findElement(By.xpath("//a[normalize-space()='Instagram']"));
		instGram.click();
	System.out.println("Current URL Name is"+driver.getCurrentUrl());
	
	Set<String>allWindow=driver.getWindowHandles();
	for(String window:allWindow) {
		if(!pWind.equals(window)) {
			driver.switchTo().window(window);
			
			String CurrentURL=driver.getCurrentUrl();
			System.out.println(CurrentURL);
			System.out.println("Chat tab page name is "+driver.getTitle());
			Assert.assertTrue(true);
			WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
			email.sendKeys("venkatesh Penti");
			String actualvalue= email.getAttribute("value");
			System.out.println(actualvalue);
			email.clear();
			email.sendKeys("Yamana Manikanta");
			String actualvalue1= email.getAttribute("value");
			System.out.println(actualvalue1);
			
		}
	}
	
	
	}
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
}
