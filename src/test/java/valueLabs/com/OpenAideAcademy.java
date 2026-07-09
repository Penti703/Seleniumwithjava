package valueLabs.com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestListener.class)
public class OpenAideAcademy extends BaseClassVL {
	
	@Test
	
	public void openAideAcademyTest_001(){
		WebElement operationtLink=driver.findElement(By.xpath("//a[normalize-space()='Operations']"));
		WebElement productLink=driver.findElement(By.xpath("//a[normalize-space()='Products']"));
		Actions act=new Actions(driver);
		//act.moveToElement(productLink).moveToElement(operationtLink).click().perform();
		act.moveToElement(productLink)
		.pause(Duration.ofSeconds(1))
		.moveToElement(operationtLink)
		.pause(Duration.ofSeconds(1))
		.click().build().perform();
		//act.moveToElement(operationtLink).click().perform();
	try {	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		WebElement linkSub=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class=\"cb-related-links-list\"]//li[2]")));
		//WebElement aideLink =driver.findElement(By.xpath("//a[normalize-space()='AiDE Academy']"));
		linkSub.click();
		String ActulResult=driver.getTitle().trim();
		String ExpReuslt="AiDE Academy - ValueLab".trim();
		System.out.println(ExpReuslt);
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(ExpReuslt, ActulResult," Page title is mismathed ");
			
		}catch(Exception e) {
			System.out.println("Page title is mismatched application");
		}
		
	}
}
