package pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSerach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		driver.manage().window().maximize();
		WebElement SerchBox=driver.findElement(By.xpath("//input[@id='searchbox']"));
		SerchBox.sendKeys("Canada");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement option=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']")));
		option.click();
		
		WebElement el=driver.findElement(By.
		  xpath("//div[@class='ui-autocomplete-multiselect-item']")); 
		System.out.println("Sercah Selected value is : "+el.getText());
		
		driver.quit();
		 
		

	}

}
