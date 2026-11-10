package testkru.cases.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testkru.com.BaseClassTestKru;

public class PageVerification extends BaseClassTestKru {

	@Test(priority=0)
	public void verifyHomePageURL() {
			SoftAssert soft=new SoftAssert();
			String actURL = driver.getCurrentUrl();
			String expURL = "https://testkru.com//Test/test";
			soft.assertEquals(actURL, expURL, "URL MissMatched");
			logger.info("Page URL verifying success : "+actURL);
		
			WebElement textVerify= driver.findElement(By.xpath("//h2[text()='Testkru - Codekru Playground for Testers']"));
			String textNameOnWebPage=textVerify.getText();
			boolean webPageText=textVerify.isDisplayed();
			soft.assertTrue(webPageText,"Text is not displayed ");
			logger.info("Page text verification success : "+textNameOnWebPage);
			
			//Title Verifying in the webPage 
			String pageTitleverify=driver.getTitle();
			soft.assertEquals(pageTitleverify,"TestKru","Title is missed");
			logger.info("Page title verification success : "+pageTitleverify);
			soft.assertAll();
	}
}