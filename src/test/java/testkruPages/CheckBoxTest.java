package testkruPages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testkru.com.BaseClassTestKru;

public class CheckBoxTest extends BaseClassTestKru{

	 WebDriver driver;
	 public CheckBoxTest(WebDriver driver) {

		    this.driver = driver;

		    PageFactory.initElements(driver, this);
		}
	 
	 //Locators declerations 
	 @FindBy(xpath = "//a[@id='sidebarCheckbox']")
	 WebElement checkBoxLink;
	 
			 
	 @FindBy(xpath = "(//div[@class='mt-2 row text-dark'])[1]//input[@type='checkbox']")
	 private List<WebElement> singleChekBox;
	 @FindBy(xpath = "(//div[@class='mt-2 row text-dark'])[2]//input[@type='checkbox']")
	 List<WebElement> multiChekBox;
	 @FindBy(xpath = "(//div[@class='mt-2 row text-dark'])[3]//input[@type='checkbox']")
	 List<WebElement> disableChekBox;
	 @FindBy(xpath = "(//div[@class='mt-2 row text-dark'])[4]//input[@type='checkbox']")
	 List<WebElement> hiddenChekBox;
	 @FindBy(xpath = "(//div[@class='mt-2 row text-dark'])[5]//input[@type='checkbox']")
	 List<WebElement> preSelectChekBox;
	 @FindBy(xpath = "(//div[@class='mt-2 row text-dark'])[6]//input[@type='checkbox'][1]")
	 List<WebElement> nestedChekBox;
	 
	 
	 public void checkBoxLink() {
			Actions act=new Actions(driver);
			act.moveToElement(checkBoxLink).pause(Duration.ofSeconds(2)).click()
			.build().perform();
			
			String chekBoxURL=driver.getCurrentUrl().trim();
			String expURL="https://testkru.com/Elements/Checkboxes".trim();
			System.out.println("chekBoxLink is : "+chekBoxURL);
			Assert.assertEquals(expURL,chekBoxURL,"URL is Mis matched ");
			System.out.println("Checkbox Navigation Successfully");	
			}
	 
	 public void singleSelectCheckBox() {
		 
		 	WebElement previousElement=null;
		 	for(WebElement checkList : singleChekBox) {
			String chekListNames=checkList.getAttribute("value");
			//System.out.println(chekListNames);
			checkList.click();
			Assert.assertTrue(checkList.isSelected(),checkList.getAttribute("value")+"Failed to select checkbox");
			System.out.println(checkList.getAttribute("value")+":"+checkList.isSelected());
			
			
			if(previousElement!=null) {
				Assert.assertFalse(previousElement.isSelected(),previousElement.getAttribute("value")+"Failed to unselect checkbox");
				
			}
			System.out.println("------------------------");
			for(WebElement checkBox : singleChekBox) {
				System.out.println(checkBox.getAttribute("value")+" : "+checkBox.isSelected());	
					}
				previousElement=checkList;
			}		 
		}
	 
	 public void multiSelectCheckBox() {
		 System.out.println("----multiSelectCheckBox----");
		 	for(WebElement multiChek : multiChekBox) {
		 		System.out.println("--------");
		 		if(!multiChek.isSelected()) {
		 				multiChek.click();
		 				System.out.println(multiChek.getAttribute("value")+ " Status : "+multiChek.isSelected());
		 				Assert.assertTrue(multiChek.isSelected(),multiChek.getAttribute("value")+"Failed to select checkbox");
		 		}else {
		 			System.out.println(multiChek.getAttribute("value")+ " Status : "+multiChek.isSelected());
	 				Assert.assertTrue(multiChek.isSelected(),multiChek.getAttribute("value")+"Is not Selected");
		 		}
		 	}
		 	System.out.println("All CheckBoxes Selected Succefully");
		 	System.out.println("--------Multi Unselection CheckBoxes ");
		 	for(WebElement multiUncheck : multiChekBox) {
		 		System.out.println("--------");
		 		if(multiUncheck.isSelected()) {
		 			multiUncheck.click();
		 				System.out.println(multiUncheck.getAttribute("value")+ " Status : "+!multiUncheck.isSelected());
		 				Assert.assertFalse(multiUncheck.isSelected(),multiUncheck.getAttribute("value")+"Failed to unselect checkbox");
		 		}else {
		 			System.out.println(multiUncheck.getAttribute("value")+ " Status : "+!multiUncheck.isSelected());
	 				Assert.assertFalse(multiUncheck.isSelected(),multiUncheck.getAttribute("value")+"Is Selected");
		 			
		 		}
		 	}System.out.println("All the CheckBoxes UnSelected Succefully");
	 	}
	 
	 
	public void disableChekBox() {
		System.out.println("---validating  the disable checkboxes---------");
		for(WebElement checkBox :disableChekBox) {
			boolean bt=checkBox.isEnabled();
			try {
			if(checkBox.isEnabled()) {
			Assert.assertFalse(bt,"Is enabled");
			}
			}catch (Exception e) {
				System.out.println(" Button are enabled ");	
			}		
		}System.out.println("All check boxes buttons are disabled");
	}
	public void hiddenChekBox() {
		System.out.println("----verify Hide radio buttons----");
		for(WebElement hiddCheckButton : hiddenChekBox) {
			try {
				if(hiddCheckButton.isDisplayed()) {
					boolean chekBox=hiddCheckButton.isDisplayed();
					Assert.assertFalse(chekBox,"Is displayed");
				}
			}catch(Exception e) {
				System.out.println(hiddCheckButton+" Check box is displaying");
			}
		}System.out.println("All check boxes are (Hidded)  successfully");
	}
	
	public void preSelectCheckBox() {
		System.out.println("---validate the PreChecBox----");
		for(WebElement preCheckBox : preSelectChekBox ) {
			try {
			if(preCheckBox.isSelected()&&preCheckBox.getAttribute("value").equalsIgnoreCase("firstSelect5")) {
				preCheckBox.click();
				Assert.assertFalse(preCheckBox.isSelected(),preCheckBox.getAttribute("value")
				  +"is unselected");
				 System.out.println("Name of check box is "+preCheckBox.getAttribute("value"));
			}
			}catch(Exception e) {
				System.out.println("Selected checkbox is not unselected");
			}
		}System.out.println("--Selected one unselect Successfully");
	}
	public void nestedChekBox() {
		System.out.println("----Nested checkBox Selection--");
		try {
		for(WebElement checkNestedBox : nestedChekBox) {
			String name=checkNestedBox.getText();
			checkNestedBox.click();
			Assert.assertTrue(checkNestedBox.isSelected(),checkNestedBox.getAttribute("text()")+"is not Selected ");
			System.out.println(name+" Status "+checkNestedBox.isSelected());
		}
		}catch(Exception e) {
			System.out.println("Check box is not selected ");
		}System.out.println("--all Nested checkboxes are selected Successfully");
	}
}
