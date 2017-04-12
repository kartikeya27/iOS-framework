package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.SocialMediaPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginWithFacebookTest extends BaseTest {
	
/*String testName="LoginWithFacebookTest";
	
	@Test
	public void facebookLogin() throws InterruptedException {
			test = rep.startTest(testName);
			test.log(LogStatus.INFO, "Login through facebook account");
			launchIOSApp();
			test.log(LogStatus.INFO, "IOS App Launch successfully");
			SocialMediaPage socialMediaPage = new SocialMediaPage(iDriver, test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver), socialMediaPage);
			String facebookUserEmail = "noontesting1@gmail.com";
			String facebookUserPassword = "P@ssword1";
			socialMediaPage.facebookLogin(facebookUserEmail, facebookUserPassword);
	}*/
}
