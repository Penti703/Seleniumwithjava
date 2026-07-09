package valueLabs.com;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class BrokenLinkStatusCode extends BaseClassVL{
	
	@Test
	public void testBrokenParallel() {
	System.out.println("Validating the links ");
	
	
	List<WebElement> links = driver.findElements(By.tagName("a"));

	links.parallelStream().forEach(link -> {

	    String url = link.getAttribute("href");

	    if (url == null || url.isEmpty()
	            || url.startsWith("javascript")
	            || url.startsWith("mailto")) {
	        return;
	    }

	    try {

	        HttpURLConnection con =
	                (HttpURLConnection) new URL(url).openConnection();

	        con.setRequestMethod("HEAD");
	        con.setConnectTimeout(5000);
	        con.setReadTimeout(5000);

	        int code = con.getResponseCode();

	        if (code >= 400) {
	            System.out.println(Thread.currentThread().getName()
	                    + " | BROKEN | " + code + " | " + url);
	        } else {
	            System.out.println(Thread.currentThread().getName()
	                    + " | OK | " + code + " | " + url);
	        }

	        con.disconnect();

	    } catch (Exception e) {
	        System.out.println("ERROR | " + url);
	    }
	});
	}

}
