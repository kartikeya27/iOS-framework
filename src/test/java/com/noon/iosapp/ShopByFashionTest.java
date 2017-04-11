package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.ShopByFashionPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShopByFashionTest extends BaseTest {
	
/*String testName="ShopByFashionTest";
	
	@Test
	public void shopByFashion() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Check different category inside shop by fashion cateogry");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		ShopByFashionPage shopByFashionPage = new ShopByFashionPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),shopByFashionPage);
		shopByFashionPage.findFashionCategory();;
	}*/
}
