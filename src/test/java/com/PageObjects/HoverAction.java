package com.PageObjects;

import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TestCases.BaseClassPractace;

public class HoverAction extends BaseClassPractace {

	private WebDriver driver;

	// Initialize PageFactory and pass WebDriver instance
	public HoverAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[normalize-space()='Automation Demo Site']")
	WebElement pageText;

	@FindBy(xpath = "//a[text()='Widgets']")
	WebElement Widgets;
	@FindBy(xpath = "//a[text()='AutoComplete']")
	WebElement AutoComplete;

//Verfying the pageName in webApplication	
	public void testPageName() {
		try {
			String expPageName = "Automation Demo Sit".trim();
			String actPageName = pageText.getText();
			System.out.println("Page Text Is :" + actPageName);
			Assert.assertEquals(expPageName, actPageName, " name is mismatched");

		} catch (Exception e) {
			System.out.println("Name verification message "+e.getMessage());
		}
	}

	public void webTitle() {
		try {
			String actWebPageTitle = driver.getTitle();
			String expWebPageTitle = "Register".trim();
			System.out.println("Web page title is :" + actWebPageTitle);

		} catch (Exception e) {
			System.out.println("Title error message : "+e.getMessage());
		}
	}

	public boolean iswidgetDisplayed() {
		return Widgets.isDisplayed();

	}

	public void Widgets() {
		Actions act = new Actions(driver);
		act.pause(Duration.ofSeconds(2)).moveToElement(Widgets).click().perform();

	}
}