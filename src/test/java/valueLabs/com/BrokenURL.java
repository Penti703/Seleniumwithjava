package valueLabs.com;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenURL extends BaseClassVL{
	
	@Test
	public void brokenURLTest() {
		System.out.println("Validating the links ");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Nuber of links present in the WebPage : "+links.size());
		List<String> brokenURL=new ArrayList<>();
		List<String> validURL=new ArrayList<>();
		
		for(WebElement link : links) {
			String url=link.getAttribute("href");
			if (url == null || url.isEmpty() ||
			        url.startsWith("javascript") ||
			        url.startsWith("mailto")) {
			        continue;
			}
			try {
				URL linkurl=new URL(url);
			HttpURLConnection connection=(HttpURLConnection)linkurl.openConnection();
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responsCode=connection.getResponseCode();
			if(responsCode>=400) {
				brokenURL.add(url);
			}else {
				validURL.add(url);
			}
				
				
			}catch(Exception e){
				brokenURL.add(url);
				
			}
		}
		System.out.println("valid URL -----");
		for(String url :validURL) {
			System.out.println(url);
		}System.out.println("valid URL Size-----"+validURL.size());
		System.out.println("Broken URL in the System ");
		for(String url : brokenURL) {
			System.out.println(url);
		}System.out.println("valid URL Size-----"+brokenURL.size());
	}

}
