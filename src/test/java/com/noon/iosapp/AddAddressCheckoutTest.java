package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.AddAddressPage;
import com.noon.iosapp.pages.AddToCartPage;
import com.noon.iosapp.pages.LoginByEmailPhonePage;
import com.noon.iosapp.pages.LogoutPage;
import com.noon.iosapp.pages.MyAccountPage;
import com.noon.iosapp.pages.SearchPage;
import com.noon.iosapp.pages.TopMenuPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import services.AddressService;

public class AddAddressCheckoutTest extends BaseTest {
	
String testName="AddAddressCheckoutTest";
	
	@Test
	public void addToCart() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Add new address from checkout");
		launchIOSApp();
		
		TopMenuPage topMenu = new TopMenuPage(iDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),topMenu);
		
		LoginByEmailPhonePage loginByEmail = new LoginByEmailPhonePage(iDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),loginByEmail);
		
		SearchPage searchPage = new SearchPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),searchPage);
		
		AddToCartPage addtoCartPage = new AddToCartPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),addtoCartPage);
		
		AddAddressPage addAddressPage = new AddAddressPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),addAddressPage);
		
		MyAccountPage myAccountPage = new MyAccountPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),myAccountPage);
		
		LogoutPage logoutPage = new LogoutPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),logoutPage);
		
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
		addAddressPage.addNewAddressCheckoutConformation();
		AddressService addressService = new AddressService();
		addressService.deleteAllAddresses(userName, password);
		addAddressPage.gotoCart();
		topMenu.gotoMenu();
		myAccountPage.gotoMyAccount();
		myAccountPage.gotoMyWallet();
		myAccountPage.gotoMyProfile();
		logoutPage.logoutApp();
	}
}	
