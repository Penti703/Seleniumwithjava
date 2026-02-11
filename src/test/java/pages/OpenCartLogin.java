package pages;


import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import base.BaseTest;

public class OpenCartLogin extends BaseTest {
	
	 @Test(priority = 1)
	    public void openText() { // Renamed for camelCase
	        String title = driver.getTitle();
	        System.out.println("Page Title is: " + title);
	        // BEST PRACTICE: Added an Assertion to actually "test" something
	        Assert.assertTrue(title.contains("OpenCart"), "Title does not match!");//passing  the true values pass if the condition is true 
	    }
	    
	 @Test(priority=2)
	 public void findurl() {
		// Get Current URL of the page and matches then run 
		 String ActualResult= driver.getCurrentUrl();
		 String ExpectedURL ="https://www.opencart.com/index.php?route=common/home";
		 System.out.println("URL is ="+ActualResult);
		 Assert.assertEquals(ActualResult, ExpectedURL,"URL mismatch!");//Compare the two values 
		 
		WebElement header= driver.findElement(By.xpath("//h1[normalize-space()='The best open-source and FREE eCommerce platform']"));
		 Assert.assertTrue(header.isDisplayed(), "headerb WebElement mismatched");
	 }
	@Test(priority=3)
	public void loginVerify() throws InterruptedException
	{
	
		WebElement RegisterVerify =driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
		Assert.assertTrue(RegisterVerify.isDisplayed(),"register buttn is there");
		System.out.println("verifying the LoginButton visablity");
		RegisterVerify.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-spinner")));
		WebElement registerText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Register for OpenCart account']")));
		Assert.assertTrue(registerText.isDisplayed(),"text is not siplayed");
		System.out.println("Login Page visable text");
		
		
	}
	
		 
	 }
	


