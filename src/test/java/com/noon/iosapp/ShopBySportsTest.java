package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.ShopBySportsPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShopBySportsTest extends BaseTest {
	
String testName="ShopBySportsTest";
	
	@Test
	public void shopBySportsCategory() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Check different category inside sports cateogry");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		ShopBySportsPage shopBySportsPage  = new ShopBySportsPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),shopBySportsPage);
		shopBySportsPage.findSportsCategory();
		test.log(LogStatus.PASS, "Test Passed");
	}

}
