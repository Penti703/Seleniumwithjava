package qaJava;



import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
	}
	
	@Test(priority = 1)
	public void openFacebook() {
		String titleName=driver.getTitle();
		System.out.println("Title of the page is "+titleName);
	}
	
	@Test(priority = 2)
	public void openFacebookAndInsta() {
		String titleName=driver.getTitle();
		System.out.println("Title of the page is "+titleName);
		String ParentWindow=driver.getWindowHandle();
		//WebElement instaPage=driver.findElement(By.xpath("//a[contains(text(),'Instagram')]"));
		//instaPage.click();
		Set<String> allWindow=driver.getWindowHandles();
		
		for(String window:allWindow) {
			if(!window.equals(ParentWindow)) {
				driver.switchTo().window(window);
				System.out.println("Title of the child window :"+driver.getTitle());
				WebElement instaPage=driver.findElement(By.xpath("//a[contains(text(),'Instagram')]"));
				instaPage.click();
				WebElement text = driver.findElement(By.xpath("//span[@class='xg7jpbn x1ta4xzc x1c3f6yh']"));
	            System.out.println("Child window text : " + text.getText());
	            
			}
		}
	}
	@AfterMethod
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		
	}

}
