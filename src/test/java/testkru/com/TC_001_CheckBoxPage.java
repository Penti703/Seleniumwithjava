package testkru.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import testkruPages.CheckBoxTest;

public class TC_001_CheckBoxPage extends BaseClassTestKru{
	
	@Test
	public void CheckBoxTest01() {
		CheckBoxTest cbt=new CheckBoxTest(driver);
		//navigate to check boox
		cbt.checkBoxLink();
		String actualURL=cbt.getCurrentUrl();
		String expURL="https://testkru.com/Elements/Checkboxes".trim();
		System.out.println("chekBoxLink is : "+actualURL);
		Assert.assertEquals(expURL,actualURL,"URL is Mis matched ");
		System.out.println("Checkbox Navigation Successfully");	
		//Identifying Single check
		cbt.singleSelectCheckBox(); 
		//Multi Select Check box test
		cbt.multiSelectCheckBox();
		//Verify the radio buttons 
		cbt.disableChekBox();
		//Verify checkbox is not displaying
		cbt.hiddenChekBox();
		//PreCheckBox verify
		cbt.preSelectCheckBox();
		//Nested CheckBox
		cbt.nestedChekBox();
	}

}
