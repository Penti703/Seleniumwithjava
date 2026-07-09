package valueLabs.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class OpenPageOne extends BaseClassVL{
	@Test
	public void pageTest_001(){
		
		//Verify the title of the page 
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Agentic AI Services & Digital Transformation Company | ValueLabs";
		System.out.println("Page Title is : "+ActualTitle);
		Assert.assertEquals(ExpectedTitle,ActualTitle,"Title is mismatched ");
		
		//verify the pagecontext in the application 
		WebElement txtDisplayed=driver.findElement(By.xpath("//span[normalize-space()='Custom Agentic AI Solutions.']"));
		boolean value=txtDisplayed.isDisplayed();
		System.out.println(value);
		Assert.assertTrue(value,"txtIsNot Displayed in the Appliaction");
		
		//verify the  UrL
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.valuelabs.com/","URL Is Mismatched   ");
		
		WebElement prdoctLink=driver.findElement(By.xpath("//ul[@class='navbar-nav ms-auto']//li[1]//a[normalize-space()='Products']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> headLinks = driver.findElements(
		        By.xpath("//ul[@class='navbar-nav ms-auto']//a[@class='nav-link dropdown-toggle']"));

		for (WebElement link : headLinks) {

		    if (link.getText().trim().equals("Products")) {

		        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
		        String currentUrl = driver.getCurrentUrl();
		        System.out.println("Current URL : " + currentUrl);
		        break;
		    }
		}
		}
		}
		
	
	


