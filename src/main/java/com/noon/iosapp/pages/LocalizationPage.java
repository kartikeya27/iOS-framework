package com.noon.iosapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.noon.iosapp.pages.base.BasePage;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class LocalizationPage extends BasePage {

	public LocalizationPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appsMenu;
	
	@FindBy(xpath=IConstants.ARABIC_SCREEN)
	public IOSElement arabicScreen;
	
	@FindBy(xpath=IConstants.ENGLISH_SCREEN)
	public IOSElement englishScreen;
	
	public void localizationTest() {
		test.log(LogStatus.INFO, "Click on menu");
		appsMenu.click();
		test.log(LogStatus.INFO, "Click on Arabic pagr");
		arabicScreen.click();
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ARABIC_SCREEN_LOGIN)));
		Assert.assertTrue(isElementPresent(IConstants.ARABIC_SCREEN_LOGIN), "Could not load arabic login screen text");
		test.log(LogStatus.INFO, "Click on menu");
		appsMenu.click();
		test.log(LogStatus.INFO, "Click on english page");
		englishScreen.click();
	}

}
