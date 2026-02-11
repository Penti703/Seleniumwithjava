package qaJava;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ActionOrangeHRM {
	
	@Test
	public void ActioClassTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String ExpectedResult=driver.getTitle();
		System.out.println("Title Name is :"+ExpectedResult);
		Thread.sleep(2000);
		//Login page
		WebElement uName=driver.findElement(By.name("username"));
		Thread.sleep(2000);
		WebElement uPass=driver.findElement(By.name("passwordd"));
		Thread.sleep(2000);
		WebElement LButton=driver.findElement(By.linkText("Login"));
		uName.sendKeys("Admin");
		Thread.sleep(2000);
		uPass.sendKeys("admin123");
		LButton.click();
		
		Thread.sleep(2000);
		
		
	}

}
