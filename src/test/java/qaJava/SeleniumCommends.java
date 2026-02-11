package qaJava;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SeleniumCommends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
			

	}

}
