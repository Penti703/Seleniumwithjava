package openweb;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauncheBrowser {
	
	@Test
	public void TestLanch() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	String ActualURL=driver.getCurrentUrl();
	String ExpectURL = "https://www.saucedemo.com/";
	System.out.println("URL IS="+ActualURL);
	assertEquals(ActualURL,ExpectURL,"url is missed" );
	driver.quit();

}
}
