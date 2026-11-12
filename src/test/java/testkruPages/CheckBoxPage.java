package testkruPages;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

	private WebDriver driver;
	public CheckBoxPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	//Finding the locators //side bar link clicking 
	@FindBy(xpath = "//a[@id='sidebarCheckbox']")
	private WebElement checkBoxLink;
	
	@FindBy(xpath = "(//div[@class='mt-2 row text-dark'])[1]//input[@type='checkbox']")
	private List<WebElement> singleChekBox;
	
	public void checkBoxLink() {
		Actions act=new Actions(driver);
		act.moveToElement(checkBoxLink).pause(Duration.ofSeconds(2)).click().build().perform();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl().trim();
	}
	
	public boolean selectedSingleCheckBoxAtIndex(int index) {
		WebElement cb=singleChekBox.get(index);
		cb.click();
		return cb.isSelected();
	}
	
	public boolean validateSingleSelectBehavior() {
		WebElement previousElement=null;
		for(WebElement checkList:singleChekBox) {
			String value=checkList.getAttribute("value");
			checkList.click();
			System.out.println("Check box name : "+value+": Result is : "+checkList.isSelected());
			//Validating the select Value
			if(!checkList.isSelected()) {
				System.out.println(value+"Failed to Select the checkbox");
				return false;
			}
			//validating the unselect value in 
			if(previousElement!=null&&previousElement.isSelected()) {
				System.out.println(value+"Failed to unSelect the checkbox");
				return false;
			}
			previousElement=checkList;
		}
		return true;
			
	}
}
