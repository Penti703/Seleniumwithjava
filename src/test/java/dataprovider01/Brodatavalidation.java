package dataprovider01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Brodatavalidation {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void openPage (String br) throws InterruptedException {
		switch (br.toLowerCase()) {
		case "chrome" : driver=new ChromeDriver(); break;
		  case "edge":
	           // String edgePath = System.getProperty("") + "\\drivers\\msedgedriver.exe";
	            System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
	            driver = new EdgeDriver();
	            break;
		default : System.out.println("invalid browser ");return;
		}
		//driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		
	}
	@Test(priority = 1)
	void appLogo() throws InterruptedException {
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(1000);
		
	}
	@Test(priority = 2)
	void getTitle() {
		String titleName=driver.getTitle();
		System.out.println("title name is: "+titleName);
		Assert.assertEquals(titleName,"OrangeHRM","title name mis matched " );
	}
	
	@Test(priority = 3)
	void getUrl() {
		String appURL=driver.getCurrentUrl();
		System.out.println("URL Is: "+appURL);
		Assert.assertEquals(appURL,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","URL is not matched " );
	}
	@AfterClass
	void teradown() {
		driver.close();
	}

}
