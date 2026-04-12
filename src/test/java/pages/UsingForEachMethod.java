package pages;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				
				  List<WebElement> ol=driver.findElements(By.xpath("//div//select[@id='country']//option"));
				  String stValue="";
				  for(WebElement DropV : ol) {
					 String st= DropV.getText();
					 if(DropV.getText().equals("Yemen")) {
						 DropV.click();
						 stValue=DropV.getText();
					 }
				  }System.out.println("Selected valkue is : "+stValue);
				  driver.quit();

	}			

}
