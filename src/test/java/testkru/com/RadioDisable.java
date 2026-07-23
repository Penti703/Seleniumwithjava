package testkru.com;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class RadioDisable {
	public static WebDriver driver;
	@BeforeMethod
	
	public void openPage() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testkru.com/Elements/RadioButtons");
		System.out.println("Current URL is : "+driver.getCurrentUrl());
		
	}
	@Test(priority = 0)//verifying the multi select Checkbox  
	public void multiradioSelect() {
		List<WebElement> radioButtons=driver.findElements(By.xpath("(//div[@class='mt-2 row text-dark'])[3]//label[@class='pr-2']"));
		for(WebElement radios :radioButtons ) {
			String radioTxt=radios.getAttribute("value");
			//System.out.println(radioTxt);
			System.out.println(radios.isSelected()+":"+radios.getAttribute("value"));
			if(radios.isDisplayed()&&!radios.isEnabled()) {
				Assert.assertFalse(radios.isEnabled());
				System.out.println(!radios.isEnabled()+":"+radios.getAttribute("value"));
			}
			
		}
	}
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
	driver.quit();
		}
	}
}
