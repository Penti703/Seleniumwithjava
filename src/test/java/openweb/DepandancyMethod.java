package openweb;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepandancyMethod {

	@Test(priority = 1)
	void openApp() {
		Assert.assertTrue(true);
	}
	@Test(priority =2 , dependsOnMethods = {"openApp"})
	void logIn() {
		Assert.assertTrue(true);
	}
	@Test(priority = 3,dependsOnMethods = {"logIn"})
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority = 4 ,dependsOnMethods = {"Login","Search"})
	void AdvSearch() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 5 ,dependsOnMethods = {"Login"})
	void logOut() {
		Assert.assertTrue(true);
	}
}
