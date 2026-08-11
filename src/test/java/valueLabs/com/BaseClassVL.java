package valueLabs.com;

import java.util.Arrays;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassVL {
	public static WebDriver driver;
	 public Logger logger;

@BeforeMethod
public void OpenPage() {
	
	logger = LogManager.getLogger(BaseClassVL.class);
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
	driver=new ChromeDriver(options);
	driver.get("https://www.valuelabs.com/");
	logger.info("navigated to browser");
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

public String randomString() {
	return RandomStringUtils.randomAlphabetic(7);
}
//Random Numeric String
public String randomNumber() {

    return RandomStringUtils.randomNumeric(10);
}

// Random AlphaNumeric String

public String randomEmail() {

    return RandomStringUtils.randomAlphabetic(5).toLowerCase()
            + RandomStringUtils.randomNumeric(4)
            + "@yopmail.co";
}


}


