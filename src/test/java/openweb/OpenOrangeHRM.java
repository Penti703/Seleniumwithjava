package openweb;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OpenOrangeHRM {
	
	@Test
	public void openOrangbrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String ActualResult =driver.getTitle();
		//String ExpectedResult="OrangeHRM";
		System.out.println("Page Title is ="+ActualResult);
		Assert.assertEquals(ActualResult,"OrangeHRM");
		driver.quit();
		
		
		
		
	}

}
