package qaJava;

import org.testng.annotations.Test;

public class GroupingValues {
	
	@Test(priority = 1,groups = {"Sanity"})
	void logInEmail() {
		System.out.println("Login Through emails ");
	}
	@Test(priority = 2,groups = {"Sanity"})
	void logInByFaceBook() {
		System.out.println("Login Through facebook ");
	}
	
	@Test(priority = 1,groups = {"Sanity"})
	void logInBytwitter() {
		System.out.println("Login Through Twitter ");
	}
	

}
