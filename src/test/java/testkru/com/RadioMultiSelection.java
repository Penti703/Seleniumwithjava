package testkru.com;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class RadioMultiSelection {
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		//Global Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testkru.com/Elements/RadioButtons");
		driver.manage().window().maximize();
		String ActualURl=driver.getCurrentUrl().trim();
		String ExpectedURL="https://testkru.com/Elements/RadioButtons".trim();
		Assert.assertEquals(ExpectedURL, ActualURl,"URL is mis matched ");
		System.out.println("Case star : Open Browser and Navigating to URL SuccessFullly");
		
	}
	
	@Test(priority=0)
	public void radioButton() {
		List<WebElement> radioButtons=driver.findElements(By.xpath("(//div[@class='mt-2 row text-dark'])[2]//label[@class='pr-2']"));
		
		for(WebElement rbuttons :radioButtons) {
			String ButonName=rbuttons.getText();
			System.out.println(ButonName);
			if(!rbuttons.isSelected()) {
				rbuttons.click();
				
			}
		}System.out.println("Selected all Radio buttons");
	}
	
	@Test(priority = 1)
	public void radioButtonVerify() {
		//By Using the iF else to validating the 
		List<WebElement> radioButtons=driver.findElements(By.xpath("(//div[@class='mt-2 row text-dark'])[2]//input[@type='radio']"));
		
		for(WebElement rbuttons :radioButtons) {
			String ButonName=rbuttons.getAttribute("value");
			rbuttons.click();
			if(rbuttons.isSelected()) {
				System.out.println(rbuttons.getAttribute("value")+"  Is Selected ")	;	
			}else {
				System.out.println(rbuttons.getAttribute("value")+"  Is not Selected ");
			}
		}System.out.println("Selected all Radio buttons");
	}
	
	@Test(priority = 2)
	public void radioButtonAssert() {
		//verify By Using Assertion
		List<WebElement> radioButtons=driver.findElements(By.xpath("(//div[@class='mt-2 row text-dark'])[2]//input[@type='radio']"));
		
		for(WebElement rbuttons :radioButtons) {
			rbuttons.click();
			Assert.assertTrue(rbuttons.isSelected(),rbuttons.getAttribute("value"));
			System.out.println(rbuttons.getAttribute("value")+" : "+rbuttons.isSelected());
		}
	}
	
	@Test(priority = 3)
	public void radioButtonIsnable() {
		//verify By Using Assertion
		List<WebElement> radioButtons=driver.findElements(By.xpath("(//div[@class='mt-2 row text-dark'])[1]//input[@type='radio']"));
		for(WebElement rbuttons :radioButtons) {
			String radioText=rbuttons.getAttribute("value").trim();
			if(rbuttons.isEnabled()&&!rbuttons.isSelected()&&radioText.equalsIgnoreCase("secondSelect1")) {
				rbuttons.click();
				Assert.assertTrue(rbuttons.isSelected(),rbuttons.getAttribute("value"));
				System.out.println(rbuttons.getAttribute("value")+" : "+rbuttons.isSelected());
			}else if(rbuttons.isEnabled()&&!rbuttons.isSelected()) {
				Assert.assertFalse(rbuttons.isSelected(),rbuttons.getAttribute("value"));
				System.out.println(rbuttons.getAttribute("value")+" : "+rbuttons.isSelected());
			}
			
		}
	}
	
	@Test(priority = 4)
	public void verifyRadioButtons() {

		List<WebElement> radioButtons=driver.findElements(By.xpath("(//div[@class='mt-2 row text-dark'])[1]//input[@type='radio']"));
	    
		WebElement previousElement=null;
		for(WebElement currentradio : radioButtons) {
			currentradio.click();
			Assert.assertTrue(currentradio.isSelected(),currentradio.getAttribute("value")+"Should be selected");
			
			if(previousElement!=null) {
				Assert.assertFalse(previousElement.isSelected(),previousElement.getAttribute("value")+"Should be Unselected");
			}
		    System.out.println("----------------------------");
			
			for(WebElement radio : radioButtons ) {
				//Assert.assertTrue(radio.isSelected(),radio.getAttribute("value")+"Should be selected");
				System.out.println(radio.getAttribute("value")+" : "+radio.isSelected()+" ");
			}
			previousElement=currentradio;
		}
	}
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			this.driver=driver;
			driver.quit();
			System.out.println("Case Final: Browser Closed Successfully");
			
		}
	}

}
