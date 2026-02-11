package qaJava;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertCaseTest01 {
	@Test
	public void alertTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		String ExpectedResult=driver.getTitle();
		System.out.println("Title Name is :"+ExpectedResult);

		// ---------- Simple Alert (OK button only) ----------
		WebElement alertPopUp = driver.findElement(
		        By.xpath("//button[contains(text(),'Click for JS Alert')]")
		);
		alertPopUp.click();

		Alert alert = driver.switchTo().alert();   // switch to alert
		System.out.println(alert.getText());  // print alert text
		Thread.sleep(1000);
		alert.accept();                            // click OK


		// ---------- Confirmation Alert (OK / Cancel) ----------
		WebElement alertPopUpOk = driver.findElement(
		        By.xpath("//button[@onclick='jsConfirm()']")
		);
		alertPopUpOk.click();

		Alert confirmAlert = driver.switchTo().alert(); // switch to alert
		System.out.println(confirmAlert.getText());  // print alert text
		Thread.sleep(1000);
		confirmAlert.dismiss(); 
		//confirmAlert.accept();
		// Click Prompt Alert button
		WebElement okPopupText = driver.findElement(
		        By.xpath("//button[contains(text(),'Click for JS Prompt')]")
		);
		okPopupText.click();

		// Switch to prompt alert
		Alert promptAlert = driver.switchTo().alert();

		// Enter text into alert
		
		promptAlert.sendKeys("Passing the values into popup");
	     // Accept Accept
		Thread.sleep(2000);
		promptAlert.accept();

		// Capture result text displayed on page
		WebElement resultText = driver.findElement(By.id("result"));
		System.out.println("Result Message: " + resultText.getText());

		Thread.sleep(1000);
		driver.close();

		
		
	}

}
