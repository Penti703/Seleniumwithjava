package pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerachByLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement SerchBox=driver.findElement(By.xpath("//input[@id='searchbox']"));
		String [] CountryN= {"Canada","India","Aruba"};
		
		for(String country : CountryN ) {
			SerchBox.sendKeys(country);
			WebElement option=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']")));
			option.click();
		}
		
	
		List<WebElement> Svalue=driver.findElements(By.xpath("//div[@class='ui-autocomplete-multiselect-item']"));
		
		for(WebElement value : Svalue) {
			String name=value.getText();
			System.out.println("Selected values is : "+name);

		}
		
		driver.close();
		

	}

}
