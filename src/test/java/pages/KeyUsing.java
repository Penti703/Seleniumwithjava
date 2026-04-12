package pages;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class KeyUsing {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='searchbox']"));
		searchBox.sendKeys("canada");
		Thread.sleep(1000);
		searchBox.sendKeys(Keys.DOWN);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement dropDownValue=driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect-item']"));
		//Assert.assertEquals(st, "canada","not canada");//hard assertion
		String st=dropDownValue.getText();
		System.out.println("search name is : "+st);
		
		if(st.equalsIgnoreCase("canada")) {
			System.out.println("Selected value is canada");
		}else {
			System.out.println("Selected value is not canada");
		}
		Thread.sleep(2000);

		driver.quit();
	}

}
