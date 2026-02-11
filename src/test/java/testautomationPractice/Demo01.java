package testautomationPractice;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class Demo01 {
	
	WebDriver driver;
	@BeforeClass
	void LaunchPage() {
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
@Test(priority = 1)
void testOpenPageTitle() {
	String ActualResult=driver.getTitle();
	String ExpectedResult="Automation Testing Practice";
	System.out.println("Case1:Title verification :"+ActualResult);
	Assert.assertEquals(ActualResult, "Automation Testing Practice","Title mismatched");
}

@Test(priority=2)
	void verifyUrl() {
	String ActResult=driver.getCurrentUrl();//verifying the current URl 
	String Expresult="https://testautomationpractice.blogspot.com/";
	System.out.println(ActResult);
	if(ActResult.equals(Expresult)) {
		System.out.println("CASE2:URL is Matched ");
	}else {
		System.out.println("Fail CASE2: URL is Mis matched");
	}
}

@Test(priority = 3)
void textElement()
{
	PageSetUp Pagetc01=new PageSetUp(driver);
	boolean act=Pagetc01.isTextDisplayed();
	Assert.assertTrue(act, "text is mismatched ");
	
}
@Test(priority = 4)
public void SerachFunction() throws InterruptedException{
	PageSetUp Pagetc01=new PageSetUp(driver);
	Pagetc01.SearchName("venkatesh");
	Thread.sleep(3000);
	Pagetc01.clickSearch();
	Thread.sleep(3000);
	Pagetc01.selectResult("venkatesh");
	
	String actUrl=driver.getCurrentUrl();
	System.out.println();
	String expUrl="https://en.wikipedia.org/wiki/Venkatesh";
	if(actUrl.contains(expUrl)) {
		System.out.println("URL Matched successsfully");
	}else {
		System.out.println("URL is Mismatched");
	}	
}
		
	@Test(priority = 5)
	void VerifyClick() {
		PageSetUp Pagetc01=new PageSetUp(driver);
		Pagetc01.getButtonText();
		
		
		
	}

@AfterClass
void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
	System.out.println("Closing the browser");
}
}
