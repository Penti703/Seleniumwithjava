package pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiKeySelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='searchbox']"));
		searchBox.sendKeys("Canada");
		Thread.sleep(1000);
		searchBox.sendKeys(Keys.DOWN);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		searchBox.sendKeys("India");
		Thread.sleep(500);
		searchBox.sendKeys(Keys.DOWN);
		Thread.sleep(500);
		searchBox.sendKeys(Keys.DOWN);
		Thread.sleep(500);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//Get all Selected contries 
		List<WebElement>mDropValue=driver.findElements(By.xpath("//div[@class='ui-autocomplete-multiselect-item']"));
		for(WebElement DropValue : mDropValue ) {
			String name=DropValue.getText();
			System.out.println("Selected value is : "+name);
		}
		Thread.sleep(1000);
		driver.quit();

	}

}
