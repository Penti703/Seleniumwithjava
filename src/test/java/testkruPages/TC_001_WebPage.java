package testkruPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testkru.com.BaseClassTestKru;

public class TC_001_WebPage extends BaseClassTestKru {
 WebDriver driver;
 public TC_001_WebPage(WebDriver driver) {

	    this.driver = driver;

	    PageFactory.initElements(driver, this);
	}
	//FindigElments 
	@FindBy(xpath = "//h2[normalize-space()='Testkru - Codekru Playground for Testers']")
	WebElement textVerify;
	
	@FindBy(xpath = "//a[@id='sidebarCheckbox']")
	WebElement checkBoxLink;
	
	
	
	public void testTxrWebPage() {
		boolean actText=textVerify.isDisplayed();
		System.out.println("Text presnt in Page : "+actText);
		Assert.assertTrue(actText);
		//Verifyaing the URl
		String actURL=driver.getCurrentUrl().trim();
		String expURL="https://testkru.com/".trim();
		System.out.println("URL IS : "+actURL);
		Assert.assertEquals(expURL,actURL,"URL Mismatched" );
			
	}
	
	
}
