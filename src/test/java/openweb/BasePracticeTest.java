package openweb;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePracticeTest {
	  WebDriver  driver;
	@BeforeClass
	public void launchbrowser()
	 {
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		driver =new ChromeDriver(options);
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void teardown() throws InterruptedException{
	Thread.sleep(2000);
	driver.close();
	}
}
