package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.LocalizationPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LocalizationTest extends BaseTest {
	
String testName="LocalizationTest";
	
	@Test
	public void prodcutDetails() throws InterruptedException 
	{
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Check Arabic page");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		LocalizationPage locallizationPage = new LocalizationPage(iDriver, test); 
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), locallizationPage);
		locallizationPage.localizationTest();
	}
}	
