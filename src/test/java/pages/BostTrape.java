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

public class BostTrape {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		driver.manage().window().maximize();	
		WebElement dropV=driver.findElement(By.xpath("//select[@id='demo-multiple-select']//option"));
		dropV.click();
		Select st=new Select(dropV);
		st.selectByIndex(3);
		List<WebElement>opt=st.getOptions();
		System.out.println(opt.size());
		
		for(int i=0 ; i<opt.size() ; i++) {
			opt.get(i).getText();
			System.out.println(opt.get(i).getText());
		}
	
		
		driver.quit();

	}

}
