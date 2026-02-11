package testautomationPractice;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	void LaunchPage() {
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 300 pixels
	        js.executeScript("window.scrollBy(0,300)");
	}
	

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
