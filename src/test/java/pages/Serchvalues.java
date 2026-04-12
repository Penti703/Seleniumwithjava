package pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Serchvalues {

	public static void main(String[] args) {
		// SerachValue and Clear
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		search.sendKeys("venkatesh Penti");
		String name=search.getAttribute("value");
		System.out.println(name);
		search.clear();
		search.sendKeys("Krishna");
		String name2=search.getAttribute("value");
		System.out.println(name2);
		search.sendKeys(Keys.ENTER);
		// Wait for the iframe to be available and switch to it
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement checkBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='reCAPTCHA']")));

		// Click the checkbox once inside the iframe
		//WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark")));
		checkBox.click();
		

		
		
		
	}

}
