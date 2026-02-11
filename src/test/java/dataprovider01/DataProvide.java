package dataprovider01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {

	WebDriver driver;
	@BeforeClass
	void openPage () {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test( dataProvider = "dp")
	void LoginPage (String email,String pwd) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		
		
		
	}
	
	@AfterClass
	void tearDown () {
		driver.close();
		
	}
	@DataProvider( name ="dp")
	  Object[][] logidata(){
		Object data[][]= {{"Venkatesh","123456"},
						{"Venkatesh1","1234563"},
						{"","123456"},
						{"Venkatesh",""},
						{"Admin","admin123"}
	};
		
	return data;
}
}
