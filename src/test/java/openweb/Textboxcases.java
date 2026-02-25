package openweb;


import org.testng.Assert;
import org.testng.annotations.Test;


public class Textboxcases extends BasePracticeTest {
	
	@Test (priority = 1)
	 void textBox() {
		BaseSetupElements base=new BaseSetupElements(driver);
		base.fullTextName("venkatesh Penti");
		base.emailName("venkatesh@gmail.com");
		base.addressName("2-127/108--uppal ,raghavandhra nagar colony lane2,Hyderabad");
		base.passworText("12345678");
		base.buttonClick();
		System.out.println("Case1:Text value passing successfully ");
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("Current URL is :"+CurrentURL);
		String ExpectedURL="CurrentURL";
		Assert.assertEquals(CurrentURL, "https://www.tutorialspoint.com/selenium/practice/text-box.php#","URL is Mismatched ");
		
	}
	
	@Test(priority = 2)
	 void textBox1() {
		BaseSetupElements base=new BaseSetupElements(driver);
		
		String NameText="Krishna"+System.currentTimeMillis();
		String RandomEmail="venkatesh"+System.currentTimeMillis()+"@gmail.com";
		
		base.fullTextName(NameText);
		base.emailName(RandomEmail);
		base.addressName("2-127/108--uppal ,raghavandhra nagar colony lane2,Hyderabad");
		base.passworText("12345678");
		base.buttonClick();
		System.out.println("Case2: Text value passing successfully ");
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("Current URL is :"+CurrentURL);
		String ExpectedURL="CurrentURL";
		Assert.assertEquals(CurrentURL, "https://www.tutorialspoint.com/selenium/practice/text-box.php#","URL is Mismatched ");
		
	}

}
