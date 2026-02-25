package openweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseSetupElements {
	WebDriver driver;
	
	public BaseSetupElements(WebDriver driver){  //Constractor 
		this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	}
	
	//Element set up
@FindBy(xpath="//input[@id='fullname']")  WebElement fullName;
@FindBy(xpath="//input[@id='email']")  WebElement emails;
@FindBy(xpath="//textarea[@id='address']") WebElement address;
@FindBy(xpath="//input[@id='password']") WebElement password;
@FindBy(xpath="//input[@value='Submit']") WebElement Button;


public void fullTextName(String Name)
{
	fullName.sendKeys(Name);
}

public void emailName(String email)
{
	emails.sendKeys(email);
}

public void addressName(String adress)
{
	address.sendKeys(adress);
}
public void passworText(String pass)
{
	password.sendKeys(pass);
}

public void buttonClick()
{
	Button.click();
	
}

	
}
