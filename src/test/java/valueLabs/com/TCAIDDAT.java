package valueLabs.com;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.testng.Assert;
import utilities.DataProviderVL;
import valueLabsPages.AideWebPage;
import valueLabsPages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Listeners(listeners.TestListener.class)
public class TCAIDDAT extends BaseClassVL{
	
	@Test(dataProvider="ChatPage",dataProviderClass = DataProviderVL.class)
	public void testAIDChat(String fname,String lname,String email, String company, String message ,String status) throws InterruptedException {
		try {
		HomePage hm=new HomePage(driver);
		logger.info("URL navigation home page");
		hm.experienceLink();
		Thread.sleep(500);
		logger.info("URL navigation to Express "+driver.getCurrentUrl());
		AideWebPage aid=new AideWebPage(driver);
		aid.AideChat();
		Thread.sleep(500);
		aid.letAidChat();
		logger.info("URL navigation to aid "+driver.getCurrentUrl());
		Thread.sleep(1000);
		aid.fnametxt(fname);
		aid.lnametxt(lname);
		aid.emailtxt(email);
		aid.companytxt(company);
		aid.hearDopbox();
		aid.LocationDropdown();
		aid.messagetxt(message);
		aid.scrollDown();
		aid.submitButton();
		Thread.sleep(500);
		if(status.equalsIgnoreCase("Pass")) {
			Assert.assertEquals(aid.isSuccessMessageDisplayed(),"Thank you for expressing your interest!","Aid Chat failed");
			logger.info("aid chat is success"+driver.getCurrentUrl());
			logger.info("aid chat is success"+driver.getTitle());
			
		}else if(status.equalsIgnoreCase("InvalidEmail")) {
			Assert.assertEquals(aid.getAidEmaliError(), "Email must be formatted correctly.".trim()," error email is failed ");
			System.out.println("aid emailchat is error success handling ");
			logger.info("aid emailchat is error success handling");
		}
		
		else {
			Assert.assertEquals(aid.getAidChatError(),"Please complete this required field.".trim()," faild to load aid chat");
			System.out.println("aid chat is error success handling ");
		}
		
	}catch(Exception e) {
	
		Assert.fail("failed Messages :"+e.getMessage());
		logger.info("faild message : "+e.getMessage());
		
	}
	}
	
}

