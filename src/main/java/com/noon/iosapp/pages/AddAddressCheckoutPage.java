package com.noon.iosapp.pages;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noon.iosapp.pages.base.BasePage;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AddAddressCheckoutPage extends BasePage {

	public AddAddressCheckoutPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	@FindBy(xpath=IConstants.SEARCH_BOX)
	public IOSElement searchBox;
	
	@FindBy(xpath=IConstants.SEARCH_TYPE)
	public IOSElement searchType;
	
	@FindBy(xpath=IConstants.SEARCH_ITEM_CART)
	public IOSElement searchItemCart;
	
	@FindBy(xpath=IConstants.CART_ITEM)
	public IOSElement cartItem;
	
	@FindBy(xpath=IConstants.SECURE_CHECKOUT)
	public IOSElement secureCheckout;
	
	@FindBy(xpath=IConstants.LOGIN_TAB)
	public IOSElement loginTab;
	
	@FindBy(xpath=IConstants.USER_EMAIL)
	public IOSElement userEmail;
	
	@FindBy(xpath=IConstants.USER_PASSWORD)
	public IOSElement userPassword;
	
	@FindBy(xpath=IConstants.USER_LOGIN_BUTTON)
	public IOSElement userLoginButton;
	
	@FindBy(xpath=IConstants.NO_ADDRESS_ADDED)
	public IOSElement noAddressAdded;
	
	@FindBy(xpath=IConstants.ADD_NEW_ADDRESS_TEXT)
	public IOSElement addNewAddressText;
	
	@FindBy(xpath=IConstants.ADD_NEW_ADDRESS_BUTTON)
	public IOSElement addNewAddressButton;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS)
	public IOSElement deliverAddress;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_EDIT)
	public IOSElement deliverAddressEdit;
	
	@FindBy(xpath=IConstants.ADDRESS_DONE_BUTTON)
	public IOSElement addressDoneButton;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_CELL)
	public IOSElement deliverAddressCell;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_BUILDING)
	public IOSElement deliveryAddressBuilding;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_BUILDING_EDIT)
	public IOSElement deliveryAddressBuildingEdit;
	
	@FindBy(xpath=IConstants.DELIVER_ADDRESS_FLAT_EDIT)
	public IOSElement deliveryAddressFlatEdit;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_FLOOR_EDIT)
	public IOSElement deliveryAddressFloorEdit;
	
	@FindBy(xpath=IConstants.HIDE_KEYBOARD1)
	public IOSElement hideKeyboad1;

	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_PHONE_EDIT)
	public IOSElement deliveryAddressPhoneEdit;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_DETAILS)
	public IOSElement deliveryAddressDetails;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_SAVE)
	public IOSElement deliverAddressSave;
	
	@FindBy(xpath=IConstants.BACK_BUTTON)
	public IOSElement backButton;
	
	@FindBy(xpath=IConstants.BACK1_BUTTON)
	public IOSElement backButton1;
	
	@FindBy(xpath=IConstants.DEFAULT_ADDRESS_BACKBUTTON)
	public IOSElement DefaultAddressBackButton;
	
	@FindBy(xpath=IConstants.ITEM_REMOVE)
	public IOSElement itemRemove;
	
	@FindBy(xpath=IConstants.CROSS_BUTTON)
	public IOSElement crossButton;
	
	public void addNewAddress(String deliveryAddress, String name, String phoneNumber) throws InterruptedException {
		try
		{
			test.log(LogStatus.INFO, "Add new address for product checkout");
			test.log(LogStatus.INFO, "Add Item in cart");
			WebDriverWait wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SEARCH_ITEM_CART)));
			searchItemCart.click();
			test.log(LogStatus.INFO, "Click on cart button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.IN_CART)));
			cartItem.click();
			test.log(LogStatus.INFO, "Click on secure checkout");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SECURE_CHECKOUT)));
			secureCheckout.click();
			test.log(LogStatus.INFO, "Click new address");
			wait = new WebDriverWait(iDriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADD_NEW_ADDRESS_TEXT)));
			addNewAddressText.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADD_NEW_ADDRESS_BUTTON)));
			addNewAddressButton.click();
			test.log(LogStatus.INFO, "Adding deliver address");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS)));
			TouchAction action2 = new TouchAction(iDriver);
			action2.tap(deliverAddress).perform();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_EDIT)));
			deliverAddressEdit.sendKeys(deliveryAddress);
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_CELL)));
			deliverAddressCell.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADDRESS_DONE_BUTTON)));
			addressDoneButton.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_BUILDING)));
			deliveryAddressBuilding.swipe(SwipeElementDirection.UP, 10);
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HIDE_KEYBOARD1)));
			hideKeyboad1.click();
			JavascriptExecutor js = (JavascriptExecutor) iDriver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_PHONE_EDIT)));
			deliveryAddressPhoneEdit.sendKeys(phoneNumber);
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_SAVE)));
			deliverAddressSave.click();
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
			backButton.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_CONFORM)));
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
}
