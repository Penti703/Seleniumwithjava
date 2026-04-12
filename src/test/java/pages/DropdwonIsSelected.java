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

public class DropdwonIsSelected {

	public static void main(String[] args) {
		// using select to select the value 
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolls down by 500 pixels
		js.executeScript("window.scrollBy(0, 300);");
		//driver.findElement(By.xpath("//Select[@id='dropdown']")).click();
		WebElement dropDwonValue=driver.findElement(By.xpath("//Select[@id='dropdown']"));
		Select select=new Select(dropDwonValue);
		select.selectByIndex(1);
		System.out.println(dropDwonValue.getAttribute("value"));
		
		  List<WebElement>st=select.getOptions(); System.out.println(st.size());
		 
		  for(int i=0 ;i<st.size() ; i++) {
			 System.out.println(st.get(i).getText());
			 if(st.get(i).getText().contains("Option 1")) {
				 st.get(i).click();
				 System.out.println(dropDwonValue.getAttribute("value"));
			 }
		  }
		driver.quit();
		

	}

}
