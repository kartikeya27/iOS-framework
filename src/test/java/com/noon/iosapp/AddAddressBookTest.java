package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.AddAddressPage;
import com.noon.iosapp.pages.LoginByEmailPhonePage;
import com.noon.iosapp.pages.LogoutPage;
import com.noon.iosapp.pages.MyAccountPage;
import com.noon.iosapp.pages.TopMenuPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import services.AddressService;


public class AddAddressBookTest extends BaseTest {
	
String testName="AddAddressBookTest";
	
	@Test
	public void addAddressBook() throws InterruptedException 
	{
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Add new address from address book page");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		
		TopMenuPage topMenu = new TopMenuPage(iDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),topMenu);
		
		LoginByEmailPhonePage loginByEmail = new LoginByEmailPhonePage(iDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),loginByEmail);
		
		AddAddressPage addAddressPage = new AddAddressPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),addAddressPage);
		
		TopMenuPage topMenuPage = new TopMenuPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),topMenuPage);
		
		MyAccountPage myAccountPage = new MyAccountPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),myAccountPage);
		
		LogoutPage logoutPage = new LogoutPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),logoutPage);
		
		String userName = "noontesting2+12@gmail.com";
		String password = "1200@Villa";
		
		String deliverAddress = "Emmaar Square Building #3";
		String phoneNumber = "0566681264";
		
		loginByEmail.loginLink();
		loginByEmail.loginByEmail(userName, password);
		topMenuPage.gotoMenu();
		myAccountPage.gotoMyAccount();
		myAccountPage.gotoMyWallet();
		myAccountPage.gotoAddressBook();
		addAddressPage.addNewAddress(deliverAddress);
		addAddressPage.deliveryAddressCredit(phoneNumber);
		topMenuPage.gotoMenu();
		myAccountPage.gotoMyAccount();
		myAccountPage.gotoMyWallet();
		myAccountPage.gotoAddressBook();
		addAddressPage.addressConformation();
		//test service to remove all address
		AddressService addressService = new AddressService();
		addressService.deleteAllAddresses(userName, password);
		topMenuPage.gotoMenu();
		myAccountPage.gotoMyAccount();
		myAccountPage.gotoMyWallet();
		myAccountPage.gotoAddressBook();
		myAccountPage.gotoMyProfile();
		logoutPage.logoutApp();
	}

}
