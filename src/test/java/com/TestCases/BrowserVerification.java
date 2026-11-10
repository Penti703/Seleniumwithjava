package com.TestCases;

import org.testng.annotations.Test;

import com.PageObjects.HoverAction;

import junit.framework.Assert;

public class BrowserVerification extends BaseClassPractace
{
	@Test
	public void browserTest() {
		try {
	System.out.println("Open browser");
	HoverAction hc=new HoverAction(driver);
	hc.testPageName();//Name verification
	hc.webTitle();//Web page title verification
	hc.Widgets();
	Assert.assertTrue(true);
	}catch(Exception e){
		System.out.println("Error message : "+e.getMessage());
	}
	}
}
