package testkru.com;

import org.testng.Assert;
import org.testng.annotations.Test;
import testkruPages.CheckBoxPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TC002_SingleCheckBox extends BaseClassTestKru {
	 private static final Logger logger =
	            LogManager.getLogger(TC002_SingleCheckBox.class);

	@Test(priority = 1)
	public void selectSingleCheckBox() {
		CheckBoxPage cbp = new CheckBoxPage(driver);
		// Navigating and Verifying the URL
		cbp.checkBoxLink();
		String actURL = cbp.getCurrentURL();
		String expURL = "https://testkru.com/Elements/Checkboxes".trim();
		logger.info("Navigated to the URL " + actURL);
		// Assertion to validatin the Actual and expecetd Result
		Assert.assertEquals(actURL, expURL, "URL Is Mismatched");
		boolean isSelected = cbp.selectedSingleCheckBoxAtIndex(0);
		Assert.assertTrue(isSelected, "failed to select the check box");	

	}

	@Test(priority = 2)
	public void selecCheckBoxOneByOne() {
		CheckBoxPage cbp = new CheckBoxPage(driver);
		// Navigating and Verifying the URL
		cbp.checkBoxLink();
		String actURL = cbp.getCurrentURL();
		String expURL = "https://testkru.com/Elements/Checkboxes".trim();
		logger.info("Navigated to the URL " + actURL);
		
		boolean isBehaviorValide=cbp.validateSingleSelectBehavior();
		logger.info("Selection one by one is |:| "+isBehaviorValide);
		Assert.assertTrue(isBehaviorValide,"Single-selection sequential checkbox is failed");
		logger.info("Single-select checkboxes verified successfully.");

	}
}
