package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.RegisterWithEmailPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterWithEmailTest extends BaseTest {
	String testName="RegisterWithEmailTest";
	
	@Test
	public void registerWithEmail() throws InterruptedException {
			test = rep.startTest(testName);
			test.log(LogStatus.INFO, "Registration with email test");
			
			launchIOSApp();
			test.log(LogStatus.INFO, "IOS App Launch successfully");
			RegisterWithEmailPage registerWithEmailPage = new RegisterWithEmailPage(iDriver,test);
			PageFactory.initElements(new AppiumFieldDecorator(iDriver),registerWithEmailPage);
			
			String userName = "kartik";
			//String userEmail= "noontesting2+13@gmail.com";
			String userPassword = "P@ssword1";
			
			registerWithEmailPage.registerWithEmail(userName, userPassword);
	}
     
}