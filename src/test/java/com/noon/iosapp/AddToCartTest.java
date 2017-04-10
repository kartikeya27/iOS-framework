package com.noon.iosapp;

import dtos.catalog.ProductByNinResponse;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.AddToCartPage;
import com.noon.iosapp.pages.SearchPage;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import services.ProductService;

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

		ProductService productService = new ProductService();
		ProductByNinResponse productByNinResponse = productService.getTestProduct();
		String searchItem = productByNinResponse.getName();

		searchPage.searchProduct(searchItem);
		addtoCartPage.addToCart();
		addtoCartPage.removeItem();
	}	
}
