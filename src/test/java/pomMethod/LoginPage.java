package pomMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	//Contractor
	LoginPage(WebDriver driver){
		this.driver=driver;	
	}
	//Locators 
	By text_userName=By.xpath("//input[@placeholder='Username']");
	By text_uPassord=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action Methods
	public void userName(String user) {
		driver.findElement(text_userName).sendKeys(user);
	}
	public void userPassword(String pwd) {
		driver.findElement(text_uPassord).sendKeys(pwd);
	}
	public void ClickButton() {
		driver.findElement(btn_login_loc).click();
	}
}

