package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.ShopByToysPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShopByToysTest extends BaseTest {

String testName="ShopByToysTest";
	
	@Test
	public void shopByToysCategory() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Check different category inside shop by toys cateogry");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		ShopByToysPage shopByToysPage = new ShopByToysPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),shopByToysPage);
		shopByToysPage.findToysCategory();
		test.log(LogStatus.PASS, "Test Passed");
	}
}
