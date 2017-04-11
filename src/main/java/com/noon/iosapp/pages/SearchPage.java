package com.noon.iosapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.noon.iosapp.pages.base.BasePage;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.util.HashMap;

public class SearchPage extends BasePage {

	public SearchPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}

	WebDriverWait wait;

	@FindBy(xpath=IConstants.SEARCH_BOX)
	public IOSElement searchBox;
	
	@FindBy(xpath=IConstants.SEARCH_TYPE)
	public IOSElement searchType;

	@FindBy(xpath=IConstants.SEARCH_TEXT_SELECT)
	public IOSElement searchTextSelect;
	
	@FindBy(xpath=IConstants.SEARCH_ITEM_LABEL)
	public IOSElement searchItemLabel;
	
	@FindBy(xpath=IConstants.PRODUCT_CELL)
	public IOSElement productCell;
	
	@FindBy(xpath=IConstants.DELI_LOCATION)
	public IOSElement deliLocation;

	@FindBy(xpath=IConstants.ADDTOCART)
	public IOSElement addToCart;

	@FindBy(xpath=IConstants.PROD_DESCRIPTION)
	public IOSElement prodDescription;
	
	public void searchProduct(String searchItem) {
		try {
			test.log(LogStatus.INFO, "Search for an Item");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_BOX)));
			TouchAction action2 = new TouchAction(iDriver);
			action2.tap(searchBox).perform();
			searchBox.sendKeys(searchItem);
			wait = new WebDriverWait(iDriver, 40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_TEXT_SELECT)));
			searchTextSelect.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_ITEM_LABEL)));
			Assert.assertTrue(isElementPresent(IConstants.SEARCH_ITEM_LABEL), "Could not find items");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_ITEM_PRICE)));
			Assert.assertTrue(isElementPresent(IConstants.SEARCH_ITEM_PRICE), "Could not find item price");
			//wait = new WebDriverWait(iDriver, 10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_ITEM_CART)));
			//Assert.assertTrue(isElementPresent(IConstants.SEARCH_ITEM_CART),"Could not find cart image");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void productDetails() {
		try {
			test.log(LogStatus.INFO, "Click on product details");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_ITEM_LABEL)));
			searchItemLabel.click();
			wait = new WebDriverWait(iDriver, 40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PRODUCT_IMAGE)));
			Assert.assertTrue(isElementPresent(IConstants.PRODUCT_IMAGE), "Could not load product image element");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PRODUCT_CELL)));
			Assert.assertTrue(isElementPresent(IConstants.PRODUCT_CELL), "Could not product details element");
			//wait = new WebDriverWait(iDriver, 10);
			//wait = new WebDriverWait(iDriver, 10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PRODUCT_COLOR)));
			//Assert.assertTrue(isElementPresent(IConstants.PRODUCT_COLOR),"Could not load product color element");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BUYNOW_BUTTON)));
			Assert.assertTrue(isElementPresent(IConstants.BUYNOW_BUTTON), "Could not load buy now element");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADDTOCART)));
			Assert.assertTrue(isElementPresent(IConstants.ADDTOCART), "Could not load add to cart element");

			JavascriptExecutor js = (JavascriptExecutor) iDriver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);

		/*JavascriptExecutor js = (JavascriptExecutor) iDriver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("prodDescription", ((IOSElement) prodDescription).getText());
		js.executeScript("mobile: scroll", scrollObject);*/

			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROD_DESCRIPTION)));
			Assert.assertTrue(isElementPresent(IConstants.PROD_DESCRIPTION), "Could not load product description element");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROD_SPECIFICATION)));
			Assert.assertTrue(isElementPresent(IConstants.PROD_SPECIFICATION), "Could not load product specifications element");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROD_SOLDBY)));
			Assert.assertTrue(isElementPresent(IConstants.PROD_SOLDBY), "Could not load sold by element");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROD_RELATED)));
			Assert.assertTrue(isElementPresent(IConstants.PROD_RELATED), "Could not load product related videos element");
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
}
