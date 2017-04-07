package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.AddAddressPage;
import com.noon.iosapp.pages.AddToCartPage;
import com.noon.iosapp.pages.CheckoutPage;
import com.noon.iosapp.pages.LoginByEmailPhonePage;
import com.noon.iosapp.pages.LogoutPage;
import com.noon.iosapp.pages.MyAccountPage;
import com.noon.iosapp.pages.SearchPage;
import com.noon.iosapp.pages.TopMenuPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import services.AddressService;

public class AddCreditCardCheckoutTest extends BaseTest {
	
String testName="AddCreditCardCheckoutTest";
	
	@Test
	public void AddCreditCardCheckout() throws InterruptedException 
	
	{
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Add credit card throuhg check out flow");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		
		TopMenuPage topMenu = new TopMenuPage(iDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),topMenu);
		
		LoginByEmailPhonePage loginByEmail = new LoginByEmailPhonePage(iDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),loginByEmail);
		
		SearchPage searchPage = new SearchPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),searchPage);
		
		AddToCartPage addtoCartPage = new AddToCartPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),addtoCartPage);
		
		MyAccountPage myAccountPage = new MyAccountPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),myAccountPage);
		
		LogoutPage logoutPage = new LogoutPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),logoutPage);
		
		AddAddressPage addAddressPage = new AddAddressPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),addAddressPage);
		
		CheckoutPage checkoutPage = new CheckoutPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),checkoutPage);
		
		String userName = "noontesting2+12@gmail.com";
		String password = "1200@Villa";
		String searchItem = "Roja Perfume Roja Perfume";
		String deliverAddress = "Emmaar Square Building #3";
		String phoneNumber = "0566681264";
		String cName = "Kartik";
		String cNumber = "4111111111111111";
		String cExpMonth = "05";
		String cExpYear = "2020";
		//String cCvv = "123";

		searchPage.searchProduct(searchItem);
		addtoCartPage.addToCart();
		addAddressPage.addNewAddressCheckout();
		addAddressPage.signinTab();
		loginByEmail.loginByEmail(userName, password);
		addAddressPage.addNewAddressCheckout();
		addAddressPage.weDeliverText();
		addAddressPage.addNewAddress(deliverAddress);
		addAddressPage.deliveryAddress(phoneNumber);
		checkoutPage.addCreditCard();
		checkoutPage.addCreditCardCheckout(cName,cNumber,cExpMonth, cExpYear);
		checkoutPage.deleteCard();
		AddressService addressService = new AddressService();
		addressService.deleteAllAddresses(userName, password);
		topMenu.gotoMenu();
		myAccountPage.gotoMyAccount();
		myAccountPage.gotoAddressBook();
		myAccountPage.gotoMyProfile();
		logoutPage.logoutApp();
		
	}
}	
