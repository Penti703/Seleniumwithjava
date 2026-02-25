package openweb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
 class Checkbox extends BasePracticeTest{
	
	@Test(priority = 1)
	void checkBox1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ElementS=driver.findElement(By.xpath("//button[normalize-space()='Elements']"));
		ElementS.click();
		WebElement checkboxelement=driver.findElement(By.xpath("//a[normalize-space()='Check Box']"));
		Thread.sleep(2000);
		checkboxelement.click();
		String expectedUrl = "https://www.tutorialspoint.com/selenium/practice/check-box.php";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "URL is Mismatched");
		System.out.println("URL name "+expectedUrl);
		List<WebElement> checboxes=driver.findElements(By.xpath("//ul[@id='bs_main']"));
		
		Assert.assertFalse(checboxes.isEmpty(),"Unchecked the checkbox");
		System.out.println("CheckboxStatusis"+checboxes.isEmpty());
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement firstcheckbox=driver.findElement(By.xpath("//input[@id='c_bs_1']"));
		Thread.sleep(2000);
		firstcheckbox.click();
		Assert.assertTrue(firstcheckbox.isSelected(),"Check box is not selected");
		System.out.println("Checkbox selected status:"+firstcheckbox.isSelected());
		Thread.sleep(2000);
		firstcheckbox.click();
		Assert.assertFalse(firstcheckbox.isSelected(),"Check box is still selected");
		System.out.println("Checkbox selected status:"+firstcheckbox.isSelected());
	}
		
	@Test(priority = 2)
		void subCheckbox() throws InterruptedException{
		Thread.sleep(2000);
		WebElement ElementS=driver.findElement(By.xpath("//button[normalize-space()='Elements']"));
		ElementS.click();
		WebElement checkboxelement=driver.findElement(By.xpath("//a[normalize-space()='Check Box']"));
		Thread.sleep(2000);
		checkboxelement.click();
		
		WebElement expandPlus =driver.findElement(By.xpath("//span[@class='plus']"));
		WebElement SubPlus1 =driver.findElement(By.xpath("//li[@id='bf_1']//span[@class='plus']"));
		WebElement SubPlus2 =driver.findElement(By.xpath("//li[@id='bf_2']//span[@class='plus']"));
		WebElement firstcheckbox =driver.findElement(By.xpath("//input[@id='c_bs_1']"));
		WebElement subCheckBox1 =driver.findElement(By.xpath("//input[@id='c_bf_1']"));
		WebElement subCheckBox2=driver.findElement(By.xpath("//input[@id='c_bf_2']"));
		Thread.sleep(1000);
		
		expandPlus.click();
		Thread.sleep(1000);
		//subCheckBox1.click();
		//Assert.assertTrue(subCheckBox1.isSelected(),"Sub-check is not selected");
		//System.out.println("Checkbox selected status:"+subCheckBox1.isSelected());
		firstcheckbox.click();
		Assert.assertTrue(firstcheckbox.isSelected(),"Check box is not selected");
		System.out.println("Checkbox selected status:"+firstcheckbox.isSelected());
		
		//Negative cass unchecking the subcheckbox and validating the main check box as well 
		Thread.sleep(1000);
		subCheckBox1.click();
		Assert.assertFalse(subCheckBox1.isSelected(),"Sub-check1 is still selected");
		System.out.println("Checkbox selected status:"+subCheckBox1.isSelected());
		//firstcheckbox.click();
		Assert.assertFalse(firstcheckbox.isSelected(),"Check box is is still main selected");
		System.out.println("Checkbox selected status:"+firstcheckbox.isSelected());
		
		
		
	}
 }
