package qaJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import base.Basefacebook;


public class AssertionTest extends Basefacebook {

	@Test
	public void SoftAssTest() {
		//verify the passing the values and clearing the values and agai passing the values using id locator
			
				WebElement idlocator= driver.findElement(By.id("email"));
				idlocator.sendKeys("venkatestwqsd",Keys.ENTER);
				//passing the value into the field 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				SoftAssert test =new SoftAssert();
				
				//Assertion URl verification an
				String ActualURL=driver.getCurrentUrl();
				String ExpectedURl="https://www.facebook.com/";
				System.out.println("URL iS"+ActualURL);
				test.assertEquals(ActualURL, ExpectedURl, "URL Mis Matched ");
				
				//GET TEXT Method 
				String ActualTitle=driver.getTitle();
				String ExpectedTitle="Facebook";
				System.out.println("URL iS"+ActualTitle);
			    test.assertEquals(ActualTitle, ActualTitle, "title  Mis Matched ");
			    
			    //finding the erroe messgate 
			  
			    
			  
				
				
	}
}
