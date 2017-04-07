package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.AddToCartPage;
import com.noon.iosapp.pages.SearchPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddToCartTest extends BaseTest {
	
	String testName="AddToCartTest";
	
	@Test
	public void addToCart() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Add item into cart");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		
		SearchPage searchPage = new SearchPage(iDriver, test);
		AddToCartPage addtoCartPage = new AddToCartPage(iDriver, test);
		
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),searchPage);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),addtoCartPage);
		
		String searchItem = "Roja Perfume Roja Perfume";
		searchPage.searchProduct(searchItem);
		addtoCartPage.addToCart();
		addtoCartPage.removeItem();
	}	
}
