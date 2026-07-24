package testkru.com;

import org.testng.annotations.Test;

import testkruPages.CheckBoxTest;

public class TC_001_CheckBoxPage extends BaseClassTestKru{
	
	@Test
	public void CheckBoxTest01() {
		CheckBoxTest cbt=new CheckBoxTest(driver);
		//navigate to check boox
		cbt.checkBoxLink();
		//Identifying Single check
		cbt.singleSelectCheckBox(); 
		//Multi Select Check box test
		cbt.multiSelectCheckBox();
	}

}
