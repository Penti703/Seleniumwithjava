package testkru.cases.com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import testkru.com.BaseClassTestKru;

public class HomePageVerification extends BaseClassTestKru{
	
	public static final String expURL="https://testkru.com/";
	public static final String expTitle="TestKru";
	public static final String expText="Testkru - Codekru Playground for Testers";
	 private static final By     HEADER_LOCATOR = By.xpath("//h2[text()='" + expText+ "']");
	
	@Test(description = "Verify Home Page URL")
	public void verifyHomePageURL() {
		String actURL=driver.getCurrentUrl();
		Assert.assertEquals(actURL,expURL," URL is Miss matched ");
		logger.info("URL verified : {}",actURL);
	}
	
	@Test(description = "Verify Home Page Title")
	public void verifyHomePageTitle() {
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle,expTitle," Title is Miss matched ");
		logger.info("title verified : {}",actTitle);
	}
	

	@Test(description = "Verify Home Page Text")
	public void verifyHomePageText() {
		String actText=driver.findElement(HEADER_LOCATOR).getText();
		Assert.assertEquals(actText,expText,"  Text is Miss matched ");
		logger.info("text verified:  {}",actText);
	}

}
