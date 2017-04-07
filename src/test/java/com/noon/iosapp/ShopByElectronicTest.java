package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.ShopByElectronicPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShopByElectronicTest extends BaseTest {
	
String testName="ShopByElectronicTest";
	
	@Test
	public void shopByElectronic() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Check different category inside electronic cateogry");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		ShopByElectronicPage shopByElectronicPage = new ShopByElectronicPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),shopByElectronicPage);
		shopByElectronicPage.findElectronicCategory();
		test.log(LogStatus.PASS, "Test Passed");
	}
}
