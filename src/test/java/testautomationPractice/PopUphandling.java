package testautomationPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PopUphandling extends BaseClass {

	@Test(priority=1)
	void popuphandling() throws InterruptedException {
		PageSetUp pageTest=new PageSetUp(driver);
		pageTest.alertPopuclick();
		Alert alert=driver.switchTo().alert();
		String popupTextmessage=alert.getText();
		Thread.sleep(1000);
		System.out.println("Alert Popup message is :"+popupTextmessage);
		alert.accept();//Accepting 
		Assert.assertTrue(true);
		
	}

	@Test(priority=2)
	void popuphandlingConfirm() throws InterruptedException {
		PageSetUp pageTest=new PageSetUp(driver);
		pageTest.PopupOkAndCancel();
		Alert alert=driver.switchTo().alert();
		String popupTextmessage1=alert.getText();
		Thread.sleep(1000);
		System.out.println("Alert Popup message is :"+popupTextmessage1);
		alert.accept();//Accepting 
		//alert.dismiss();
		Assert.assertTrue(true);
		
	}
	@Test(priority=3)
	void popuphandlingText() throws InterruptedException {
		PageSetUp pageTest=new PageSetUp(driver);
		String inpuName="Venkatesh Penti";
		pageTest.PopupPassvalueOkay();
		Alert alert=driver.switchTo().alert();;
		String popupTextmessage1=alert.getText();
		alert.sendKeys(inpuName);
		
		Thread.sleep(1000);
		System.out.println("Alert Popup message is :"+popupTextmessage1);
		alert.accept();//Accepting 
		WebElement promptName=driver.findElement(By.xpath("//p[@id='demo']"));
		String ActualResult=promptName.getText();
		System.out.println("Printing the prompt result  message "+ ActualResult);
		Assert.assertTrue(ActualResult.contains(inpuName),"Enter name is miss mathed ");
		
		
		//alert.dismiss();
		Assert.assertTrue(true);
		
	}
	
}
