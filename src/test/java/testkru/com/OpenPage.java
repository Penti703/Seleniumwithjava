package testkru.com;

import org.testng.annotations.Test;

import testkruPages.TC_001_WebPage;

public class OpenPage extends BaseClassTestKru{

	@Test
	public void OpenWebPage() {
		TC_001_WebPage page=new TC_001_WebPage(driver);
		page.testTxrWebPage();
		
		
	}
}
