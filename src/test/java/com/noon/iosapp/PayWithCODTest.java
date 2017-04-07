package com.noon.iosapp;

import com.noon.iosapp.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import services.AddressService;

public class PayWithCODTest extends BaseTest {

	String testName = "PayWithCODTest";

	@Test
	public void payWithCODCard() throws InterruptedException

	{
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Do product checkout through cash");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");

		TopMenuPage topMenu = new TopMenuPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), topMenu);

		LoginByEmailPhonePage loginByEmail = new LoginByEmailPhonePage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), loginByEmail);

		SearchPage searchPage = new SearchPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), searchPage);

		AddToCartPage addtoCartPage = new AddToCartPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), addtoCartPage);

		MyAccountPage myAccountPage = new MyAccountPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), myAccountPage);

		LogoutPage logoutPage = new LogoutPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), logoutPage);

		AddAddressPage addAddressPage = new AddAddressPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), addAddressPage);

		CheckoutPage checkoutPage = new CheckoutPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), checkoutPage);

		String userName = "noontesting2+12@gmail.com";
		String password = "1200@Villa";
		String searchItem = "Roja Perfume Roja Perfume";
		String deliverAddress = "Emmaar Square Building #3";
		String phoneNumber = "0566681264";

		searchPage.searchProduct(searchItem);
		addtoCartPage.addToCart();
		addAddressPage.addNewAddressCheckout();
		addAddressPage.signinTab();
		loginByEmail.loginByEmail(userName, password);
		addAddressPage.addNewAddressCheckout();
		addAddressPage.weDeliverText();
		addAddressPage.addNewAddress(deliverAddress);
		addAddressPage.deliveryAddress(phoneNumber);
		checkoutPage.payOnDelivery();
		checkoutPage.deleteCardCod();
		AddressService addressService = new AddressService();
		addressService.deleteAllAddresses(userName, password);
		topMenu.gotoMenu();
		myAccountPage.gotoMyAccount();
		myAccountPage.gotoAddressBook();
		myAccountPage.gotoMyProfile();
		logoutPage.logoutApp();
	}
}

