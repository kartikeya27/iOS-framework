package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.SearchPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductDetailsTest extends BaseTest 
{
	String testName="ProuctDetailsTest";
	
	@Test
	public void prodcutDetails() throws InterruptedException 
	{
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Find product details");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		SearchPage searchPage = new SearchPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),searchPage);
		String searchItem = "Roja Perfume Roja Perfume";
		searchPage.searchProduct(searchItem);
		searchPage.productDetails();
	}
}
