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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByUsingActionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='searchbox']"));
		Actions act=new Actions(driver);
		searchBox.sendKeys("Canada");
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		searchBox.sendKeys("India");
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		List<WebElement>dValue=driver.findElements(By.xpath("//div[@class='ui-autocomplete-multiselect-item']"));
		for(WebElement sDvalue : dValue) {
			System.out.println("Selected value is : "+sDvalue.getText());
		}
		driver.close();
		
		
	}

}
