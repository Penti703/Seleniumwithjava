package valueLabsPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import valueLabs.com.BaseClassVL;

public class AideWebPage extends BaseClassVL{
	
	  public AideWebPage (WebDriver driver)  {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	  
	  @FindBy(xpath="//ul[@class='cb-related-links-list']//li[1]")
	    WebElement linkAidChat;
	  
	  @FindBy(xpath="//a[@class='products-details-banner-button']")
	    WebElement linkBannerButton;
	  
	  @FindBy(xpath="//input[@name='firstname']")
	    WebElement txtFistName;
	  
	  @FindBy(xpath="//input[@name='lastname']")
	    WebElement txtLastName;
	  
	  @FindBy(xpath="//input[@name='email']")
	    WebElement txtEmailName;
	  
	  @FindBy(xpath="//input[@name='company']")
	    WebElement txtCompanyName;
	  
	  @FindBy(xpath="//select[@name='how_did_you_hear_about_us_']")
	    WebElement txtHearAbout;
	  
	  @FindBy(xpath="//select[@name='country_contact_form']")
	    WebElement locationDropdown;
	  
	  @FindBy(xpath="//textarea[@name='message_contact_us']")
	    WebElement txtMessage;
	  
	  @FindBy(xpath="//input[@type='submit']")
	    WebElement submitButton;
	  
	  @FindBy(xpath="//h1[normalize-space()='Thank you for expressing your interest!']")
	    WebElement successMsg;
	  
	  
	  
	  public void AideChat() {
		  linkAidChat.click(); 
	  }
	  public void letAidChat() {
		  linkBannerButton.click();
		 
		  
	  }
	 //Fisrtname Method 
	  public void fnametxt(String fname ) {
		  
		  txtFistName.sendKeys(fname);
	  }
	  //LastName Method
	  public void lnametxt(String lname ) {
		  
		  txtLastName.sendKeys(lname);
	  }
	  //email method
	  public void emailtxt(String email ) {
		  
		  txtEmailName.sendKeys(email);
	  }
	  
	  //Company  Method
	  public void companytxt(String company ) {
		  
		  txtCompanyName.sendKeys(company);
	  }
	  
	  //HeardopBox
	  public void hearDopbox() {
		  
		  txtHearAbout.click();
		  txtHearAbout.sendKeys(Keys.DOWN);
		  txtHearAbout.sendKeys(Keys.DOWN.ENTER);
	  }
	  
	  //Location dropbox 
	  public void LocationDropdown() {
		  
		  locationDropdown.click();
		  locationDropdown.sendKeys(Keys.DOWN);
		  locationDropdown.sendKeys(Keys.DOWN.ENTER);
	  }
	  //Message text
	  public void messagetxt(String nameTxt) {
		  
		  txtMessage.sendKeys(nameTxt);
	  }
	  
	  public void subButton() {
		  
		  submitButton.click();
	  }
	  
	  public boolean isSuccessMessageDisplayed() {
		    return successMsg.isDisplayed();
		}
	  
	  public String getSuccessMessage() {
		    return successMsg.getText();
		}
	  
	  
}
