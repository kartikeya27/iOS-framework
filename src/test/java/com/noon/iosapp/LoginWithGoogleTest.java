package com.noon.iosapp;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.SocialMediaPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginWithGoogleTest extends BaseTest {
	
/*String testName="LoginWithGoogleTest";
	
	@Test
	public void googleLogin() throws InterruptedException {
			test = rep.startTest(testName);
			test.log(LogStatus.INFO, "Login  through google account");
			launchIOSApp();
			test.log(LogStatus.INFO, "IOS App Launch successfully");
			SocialMediaPage socialMediaPage = new SocialMediaPage(iDriver, test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver), socialMediaPage);
			String googleUserEmail = "noontesting2@gmail.com";
			String googleUserPassword = "1200@Villa";
			socialMediaPage.googleLogin(googleUserEmail, googleUserPassword);
	}*/
}
