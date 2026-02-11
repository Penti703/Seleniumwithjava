package qaJava;

import org.testng.annotations.Test;

public class SignUp {
	
	@Test(priority=1,groups = {"Regression"})
	void signUpByEmails(){
		System.out.println(" signUpByEmails");
	}
	@Test(priority=2,groups = {"Regression"})
	void signUpByTwitter(){
		System.out.println("signUpBytwitter");
	}
	@Test(priority=3,groups = {"Regression"})
	void signUpByfacbook(){
		System.out.println("signUpByFacebook");
	}

}
