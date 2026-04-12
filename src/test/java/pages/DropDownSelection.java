package pages;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelection {

	public static void main(String[] args) {
		// dropdownvalue Selection
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolls down by 500 pixels
		js.executeScript("window.scrollBy(0, 300);");
		WebElement dropDwonValue=driver.findElement(By.xpath("//Select[@id='dropdown']"));
		
		dropDwonValue.click();
		//Select By using the keywords
		dropDwonValue.sendKeys(Keys.ARROW_DOWN);
		dropDwonValue.sendKeys(Keys.ENTER);
		String selectedValue=dropDwonValue.getAttribute("value");//Options value is one 1
		//String selectedText=dropDwonValue.getText();
		System.out.println("selectedValue is : "+selectedValue);
		//System.out.println("selectedText is : "+selectedText);
		String exp="1";
		if(selectedValue.equals(exp)) {
			System.out.println("Option 1 is selected ");
		}else {
			System.out.println("Option 1 is not selected ");
		}
		
		driver.quit();

	}

}
