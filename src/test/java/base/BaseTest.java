package base;

import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// Added for verification
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    
    // Global variable
    protected WebDriver driver;
    
    @BeforeMethod
    public void launchPage() { // Renamed for correct spelling (camelCase)
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
      //  options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
     // 1. Removes the "Chrome is being controlled..." infobar
     options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        //options.setExperimentalOption("useAutomationExtension", false);
        // CORRECTION: Removed 'WebDriver' prefix to use the global variable
        driver = new ChromeDriver(options); 
        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/index.php?route=common/home");
    }
    
  
    @AfterMethod
    public void exitBrowser() { // Renamed for correct spelling
        // Added a null check to prevent errors if browser never opened
        if (driver != null) {
            driver.quit();
        }
    }
}