package testkru.com;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTestKru {
	public  WebDriver driver;
	@BeforeMethod
	
	public void openPage() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testkru.com/");
		System.out.println("Current URL is : "+driver.getCurrentUrl());
		System.out.println("First Browser open and URL Routing Successfully done");
	}
	


@AfterMethod
public void tearDown() {
	if(driver!=null) {
		driver.quit();
		System.out.println("Last Browser Closed Successfully");
	}
}
}