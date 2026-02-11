package demonocommers.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class LoginSetup {
	WebDriver driver;
	  Actions actions;
	
	//contractor 
	  LoginSetup(WebDriver driver) {
		
 this.driver =driver;
 PageFactory.initElements(driver, this);
 this.actions = new Actions(driver);
	}
	
	
}
