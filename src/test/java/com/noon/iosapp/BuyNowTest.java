package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.BuyNowPage;
import com.noon.iosapp.pages.SearchPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BuyNowTest extends BaseTest {
	
String testName="BuyNowTest";
	
	@Test
	public void buyNowItems() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Buy now items");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		
		SearchPage searchPage = new SearchPage(iDriver, test);
		BuyNowPage buyNowPage = new BuyNowPage(iDriver, test);
		
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),searchPage);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),buyNowPage);
		
		//String searchItem = "Genuine French Leather Wallet";
		String searchItem = "Roja Perfume Roja Perfume";
		searchPage.searchProduct(searchItem);
		buyNowPage.buyNowProduct();
	}

}
