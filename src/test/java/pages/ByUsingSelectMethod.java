package pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByUsingSelectMethod {

	public static void main(String[] args) {
		//Using Select method achiving the getting values 
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolls down by 500 pixels
		js.executeScript("window.scrollBy(0, 500);");
		
		/*
		 * WebElement dropDown=driver.findElement(By.xpath("//select[@id='country']"));
		 * Select st=new Select(dropDown); st.selectByIndex(3); System.out.println();
		 */
		  List<WebElement> ol=driver.findElements(By.xpath("//div//select[@id='country']//option"));
		  //Size of list
		  System.out.println("Size of the contries is : "+ol.size());
		  //using looping 
		  String selectedCountry="";
		  for(int i=0 ; i<ol.size() ; i++) {
			  if(ol.get(i).getText().contains("Angola")) {

			        ol.get(i).click();
			        selectedCountry = ol.get(i).getText();

			    }
			}

			System.out.println("Selected Country : " + selectedCountry);

			driver.quit();
	}
}