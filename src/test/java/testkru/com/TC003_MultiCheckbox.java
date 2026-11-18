package testkru.com;

import org.testng.Assert;
import org.testng.annotations.Test;


import testkruPages.CheckBoxPage;

public class TC003_MultiCheckbox extends BaseClassTestKru{
	
	@Test
	public void verifyMultiCheckBox() {
		CheckBoxPage cbp=new CheckBoxPage(driver);
		cbp.checkBoxLink();
		String expURL =cbp.getCurrentURL();
		String actURL="https://testkru.com/Elements/Checkboxes";
		Assert.assertEquals(expURL, actURL," Url is mis matched");
		boolean isMultiSelectValid=cbp.validateMultiSelectBehavior();
		logger.info(" Status of Selection all the checkboxes "+isMultiSelectValid);
		Assert.assertTrue(isMultiSelectValid," Multi selection check/Uncheck is failed ");
		logger.info("Multi Select checkboxes select and unselect successfully");
	}
	

}
