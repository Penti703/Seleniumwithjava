package pomMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	void login() {
		
		LoginPage lp=new LoginPage(driver);
		lp.userName("Admin");
		lp.userPassword("admin1234");
		lp.ClickButton();
		
		
	}
	@AfterClass
	void teardown() {
		driver.close();
		
	}

}
