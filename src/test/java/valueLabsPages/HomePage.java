package valueLabsPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import valueLabs.com.BaseClassVL;

public class HomePage extends BaseClassVL{
	
	//constructor 
	

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	@FindBy(xpath = "//a[normalize-space()='Products']")
	WebElement linkProduct;
	
	@FindBy(xpath = "//a[normalize-space()='Experience']")
	WebElement linkExperience;
	
	
	public void experienceLink() {
		Actions act=new Actions(driver);
		act.moveToElement(linkProduct)
		.pause(Duration.ofSeconds(1))
		.moveToElement(linkExperience)
		.pause(Duration.ofSeconds(1))
		.click().build().perform();
		
	}
	

}
