package testautomationPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverTC01 extends BaseClass {
	@Test
	public void mouseHoverbutton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 300 pixels
        js.executeScript("window.scrollBy(0,500)");
		PageSetUp PageWindoTc01=new PageSetUp(driver);
		Thread.sleep(3000);
		 PageWindoTc01.mouseHover();
	}

}
