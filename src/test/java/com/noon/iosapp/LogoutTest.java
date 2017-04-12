package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.LogoutPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LogoutTest extends BaseTest {
	
/*String testName="LogoutTest";
	
	@Test
	public void logoutTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "To test logout from application");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		LogoutPage logoutPage = new LogoutPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),logoutPage);
		logoutPage.logoutApp();
		test.log(LogStatus.INFO, "Logout from application");
		test.log(LogStatus.PASS, "Test Passed");
	}*/

}
