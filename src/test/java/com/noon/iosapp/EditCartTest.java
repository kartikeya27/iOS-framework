package com.noon.iosapp;

import com.noon.iosapp.pages.SearchPage;
import dtos.catalog.ProductByNinResponse;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.AddToCartPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import services.ProductService;

public class EditCartTest extends BaseTest {
	
String testName="EditCartTest";
	
	@Test
	public void editCartItems() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "add item, increase & decrease item and remove items");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");

		//allowScreen();
		SearchPage searchPage = new SearchPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),searchPage);

		
		AddToCartPage addToCartPage = new AddToCartPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),addToCartPage);



		ProductService productService = new ProductService();
		ProductByNinResponse productByNinResponse = productService.getTestProduct();
		String searchItem = productByNinResponse.getName();

		//addToCartPage.addMultipleItems(searchItem);
		searchPage.searchProduct(searchItem);
		addToCartPage.addToCart();
		addToCartPage.increaseItem();
		addToCartPage.decreaseItem();
		addToCartPage.removeItem();
	}
}
