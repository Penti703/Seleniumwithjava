package qaJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Basefacebook;
import junit.framework.Assert;

public class TestWaitconcept extends Basefacebook{
	
	@Test
	public void waitTest() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert test =new SoftAssert();
		
		WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign up")));
	    submitBtn.click();
	    WebElement firstName=driver.findElement(By.name("firstname"));
	    firstName.sendKeys("Venkatesh1");
	    
	    WebElement LastName=driver.findElement(By.xpath("//input[@name='lastname']"));
	    LastName.sendKeys("Venkatesh1");
	    
	    //Dropdown values using the select by values 
	    WebElement birtdayDay=driver.findElement(By.xpath("//select[@id='day']"));
	   Select dateDrop=new Select(birtdayDay);
	   Thread.sleep(1000);
	   dateDrop.selectByValue("2");
	   System.out.println(birtdayDay.isSelected());
	   System.out.println("Selected date: " + dateDrop.getFirstSelectedOption().getText());
	   //Select by visable text
	   WebElement birtmonth=driver.findElement(By.xpath("//select[@id='month']"));
	   Select monthDrop=new Select(birtmonth);
	   Thread.sleep(1000);
	   monthDrop.selectByVisibleText("Mar");
	   System.out.println(birtmonth.isDisplayed());
	   System.out.println("Selected  Month: " + monthDrop.getFirstSelectedOption().getText());
	   //
	   WebElement birtyear=driver.findElement(By.xpath("//select[@id='year']"));
	   Select yearDrop=new Select(birtyear);
	   Thread.sleep(1000);
	   yearDrop.selectByIndex(10);
	   System.out.println("Selected Year: " + yearDrop.getFirstSelectedOption().getText());
	   
	   WebElement genderm=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
	   test.assertFalse(genderm.isSelected(),"selected successfully");
	   Thread.sleep(1000);
	   genderm.click();
	   System.out.println("Selected Text: " + genderm.getText());
	   Thread.sleep(1000);
	   test.assertFalse(genderm.isSelected(),"un selected successfully");
	   
		
	
		//Assertion URl verification an
		String ActualURL=driver.getCurrentUrl();
		String ExpectedURl="https://www.facebook.com/reg/";
		System.out.println("URL iS"+ActualURL);
		test.assertEquals(ActualURL, ExpectedURl, "URL Mis Matched ");
		
		driver.navigate().back();
		String ActualURL1=driver.getCurrentUrl();
		String ExpectedURl1="https://www.facebook.com/";
		System.out.println("URL iS"+ActualURL1);
		test.assertEquals(ActualURL1, ExpectedURl1, "URL Mis Matched ");
		
		test.assertAll();
		
	

}
}
