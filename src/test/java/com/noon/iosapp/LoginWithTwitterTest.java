package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.SocialMediaPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginWithTwitterTest extends BaseTest {
	
/*String testName="LoginWithTwitterTest";
	
	@Test
	public void twitterLogin() throws InterruptedException {
			test = rep.startTest(testName);
			test.log(LogStatus.INFO, "Login through twitter account");
			launchIOSApp();
			test.log(LogStatus.INFO, "IOS App Launch successfully");
			SocialMediaPage socialMediaPage = new SocialMediaPage(iDriver, test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver), socialMediaPage);
			String twitterUserEmail = "noontesting1@gmail.com";
			String twitterUserPassword = "P@ssword1";
			socialMediaPage.facebookLogin(twitterUserEmail, twitterUserPassword);
	}*/
}
