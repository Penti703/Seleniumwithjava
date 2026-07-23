package testkru.com;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RadioButtonTest {
	public static WebDriver driver;
	@BeforeMethod
	
	public void openPage() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testkru.com/Elements/RadioButtons");
		System.out.println("Current URL is : "+driver.getCurrentUrl());
		
	}

	@Test(priority=0)
	public void radioButton() {
		
		List<WebElement> radioSingle=driver.findElements(By.xpath("(//div[1][@class='mt-2 row text-dark'])//input[@name='select']"));
		for(WebElement radiButton : radioSingle)
		{
			String st=radiButton.getAttribute("value");
			System.out.println(st);
			if(st.equals("firstSelect1") ){
				radiButton.click();	
				System.out.println(radiButton.isSelected());
				break;
			}else {
				System.out.println("Test is failed");
			}
		}
	}
		
	@Test(priority = 1)//Verify the single radio button with if else 
	public void singleRadio() {
		WebElement radioButton=driver.findElement(By.xpath("//label[@for='firstSelect2']"));
		String ActReslt=radioButton.getText();
		System.out.println("ActReslt : "+ActReslt);
		boolean value=radioButton.isSelected();
		System.out.println("Before Radio button is selected "+value);
		if(!radioButton.isSelected()) {
			radioButton.click();
			System.out.println("Radio button selected successfull");
		}else {
			System.out.println("Radion button is not selected ");
		}
		
		
	}
		
	@Test(priority = 2)//Verify the radion button selection using assertion post selection usig isSelect() method
	public void singleRadio1() {
		WebElement radioButton=driver.findElement(By.xpath("//label[@for='firstSelect2']"));
		String ActReslt=radioButton.getText();
		System.out.println("ActReslt : "+ActReslt);
		radioButton.click();
		Assert.assertTrue(!radioButton.isSelected(),"not selected ");
		if(!radioButton.isSelected()) {
			System.out.println("Radio button selected successfully");
		}else {
		System.out.println("Radio button NOT selected successfully");
		}
	}
	
	@Test(priority = 3)//Verify the radion button without selecting and verifying the isSelecetd or not -ve case 
	public void singleRadio2() {
		WebElement radioButton=driver.findElement(By.xpath("//label[@for='firstSelect2']"));
		String ActReslt=radioButton.getText();
		System.out.println("ActReslt : "+ActReslt);
		Assert.assertFalse(radioButton.isSelected(),"not selected ");
		if(!radioButton.isSelected()) {
			System.out.println("Radio button is NOT selected");
		}else {
		System.out.println("Radio button selected successfully");
		}
	}
	
	@Test(priority = 4)//verifying the multi select Checkbox  
	public void multiradioSelection() {
		List<WebElement> radioButtons=driver.findElements(By.xpath("(//div[@class='mt-2 row text-dark'])[2]//label[@class='pr-2']"));
					
	for(int i=0 ; i<radioButtons.size() ; i++) {
		String nameOfradio=radioButtons.get(i).getText();
		System.out.println("Index of "+i+" = :"+nameOfradio);
		if(i==1) {
			radioButtons.get(i).click();
			Assert.assertTrue(!radioButtons.get(i).isSelected(),"Radio button at index "+i+"Was Not selected ");
		}
	}
	}
	
	@Test(priority = 5)//verifying the multi select Checkbox  
	public void multiradioSelect() {
		List<WebElement> radioButtons=driver.findElements(By.xpath("(//div[@class='mt-2 row text-dark'])[2]//label[@class='pr-2']"));
		for(WebElement listRadio : radioButtons) {
			String radionNames=listRadio.getText();
			//System.out.println(radionNames);
			if(!listRadio.isSelected()) {
				listRadio.click();
				System.out.println(radionNames+" value = "+listRadio.isSelected());
				
			}
		}System.out.println("All radio buttons selected ");
	}			
	@Test
	public void singleRadioButton() {
	}
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
	driver.quit();
		}
	}

}
