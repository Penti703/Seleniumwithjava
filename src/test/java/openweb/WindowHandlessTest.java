package openweb;

import java.time.Duration;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandlessTest {
		 WebDriver driver;
	@BeforeMethod
	public void OpenBrowse() {
		

	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
	driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    // Opening the webpage with new tab
    driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
	}
    @Test(priority = 1)
    public void OpenNewtab() throws InterruptedException {
    	String St= driver.getWindowHandle();
    	Thread.sleep(2000);
    	WebElement tabButton= driver.findElement(By.xpath("//button[contains(text(),'New Tab')]"));
    	tabButton.click();
    	Thread.sleep(3000);   	
    	System.out.println("tab title name is:"+	driver.getTitle());
       driver.switchTo().window(St);//switching to parent tab
    }
    
    @Test(priority = 2)//New tab and printing the chaild table data 
    public void OpenNewtabData() throws InterruptedException {
    	Thread.sleep(2000);
    	String Parent = driver.getWindowHandle();
    	WebElement tabButton= driver.findElement(By.xpath("//button[contains(text(),'New Tab')]"));
    	tabButton.click();
    	System.out.println("Tab title name is:"+	driver.getTitle());
    	Thread.sleep(3000);   
    	Set<String> allWindows= driver.getWindowHandles();
    	for(String WC: allWindows) {
    		if(!Parent.equalsIgnoreCase(WC)) {
    			driver.switchTo().window(WC);
    			WebElement e=driver.findElement(By.xpath("html/body/main/div/div/h1"));
    			System.out.println("Chaild tab text: "+driver.getTitle());
    			System.out.println("Chaild tab text: "+e.getText());
    			break;
    		}
    	}
    			
    		}
    		
    		 @Test(priority = 3)
    		    public void OpenWindowPopup() throws InterruptedException {
    		    	Thread.sleep(2000);
    		    	String Parent = driver.getWindowHandle();
    		    	WebElement tabButton= driver.findElement(By.xpath("//button[contains(text(),'New Window')]"));
    		    	tabButton.click();
    		    	System.out.println("Tab title name is:"+	driver.getTitle());
    		    	Thread.sleep(3000);   
    		    	Set<String> allWindows= driver.getWindowHandles();
    		    	for(String WC: allWindows) {
    		    		if(!Parent.equalsIgnoreCase(WC)) {
    		    			driver.switchTo().window(WC);
    		    			WebElement e=driver.findElement(By.xpath("html/body/main/div/div/h1"));
    		    			System.out.println("Chaild tab text: "+driver.getTitle());
    		    			System.out.println("Chaild tab text: "+e.getText());
    		    			break;
    		    			
    		    		}	
    		
    		
    	}
    	
       
    }
    
    @AfterMethod
    public void teardown() throws InterruptedException 
    
    {
    	
    	Thread.sleep(3000); 
    driver.quit();
	
	}
}
