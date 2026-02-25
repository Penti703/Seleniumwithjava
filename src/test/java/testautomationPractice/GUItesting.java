package testautomationPractice;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
//import java.util.logging.FileHandler;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GUItesting {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException , IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		
		try {
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println("Url is matched ");
		
		
		}
		catch(Exception e){
			
			System.out.println("Url is not matched ");
			e.printStackTrace();
			
		}
		
		
		try {
			WebElement Name=driver.findElement(By.id("name"));
			Name.sendKeys("venkatesh Penti");
			String name=Name.getAttribute("value");
			System.out.println(name);
		}
		catch(Exception e) {
			System.out.println("Name element finding is wrong  "+e);
		}
		
		try {
		WebElement eMail= driver.findElement(By.xpath("//input[@id='emailk']"));
		eMail.sendKeys("penti703@gmail.com");
		String passingeMail=eMail.getAttribute("value");
		System.out.println(passingeMail);
		}
		catch(Exception e){

		    System.out.println("Email Element is mismatched " + e);

		    // Screenshot code

		    TakesScreenshot ts = (TakesScreenshot) driver;

		    File source = ts.getScreenshotAs(OutputType.FILE);

		    File destination = new File("./screenshot/email_error.png");

		    try {

		        FileHandler.copy(source, destination);

		        System.out.println("Screenshot saved successfully");

		    } catch (IOException e1) {

		        e1.printStackTrace();
		    }
		}
		


		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("12345678");
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
