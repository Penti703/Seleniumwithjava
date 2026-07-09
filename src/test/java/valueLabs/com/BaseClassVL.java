package valueLabs.com;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassVL {
public WebDriver driver;
@BeforeMethod
public void OpenPage() {
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
	driver=new ChromeDriver(options);
	driver.get("https://www.valuelabs.com/");
	driver.manage().window().maximize();
}
@AfterMethod
public void closeApp() {
	try {
	if(driver!=null) {
		driver.quit();	
	}	
	}catch(Exception e) {
	System.out.println("brower not closed");
	}
}

}
