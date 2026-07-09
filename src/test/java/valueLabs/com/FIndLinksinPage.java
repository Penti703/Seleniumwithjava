package valueLabs.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FIndLinksinPage extends BaseClassVL{
	@Test(priority=0)
	public void webLinks() {
		System.out.println("Validating the links ");
		List<WebElement>links=driver.findElements(By.xpath("//a"));
		System.out.println("Nuber of links present in the WebPage : "+links.size());
		//verifying the links present in the Home page  
		for(int i=0 ; i<links.size() ; i++) {
		String linkTextName= links.get(i).getText();
		String linkTextURL= links.get(i).getAttribute("href");
			System.out.println("Text--"+i+" = "+linkTextName);
			System.out.println("URL--"+i+" = "+linkTextURL);
			
		}
	}
		
		@Test(priority = 1)
		public void webLinksNames() {
			System.out.println("Validating the links ");
			List<WebElement>links=driver.findElements(By.xpath("//a"));
			System.out.println("Nuber of links present in the WebPage : "+links.size());
			//verify the name and links how many AND WITHOUT NAE HOW MANY LINKS 
			int countNonText=0;
			int countText=0;
			for(int i=0 ; i<links.size() ; i++) {
			String linkTextName= links.get(i).getText();
			String linkTextURL= links.get(i).getAttribute("href");
			
			
			if(linkTextName.isEmpty()) {
				System.out.println("Textname   :"+linkTextName);
				System.out.println("URL"+linkTextURL);
				countNonText++;
			}else {
				System.out.println("Textname : "+linkTextName);
				System.out.println("URL"+linkTextURL);
				countText++;
			}
			
						
}System.out.println("NonText Count "+countNonText);
System.out.println("NonText Count "+countText);
		}

		@Test(priority=2)
		public void pageLinkTest() {
			
			System.out.println("Validating the links ");
			List<WebElement>links=driver.findElements(By.xpath("//a"));
			System.out.println("Nuber of links present in the WebPage : "+links.size());
			int EmptyNameANDwithURL=0;
			int EmptyNameANDwithoutURL=0;
			int WithNameURL=0;
			//verify the name and links how many AND WITHOUT NAE HOW MANY LINKS 
			for(WebElement link : links) {
				String linkName=link.getText();
				String linkURL=link.getAttribute("href");
				//System.out.println("Name"+linkName);
				//System.out.println("URL"+linkURL);
				
				if(linkName.isEmpty()&&linkURL!=null) {
					System.out.println("EmptyName&withURL : "+linkName+"="+linkURL);
					EmptyNameANDwithURL++;
				}else if(linkName.isEmpty()&&linkURL==null) {
					System.out.println("EmptyName&withoutURL : "+linkName+"="+linkURL);
					EmptyNameANDwithoutURL++;
				}else {
					System.out.println("WithName&URL : "+linkName+"="+linkURL);
					WithNameURL++;
				}
				
			}System.out.println("EmptyNameANDwithURL count : "+EmptyNameANDwithURL);
			System.out.println("EmptyNameANDwithoutURL count : "+EmptyNameANDwithoutURL);
			System.out.println("WithNameURL count : "+WithNameURL);
		}
	}



