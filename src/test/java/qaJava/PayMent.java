package qaJava;

import org.testng.annotations.Test;

public class PayMent {
	
	@Test(priority=1,groups = {"Sanity","Function"})
	void paymentUpByEmails(){
		System.out.println(" paymentUpByEmails");
	}
	@Test(priority=2, groups = {"Function"})
	void paymentUpByTwitter(){
		System.out.println("paymentUpBytwitter");
	}
	@Test(priority=3, groups = {"Regression","Function"})
	void paymentUpByfacbook(){
		System.out.println("PaymentByFacebook");
	}


}
