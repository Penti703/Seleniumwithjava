package valueLabs.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import valueLabsPages.AideWebPage;
import valueLabsPages.HomePage;

public class AIDchatTC001 extends BaseClassVL {

@Test
public void aidtest() throws InterruptedException {
	//Obeject Reference for 
	HomePage hp=new HomePage(driver);
	hp.experienceLink();
	
	//Obeject Reference 
	AideWebPage  linkAID=new AideWebPage(driver);
	linkAID.AideChat();
	String ActualURl=driver.getCurrentUrl();
	String ExpResult="https://www.valuelabs.com/products/experience/aide-chat/";
	System.out.println("URL IS : "+ActualURl);
	if(ActualURl.equalsIgnoreCase(ExpResult)) {
		System.out.println("URL Matching Successfully");
	}else {
		System.out.println("URL Matching Unsuccessfull");
	}
	Thread.sleep(3000);
	linkAID.letAidChat();
	String letaidchat=driver.getCurrentUrl();
	System.out.println("URL Scroll "+letaidchat);

	linkAID.fnametxt(randomString());
	Thread.sleep(1000);
	linkAID.lnametxt(randomString());
	Thread.sleep(1000);
	linkAID.emailtxt(randomEmail());
	Thread.sleep(1000);
	linkAID.companytxt(randomString());
	Thread.sleep(1000);
	linkAID.hearDopbox();
	Thread.sleep(1000);
	linkAID.LocationDropdown();
	Thread.sleep(1000);
	linkAID.messagetxt(randomString());
	Thread.sleep(1000);
	linkAID.subButton();
	Thread.sleep(2000);
	
	/*
	 * Assert.assertTrue(linkAID.isSuccessMessageDisplayed(),
	 * "Success message is not displayed");
	 */
	
	String actual = linkAID.getSuccessMessage().trim();
	String expected = "Thank you for expressing your interest!".trim();

	Assert.assertEquals(actual, expected, "Success message is mismatched");
	
	
	//Thank you for expressing your interest!
	
	
	
}
}
