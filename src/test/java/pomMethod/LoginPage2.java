
	
	package pomMethod;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class LoginPage2 {

		WebDriver driver;
		//Contractor
		public  LoginPage2(WebDriver driver){
			this.driver=driver;	
			PageFactory.initElements(driver, this );
		}
		//Locators 
		
		@FindBy(xpath = "//input[@placeholder='Username']")
		WebElement text_userName;
		@FindBy(xpath = "//input[@placeholder='Password']")
		WebElement text_uPassord;
		@FindBy(xpath = "//button[normalize-space()='Login']")
		WebElement btn_login_loc;
		//By text_userName=By.xpath("//input[@placeholder='Username']");
		//By text_uPassord=By.xpath("//input[@placeholder='Password']");
		//By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
		
		//Action Methods
		public void userName(String user) {
			text_userName.sendKeys(user);
		}
		public void userPassword(String pwd) {
			text_uPassord.sendKeys(pwd);
		}
		public void ClickButton() {
		btn_login_loc.click();
		}
	}


