package dataprovider01;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATAProviderTest01 {
	
	WebDriver driver;
	@BeforeClass
	void LaunchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider = "dp")
	void LogInPage(String email ,String pwd) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		boolean status =driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
		
	}
	
	@DataProvider(name="dp")
	Object[][] loginData(){
		Object data[][]= { 
				{"abc@gmail.com","123456"},
				{"abc123@gmail.com","123"},
				{"abc4346","123456"},
				{"abc@gmail.com","wedfgh"},
				{"abcjndsf@gmail.com","123456"},
				{"surya123@yopmail.com","Venkat@9866"}
			
		};
		return data;
	}
	
}

