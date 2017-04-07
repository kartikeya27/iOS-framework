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

public class LoginByEmailTest extends BaseTest {
	
	String testName="LoginByEmailTest";
	
	@Test
	public void loginByEmail() throws InterruptedException {
			test = rep.startTest(testName);
			test.log(LogStatus.INFO, "Login in by email test");
			
			launchIOSApp();
			test.log(LogStatus.INFO, "IOS App Launch successfully");
			
			LoginByEmailPhonePage loginByEmail = new LoginByEmailPhonePage(iDriver,test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver),loginByEmail);
			
			TopMenuPage topMenu = new TopMenuPage(iDriver,test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver),topMenu);
			
			LogoutPage logoutPage = new LogoutPage(iDriver,test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver),logoutPage);
			
			MyAccountPage myAccountPage = new MyAccountPage(iDriver, test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver),myAccountPage);
			
			String userName = "noontesting2+12@gmail.com";
			String password = "1200@Villa";
			
			loginByEmail.loginLink();
			loginByEmail.verifyButton();
			loginByEmail.loginByEmail(userName, password);
			loginByEmail.verifyUser();
			myAccountPage.gotoMyAccount();
			myAccountPage.gotoMyWallet();
			myAccountPage.gotoMyProfile();
			logoutPage.logoutApp();
		}
		
	}

