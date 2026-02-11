package demonocommers.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginTest extends BaseClass1{

	@Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)

    public void loginTest(String username, String password)  {


        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        System.out.println("Tested with: " + username + " / " + password);

        driver.quit();
    }
}
