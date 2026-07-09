package makemytrip.com;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenPageGetScreenShot {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		try {
			
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		driver =new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		String actualURL=driver.getCurrentUrl();
		String ExceptedURL="https://www.makeemytrip.com";
		Assert.assertEquals(ExceptedURL, actualURL,"URL is mismatched");
		  System.out.println("Test Passed");
		
		}
		catch(Exception e){
			  if (driver != null) {
			  System.out.println("Test faild");
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source= ts.getScreenshotAs(OutputType.FILE);
			File targe=new File("screenshot/HomePage.png");
			FileUtils.copyFile(source, targe);
			
		}
		
		}
		finally {

            if (driver != null) {
                driver.quit();
            }
		

	}	

}
}