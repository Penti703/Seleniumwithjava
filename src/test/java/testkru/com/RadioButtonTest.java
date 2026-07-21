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

public class RadioButtonTest {
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

	@Test(priority=0)
	public void radioButton() {
		
		List<WebElement> radioSingle=driver.findElements(By.xpath("(//div[1][@class='mt-2 row text-dark'])//input[@name='select']"));
		for(WebElement radiButton : radioSingle)
		{
			String st=radiButton.getAttribute("value");
			System.out.println(st);
			if(st.equals("firstSelect1") ){
				radiButton.click();	
				System.out.println(radiButton.isSelected());
				break;
			}else {
				System.out.println("Test is failed");
			}
		}
		
	}
	@Test
	public void singleRadioButton() {
	}
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
	driver.quit();
		}
	}

}
