package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.LoginByEmailPhonePage;
import com.noon.iosapp.pages.LogoutPage;
import com.noon.iosapp.pages.MyAccountPage;
import com.noon.iosapp.pages.TopMenuPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginByPhoneTest extends BaseTest {
		
	String testName="LoginByPhoneTest";
			
	@Test
	public void loginByPhone() throws InterruptedException 
		{
			test = rep.startTest(testName);
			test.log(LogStatus.INFO, "Login in by phone test");
			launchIOSApp();
			
			test.log(LogStatus.INFO, "IOS App Launch successfully");
							
			LoginByEmailPhonePage loginByPhone = new LoginByEmailPhonePage(iDriver,test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver),loginByPhone);
			
			TopMenuPage topMenu = new TopMenuPage(iDriver,test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver),topMenu);
			
			MyAccountPage myAccountPage = new MyAccountPage(iDriver, test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver),myAccountPage);
							
			LogoutPage logoutPage = new LogoutPage(iDriver,test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver),logoutPage);
			
			String userPhone = "0566681264";
			String password = "P@ssword1";
							
			loginByPhone.loginLink();
			loginByPhone.verifyButton();
			loginByPhone.loginByPhone(userPhone,password);
			myAccountPage.gotoMyAccount();
			myAccountPage.gotoMyWallet();
			myAccountPage.gotoMyProfile();
			logoutPage.logoutApp();
		}
}
