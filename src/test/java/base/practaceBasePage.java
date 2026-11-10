package base;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practaceBasePage {
 public WebDriver driver;
	@BeforeMethod
	public void setUpPage() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	@AfterMethod
	public void exitBrowser() {
	if(driver!=null) {
		driver.quit();
	}
		
	}	
}

