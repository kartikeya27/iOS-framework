package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.AddToCartPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EditCartTest extends BaseTest {
	
String testName="EditCartTest";
	
	@Test
	public void editCartItems() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "add item, increase & decrease item and remove items");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");

		//allowScreen();
		
		AddToCartPage addToCartPage = new AddToCartPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),addToCartPage);
		
		String searchItem = "Roja Perfums Roja Perfume";

		addToCartPage.addMultipleItems(searchItem);
		addToCartPage.increaseItem();
		addToCartPage.decreaseItem();
		addToCartPage.removeItem();
	}
}
