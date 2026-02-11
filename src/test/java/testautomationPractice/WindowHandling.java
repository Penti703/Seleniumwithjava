package testautomationPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class WindowHandling extends BaseClass{

	@Test
	void handlingWindow() throws InterruptedException {
		PageSetUp pageTc01=new PageSetUp(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 300 pixels
        js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		pageTc01.handlingWindowpage();
		String title=driver.getTitle();
		System.out.println(title);
	}
}
