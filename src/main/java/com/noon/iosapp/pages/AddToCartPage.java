package com.noon.iosapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.noon.iosapp.pages.base.BasePage;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class AddToCartPage extends BasePage {

	public AddToCartPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}

	WebDriverWait wait;
	
	@FindBy(xpath=IConstants.SEARCH_BOX)
	public IOSElement searchBox;
	
	@FindBy(xpath=IConstants.ITEMS1)
	public IOSElement items1;
	
	@FindBy(xpath=IConstants.ITEMS2)
	public IOSElement items2;
	
	@FindBy(xpath=IConstants.REMOVE_ITEM2)
	public IOSElement removeItem2;
	
	@FindBy(xpath=IConstants.PRODUCT_QUANTITY)
	public IOSElement productQuantity;
	
	@FindBy(xpath=IConstants.INCREASE_ITEM)
	public IOSElement increaseItem;
	
	@FindBy(xpath=IConstants.DECREASE_ITEM)
	public IOSElement decreaseItem;
	
	@FindBy(xpath=IConstants.SEARCH_TYPE)
	public IOSElement searchType;
	
	@FindBy(xpath=IConstants.SEARCH_TEXT_SELECT)
	public IOSElement searchTextSelect;
	
	@FindBy(xpath=IConstants.SEARCH_TEXT_TITLE)
	public IOSElement searchTextTitle;
	
	@FindBy(xpath=IConstants.SEARCH_ITEM_CART)
	public IOSElement searchItemCart;
	
	@FindBy(xpath=IConstants.CART_ITEM)
	public IOSElement cartItem;
	
	@FindBy(xpath=IConstants.ITEM_REMOVE)
	public IOSElement itemRemove;
	
	@FindBy(xpath=IConstants.CROSS_BUTTON)
	public IOSElement crossButton;
	
	@FindBy(xpath=IConstants.BACK_BUTTON)
	public IOSElement backButton;

	@FindBy(xpath=IConstants.ADDTOCART)
	public IOSElement addToCart;

	@FindBy(xpath=IConstants.SEARCH_ITEM_LABEL)
	public IOSElement searchItemLabel;
	
	public int InitialItemNumber = 0;
    public int FinalItemNumber = 0;

	public void addToCart() throws InterruptedException {
		try {
			test.log(LogStatus.INFO, "Add Item in cart");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_ITEM_LABEL)));
			searchItemLabel.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADDTOCART)));
			addToCart.click();
			//WebDriverWait wait = new WebDriverWait(iDriver, 10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_ITEM_CART)));
			//searchItemCart.click();
			test.log(LogStatus.INFO, "Click on cart button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CART_ITEM)));
			cartItem.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ONE_ITEM)));
			Assert.assertTrue(isElementPresent(IConstants.ONE_ITEM), "Could not find any item inside cart");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ONE_ITEM_TOTAL)));
			Assert.assertTrue(isElementPresent(IConstants.ONE_ITEM_TOTAL), "Could not find item total");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SECURE_CHECKOUT)));
			Assert.assertTrue(isElementPresent(IConstants.SECURE_CHECKOUT), "Could not find secure checkout button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ITEM_DETAILS)));
			Assert.assertTrue(isElementPresent(IConstants.ITEM_DETAILS), "Could not find secure checkout button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CONTINUE_SHOPPING)));
			Assert.assertTrue(isElementPresent(IConstants.CONTINUE_SHOPPING), "Could not find continue shopping button");
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void addMultipleItems(String searchItem) {
		try {
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_BOX)));
			TouchAction action2 = new TouchAction(iDriver);
			action2.tap(searchBox).perform();
			searchBox.sendKeys(searchItem);
			wait = new WebDriverWait(iDriver, 40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_TEXT_SELECT)));
			searchTextSelect.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ITEMS1)));
			items1.click();
			//wait = new WebDriverWait(iDriver, 10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ITEMS2)));
			//items2.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CART_ITEM)));
			cartItem.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.VERIFY_ITEM1)));
			Assert.assertTrue(isElementPresent(IConstants.VERIFY_ITEM1), "Could not find first item");
			//wait = new WebDriverWait(iDriver, 10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.VERIFY_ITEM2)));
			//Assert.assertTrue(isElementPresent(IConstants.VERIFY_ITEM2), "Could not find second item");
			//wait = new WebDriverWait(iDriver, 20);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REMOVE_ITEM2)));
			//removeItem2.click();
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void increaseItem() {
		try {
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PRODUCT_QUANTITY)));
			InitialItemNumber = Integer.parseInt(productQuantity.getText());
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.INCREASE_ITEM)));
			increaseItem.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PRODUCT_QUANTITY)));
			FinalItemNumber = Integer.parseInt(productQuantity.getText());
			Assert.assertEquals(FinalItemNumber, InitialItemNumber + 1, "Item did not increase");
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void decreaseItem() {
		try {
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PRODUCT_QUANTITY)));
			InitialItemNumber = Integer.parseInt(productQuantity.getText());
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DECREASE_ITEM)));
			decreaseItem.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PRODUCT_QUANTITY)));
			FinalItemNumber = Integer.parseInt(productQuantity.getText());
			Assert.assertEquals(FinalItemNumber, InitialItemNumber - 1, "Item did not decrease");
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void removeItem() {
		try {
			wait = new WebDriverWait(iDriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ITEM_REMOVE)));
			itemRemove.click();
			wait = new WebDriverWait(iDriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CROSS_BUTTON)));
			crossButton.click();
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
}
