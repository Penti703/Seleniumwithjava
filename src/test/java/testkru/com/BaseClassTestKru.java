package testkru.com;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTestKru {

    protected WebDriver driver;

    protected static final Logger logger =
            LogManager.getLogger(BaseClassTestKru.class);

    @BeforeMethod
    public void openPage() {

        logger.info("===== Test Setup Started =====");

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption(
                "excludeSwitches",
                Arrays.asList("enable-automation")
        );

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        logger.info("Chrome browser launched successfully");

        driver.get("https://testkru.com/");

        logger.info("Current URL: {}", driver.getCurrentUrl());

        logger.info("Browser opened and URL navigation completed");
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {

            logger.info("Closing browser");

            driver.quit();

            logger.info("Browser closed successfully");
        }

        logger.info("===== Test Execution Completed =====");
    }
}