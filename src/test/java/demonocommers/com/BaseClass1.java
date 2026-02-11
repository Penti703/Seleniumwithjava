
	package demonocommers.com;

	import java.time.Duration;
	import java.util.Arrays;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

	public  class BaseClass1 {
		WebDriver driver;
		@BeforeMethod
		void LaunchPage() {
			ChromeOptions options =new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
			driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fcomputers");
			driver.manage().window().maximize();
		
		}
		

	    @AfterMethod
	    public void tearDown() throws InterruptedException {
	    	Thread.sleep(2000);
	        driver.quit();
	    }

	}


