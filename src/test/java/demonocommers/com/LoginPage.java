package demonocommers.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass1{

	@Test
	public void loginTitle() {
		String title =driver.getTitle();
		System.out.println("Title name "+title);
		Assert.assertTrue(true, title);
	
		
	}
	
	@Test
	public void loginURL() {
		String URL =driver.getCurrentUrl();
		System.out.println("URL IS:"+URL);
		Assert.assertTrue(true, URL);
	
		
	}
}
