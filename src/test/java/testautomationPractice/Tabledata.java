package testautomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tabledata extends BaseClass{
	
	@Test(priority = 1)
	public void tableData() {
		
		//finding the xpath and printing the hole table data 
		WebElement Tabledata1=driver.findElement(By.xpath("//table[@id='productTable']"));
		String st=Tabledata1.getText();
		System.out.println(st);
	}
	
	@Test(priority = 2)
	public void tableRow() {
		
		//find the table row data in table with names 
		WebElement TableRow=driver.findElement(By.xpath("//table[@id='productTable']//thead//tr"));
		String st=TableRow.getText();
		System.out.println("Table Header name is "+st);
		
	}
	@Test(priority = 3)
	public void tableHead() {
		
		//find the table row data in table with names 
		List<WebElement> TableRowHead=driver.findElements(By.xpath("//table[@id='productTable']//thead//th"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(WebElement header:TableRowHead ) {
			js.executeScript("arguments[0].style.border='4px solid blue'", header);
			System.out.println(header.getText());
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
		@Test(priority = 4)
		public void selectBox() throws InterruptedException {	
			
			List<WebElement> checkBoxes = driver.findElements(
		            By.xpath("//table[@id='productTable']//tbody//input[@type='checkbox']"));

		    JavascriptExecutor js = (JavascriptExecutor) driver;

		    for (WebElement checkbox : checkBoxes) {

		        // Highlight checkbox
		    	
		    	 checkbox.click();
		        js.executeScript("arguments[0].style.border='1px solid red'", checkbox);

		        System.out.println("Displayed: " + checkbox.isDisplayed());
		        
		        checkbox.click();

		        Thread.sleep(2000);

		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		}
	}
}



