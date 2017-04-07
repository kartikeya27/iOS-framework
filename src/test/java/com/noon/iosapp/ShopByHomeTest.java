package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.ShopByHomePage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShopByHomeTest extends BaseTest {
	
String testName="ShopByHomeTest";
	
	@Test
	public void shopByHomeCategory() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Check different category inside shop by home & garden cateogry");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		ShopByHomePage shopByHomePage  = new ShopByHomePage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),shopByHomePage);
		shopByHomePage.findHomeCategory();
		test.log(LogStatus.PASS, "Test Passed");
	}

}
