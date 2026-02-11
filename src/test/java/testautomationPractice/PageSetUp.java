package testautomationPractice;

import java.time.Duration;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageSetUp {
	WebDriver driver;
	  Actions actions;
	
	//contractor 
	PageSetUp(WebDriver driver){
		
   this.driver =driver;
   PageFactory.initElements(driver, this);
   this.actions = new Actions(driver);
	}
   //Element setup 
   @FindBy(xpath ="//span[normalize-space()='For Selenium, Cypress & Playwright']")
   WebElement textname;
   
   @FindBy(xpath = "//input[contains(@id,'Wikipedia1_wikipedia-search-input')]")
   WebElement searchBox;
   
   @FindBy(xpath = "//input[@type='submit' or @value='Search']")
   WebElement searchButton;
   
   @FindBy(xpath = "//div[@id='wikipedia-search-result-link']/a")
   List <WebElement> resultLinks;
   
   
   @FindBy(xpath = "//button[text()='START'  or  text()='STOP']")
   WebElement startStopButton;
   
   
  // popu handling
   

@FindBy(xpath = "//button[@id='alertBtn']") WebElement  AlertPopUp;
@FindBy(xpath = "//button[@id='confirmBtn']") WebElement  AlertPopUpConform;
@FindBy(xpath = " //button[@id='promptBtn']") WebElement  AlertPopUpPassValuee;

//windowHandling 
@FindBy(xpath = "//button[contains(text(),'New Tab')]")WebElement windowHandle;

//MouseHover
@FindBy(xpath = "//button[normalize-space()='Point Me']") WebElement mousePoint;






 
//------------------------------------------------   Actions 
   
  public boolean isTextDisplayed() {
	  return textname.isDisplayed();
	  
  }
  
  public void SearchName(String sName) {
	  searchBox.sendKeys(sName);
	  
  }
  
  public void clickSearch() {
      searchButton.click();
   
  }
  

  public void selectResult(String expectedText) {
	  String parentWindowd=driver.getWindowHandle();
      for (WebElement link :resultLinks) {
    	  String actText=link.getText();
          if (actText.toLowerCase().contains(expectedText.toLowerCase())) {
        	  link.equals(expectedText);
              link.click();
              break;
          }	

}
      Set<String> allWindows=driver.getWindowHandles();
      for(String window : allWindows) {
    	  if(!window.equalsIgnoreCase(parentWindowd)) {
    		  driver.switchTo().window(parentWindowd);
    		  break;  		  
    	  }
      }
  }
  
  public void  getButtonText() {
	  String oldText=startStopButton.getText();
	  startStopButton.click();
	  if(oldText=="START") {
		  System.out.println("START");
	  }else
       System.out.println("STOP");
      
  }
  //popup accept only okay 
  public void alertPopuclick() {
	  AlertPopUp.click();
	  
  }
  //popup accept only okay and cancel
  public void PopupOkAndCancel() {
	  AlertPopUpConform.click();
	  
  }
  public void PopupPassvalueOkay() {
	  AlertPopUpPassValuee.click();
	  
  }
  
  //Handling Window
  public void handlingWindowpage() {
	  String ParentWindow=driver.getWindowHandle();
	  windowHandle.click();
	  
	  Set<String> allWindow=driver.getWindowHandles();
	  for(String window : allWindow) {
		  if(!window.equalsIgnoreCase(ParentWindow)) {
			  driver.switchTo().window(window);  
		  }
	  }	  
  }
  void mouseHover() {
		actions.moveToElement(mousePoint).perform();
	
  }
}

