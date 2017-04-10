package com.noon.iosapp;

import com.noon.iosapp.pages.*;
import dtos.catalog.ProductByNinResponse;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import services.AddressService;
import services.ProductService;

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

		AllOrdersPage allOrdersPage = new AllOrdersPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), allOrdersPage);

		String userName = "noontesting2+12@gmail.com";
		String password = "1200@Villa";
		ProductService productService = new ProductService();
		ProductByNinResponse productByNinResponse = productService.getTestProduct();
		String searchItem = productByNinResponse.getName();
		String deliverAddress = "Emmaar Square Building #3";
		String name = "Antanina";
		String phoneNumber = "0554720809";

		searchPage.searchProduct(searchItem);
		addtoCartPage.addToCart();
		addAddressPage.addNewAddressCheckout();
		addAddressPage.signinTab();
		loginByEmail.loginByEmail(userName, password);
		addAddressPage.addNewAddressCheckout();
		addAddressPage.weDeliverText();
		addAddressPage.addNewAddress(deliverAddress);
		addAddressPage.deliveryAddressCOD(name, phoneNumber);
		checkoutPage.payOnDelivery();
		checkoutPage.orderByCOD();
		allOrdersPage.allOrdersList();
		AddressService addressService = new AddressService();
		addressService.deleteAllAddresses(userName, password);
		topMenu.gotoMenu();
		myAccountPage.gotoMyAccount();
		myAccountPage.gotoAddressBook();
		myAccountPage.gotoMyProfile();
		logoutPage.logoutApp();
	}
}

