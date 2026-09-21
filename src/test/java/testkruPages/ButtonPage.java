package testkruPages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testkru.com.BaseClassTestKru;

public class ButtonPage extends BaseClassTestKru {

    private static final Logger logger =
            LogManager.getLogger(ButtonPage.class);

    public ButtonPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

        logger.info("ButtonPage initialized");
    }

    @FindBy(xpath = "//*[contains(text(),'Elements')]")
    private WebElement sidebarElements;

    @FindBy(xpath = "//a[text()='Buttons']")
    private WebElement sidebarButton;
    
    @FindBy(xpath = "//button[name='doubleClick']")
    private WebElement doubleClick;


    public void sidebarElements() {

        try {

            logger.info("Navigating to Elements menu");

            Actions action = new Actions(driver);

            action
                .pause(Duration.ofSeconds(1))
                .moveToElement(sidebarElements)
                .perform();

            String actualURL = driver.getCurrentUrl().trim();

            String expectedURL = "https://testkru.com/";

            logger.info("Current URL: {}", actualURL);

            Assert.assertEquals(
                    actualURL,
                    expectedURL,
                    "URL mismatched"
            );

            logger.info("Elements menu validation successful");

        } catch (Exception e) {

            logger.error("Elements menu navigation failed", e);

            Assert.fail(e.getMessage());
        }
    }


    public void sidebarButton() {

        try {

            logger.info("Navigating to Buttons page");

            Actions action = new Actions(driver);

            action
                .pause(Duration.ofSeconds(1))
                .moveToElement(sidebarButton)
                .click()
                .perform();

            String actualURL = driver.getCurrentUrl().trim();

            String expectedURL =
                    "https://testkru.com/Elements/Buttons";

            logger.info("Actual URL: {}", actualURL);
            logger.info("Expected URL: {}", expectedURL);

            Assert.assertEquals(
                    actualURL,
                    expectedURL,
                    "URL mismatched"
            );

            logger.info("Buttons page navigation successful");

        } catch (Exception e) {

            logger.error("Buttons page navigation failed", e);

            Assert.fail(e.getMessage());
        }
    }
    
        
}