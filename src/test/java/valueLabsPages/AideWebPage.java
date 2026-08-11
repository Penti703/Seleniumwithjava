package valueLabsPages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import jdk.jfr.internal.Logger;
import valueLabs.com.BaseClassVL;

public class AideWebPage extends BaseClassVL {

	public AideWebPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Wait explicitely
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	@FindBy(xpath = "//ul[@class='cb-related-links-list']//li[1]")
	WebElement linkAidChat;

	@FindBy(xpath = "//a[@class='products-details-banner-button']")
	WebElement linkBannerButton;

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement txtFistName;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmailName;

	@FindBy(xpath = "//input[@name='company']")
	WebElement txtCompanyName;

	@FindBy(xpath = "//select[@name='how_did_you_hear_about_us_']")
	WebElement txtHearAbout;

	@FindBy(xpath = "//select[@name='country_contact_form']")
	WebElement locationDropdown;

	@FindBy(xpath = "//textarea[@name='message_contact_us']")
	WebElement txtMessage;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;

	@FindBy(xpath = "//h1[normalize-space()='Thank you for expressing your interest!']")
	WebElement successMsg;

	@FindBy(xpath = "//label[contains(text(),'Please complete this required field.')]")
	WebElement labelError;
	@FindBy(xpath = "//label[contains(text(),'Email must be formatted correctly.')]")
	WebElement emailMustFormatError;
	

	public void AideChat() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(linkAidChat));
			linkAidChat.click();
			String aidChatURL = driver.getCurrentUrl();
			System.out.println("aidChatURL is : "+aidChatURL);
			Assert.assertEquals(aidChatURL, "https://www.valuelabs.com/products/experience/aide-chat/".trim(),
					" aidChatURl is mismatched");
		} catch (Exception e) {
			Assert.fail("Click Aid chat missing " + e.getMessage());
		}
	}

	public void letAidChat() {
		/* try { */
			//wait.until(ExpectedConditions.elementToBeClickable(linkBannerButton));
			linkBannerButton.click();
			String linkbanerURl=driver.getCurrentUrl();
			System.out.println("liner Banner URL is : "+linkbanerURl);
		/*	Assert.assertEquals(linkbanerURl,
					"https://www.valuelabs.com/products/experience/aide-chat/#contact-section-scroll-down".trim(),"linerBanner URL mismatch");
		} catch (Exception e) {
			Assert.fail("Lets Aid Chat Error" + e.getMessage());
		}*/
	}

	// Fisrtname Method
	public void fnametxt(String fname) {
		wait.until(ExpectedConditions.visibilityOf(txtFistName));
		txtFistName.sendKeys(fname);
	}

	// LastName Method
	public void lnametxt(String lname) {

		txtLastName.sendKeys(lname);
	}

	// email method
	public void emailtxt(String email) {

		txtEmailName.sendKeys(email);
	}

	// Company Method
	public void companytxt(String company) {

		txtCompanyName.sendKeys(company);
	}

	// HeardopBox
	public void hearDopbox() {

		/*
		 * txtHearAbout.click(); txtHearAbout.sendKeys(Keys.DOWN);
		 * txtHearAbout.sendKeys(Keys.DOWN.ENTER);
		 */
		
		wait.until(ExpectedConditions.visibilityOf(txtHearAbout));
		Select sc=new Select(txtHearAbout);
		sc.selectByIndex(2);
	}

	// Location dropbox
	public void LocationDropdown() {

		/*
		 * locationDropdown.click(); locationDropdown.sendKeys(Keys.DOWN);
		 * locationDropdown.sendKeys(Keys.DOWN.ENTER);
		 */

		wait.until(ExpectedConditions.visibilityOf(locationDropdown));
		Select sc=new Select(locationDropdown);
		sc.selectByIndex(2);
	}

	// Message text
	public void messagetxt(String nameTxt) {
		wait.until(ExpectedConditions.visibilityOf(txtMessage));
		txtMessage.sendKeys(nameTxt);
	}
	public void scrollDown() {

		    Actions actions = new Actions(driver);
		    actions.pause(Duration.ofSeconds(1))
		   .scrollByAmount(600, 900).perform();
		
	}
	public void submitButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   // Wait until Submit button is visible
	    wait.until(ExpectedConditions.visibilityOf(submitButton));

	    // Wait until Submit button is clickable
	    wait.until(ExpectedConditions.elementToBeClickable(submitButton));

	    // Click Submit
	    submitButton.click();
	}

	/*
	 * public boolean isSuccessMessageDisplayed() {
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	 * 
	 * try {
	 * 
	 * logger.info("Waiting for AID Chat success message...");
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(successMsg));
	 * 
	 * logger.info("AID Chat success message is displayed");
	 * 
	 * return true;
	 * 
	 * } catch (Exception e) {
	 * 
	 * logger.error("AID Chat success message was not displayed", e);
	 * 
	 * return false; } }
	 */
	
	public String isSuccessMessageDisplayed() {
		return successMsg.getText(); 
		
	}

	public String getSuccessMessage() {
		return labelError.getText().trim();
	}

	public String getAidChatError() {
		return labelError.getText();
	}

	public String getAidEmaliError() {
		return emailMustFormatError.getText();
	}
}
