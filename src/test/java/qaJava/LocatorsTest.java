package qaJava;

import java.awt.Container;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basefacebook;


public class LocatorsTest extends Basefacebook{
	@Test(priority=1)
	public void LocatorTest() {
		
		//verify the passing the values and clearing the values and agai passing the values using id locator 
		WebElement idlocator=driver.findElement(By.id("email"));
		idlocator.sendKeys("venkatest");//passing the value into the field  
		System.out.println("User passed the values ");
		System.out.println("Title Name :"+driver.getTitle());//verify the title name by using getTitle 
		idlocator.clear();//verify to clear the value
		System.out.println("System Cleared the avlues ");
		idlocator.sendKeys("Admin");
		System.out.println("System passsed the new value");
		
	}
	
	@Test(priority=2)
	//verify the using text locator and validating the click and navigate back to validating the URL's Assert class 
	
	public void SignUpFB() {
		String BaseUrl=driver.getCurrentUrl();
		System.out.println("base URL is "+BaseUrl);
		WebElement SignUp=driver.findElement(By.xpath("//a[text()='Sign up']"));
		SignUp.click();
		System.out.println("Navigating to the Registration page ");
		String CurrentUrl=driver.getCurrentUrl();//Printing the title verification 
		String ExpectedUrl="https://www.facebook.com/reg/";
		System.out.println("Current URL :"+CurrentUrl);
		//using assertion contains and validating the result
		Assert.assertEquals(CurrentUrl,ExpectedUrl,"URL is Mismatcehd");
		driver.navigate().back();
		//Printing the tile 
		String pageBackTitel=driver.getTitle();
		System.out.println("navigate back and title is :"+pageBackTitel);
		Assert.assertEquals(pageBackTitel,"Facebook – log in or sign up","navigate back title is mismatched ");
		
		
	}


	
}
