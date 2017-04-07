package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.CheckoutPage;
import com.noon.iosapp.pages.LoginByEmailPhonePage;
import com.noon.iosapp.pages.LogoutPage;
import com.noon.iosapp.pages.MyAccountPage;
import com.noon.iosapp.pages.TopMenuPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddCreditCardWalletTest extends BaseTest {
	
String testName="AddCreditCardWalletTest";
	
	@Test
	public void addCreditCardWallet() throws InterruptedException 
	{
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Check all sidebar links");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");

		TopMenuPage topMenuPage = new TopMenuPage(iDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),topMenuPage);
		
		LoginByEmailPhonePage loginByEmail = new LoginByEmailPhonePage(iDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),loginByEmail);
		
		MyAccountPage myAccountPage = new MyAccountPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),myAccountPage);
		
		LogoutPage logoutPage = new LogoutPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),logoutPage);
		
		CheckoutPage checkoutPage = new CheckoutPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),checkoutPage);
		
		String userName = "noontesting2+12@gmail.com";
		String password = "1200@Villa";
		String cName = "Kartik";
		String cNumber = "4111111111111111";
		String cExpMonth = "05";
		String cExpYear = "2020";
		//String cCvv = "123";
		
		loginByEmail.loginLink();
		loginByEmail.loginByEmail(userName, password);
		topMenuPage.gotoMenu();
		myAccountPage.gotoMyAccount();
		myAccountPage.gotoMyWallet();
		checkoutPage.addCreditCardWallet(cName,cNumber,cExpMonth, cExpYear);
		topMenuPage.gotoMenu();
		myAccountPage.gotoMyAccount();
		myAccountPage.gotoAddressBook();
		myAccountPage.gotoMyProfile();
		logoutPage.logoutApp();
		//checkoutPage.addCreditCard(cName,cNumber,cExpMonth, cExpYear,cCvv);
		
	}

}
