package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.ShopByBookPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShopByBookTest extends BaseTest {

/*String testName="ShopByBookTest";
	
	@Test
	public void shopByBookCategory() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Check different category inside shop by book,music & movies cateogry");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		ShopByBookPage shopByBookPage = new ShopByBookPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),shopByBookPage);
		shopByBookPage.findBookCategory();
	}*/
}
