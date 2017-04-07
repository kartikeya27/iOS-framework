package com.noon.iosapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noon.iosapp.pages.base.BasePage;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BuyNowPage extends BasePage {

	public BuyNowPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	@FindBy(xpath=IConstants.BUYNOW_BUTTON)
	public IOSElement buyNowButton;
	
	@FindBy(xpath=IConstants.SEARCH_TEXT_SELECT)
	public IOSElement searchTextSelect;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_CELL)
	public IOSElement deliveryAddressCell;
	
	public void buyNowProduct() {
		test.log(LogStatus.INFO, "Click on product details");
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_TEXT_SELECT)));
		searchTextSelect.click();
		test.log(LogStatus.INFO, "Buy product using buy now button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BUYNOW_BUTTON)));
		buyNowButton.click();
	}

}
