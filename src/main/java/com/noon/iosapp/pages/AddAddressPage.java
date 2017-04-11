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

public class AddAddressPage extends BasePage {

	public AddAddressPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	WebDriverWait wait;
	
	@FindBy(xpath=IConstants.SECURE_CHECKOUT)
	public IOSElement secureCheckout;

	@FindBy(xpath=IConstants.WE_DELIVER_TEXT)
	public IOSElement weDeliverText;
	
	@FindBy(xpath=IConstants.ADD_CHANGE_ADDRESS)
	public IOSElement addChangeAddress;
	
	@FindBy(xpath=IConstants.ADDRESSBOOK_ADDADDRESS)
	public IOSElement addressbookAddAddress;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS)
	public IOSElement deliverAddress;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_EDIT)
	public IOSElement deliverAddressEdit;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_CELL)
	public IOSElement deliverAddressCell;
	
	@FindBy(xpath=IConstants.ADDRESS_DONE_BUTTON)
	public IOSElement addressDoneButton;
	
	@FindBy(xpath=IConstants.ALMOST_DONE_TEXT1)
	public IOSElement almostDoneText1;
	
	@FindBy(xpath=IConstants.DELIVER_ADDRESS_FLAT_EDIT)
	public IOSElement deliveryAddressFlatEdit;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_FLOOR_EDIT)
	public IOSElement deliveryAddressFloorEdit;
	
	@FindBy(xpath=IConstants.HIDE_KEYBOARD1)
	public IOSElement hideKeyboad1;

	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_NAME_CLICK)
	public IOSElement deliveryAddressNameClick;

	@FindBy(xpath=IConstants.CLEAR_TEXT)
	public IOSElement clearText;

	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_NAME_EDIT)
	public IOSElement deliveryAddressNameEdit;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_PHONE_EDIT)
	public IOSElement deliveryAddressPhoneEdit;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_SAVE)
	public IOSElement deliverAddressSave;
	
	@FindBy(xpath=IConstants.BACK_BUTTON)
	public IOSElement backButton;

	@FindBy(xpath=IConstants.CROSS_BUTTON)
	public IOSElement crossButton;
	
	@FindBy(xpath=IConstants.LOGIN_TAB)
	public IOSElement loginTab;

	@FindBy(xpath=IConstants.CART_ITEM)
	public IOSElement cartItem;

	@FindBy(xpath=IConstants.ITEM_REMOVE)
	public IOSElement itemRemove;
	
	public void addNewAddressCheckout() {
		try {
			test.log(LogStatus.INFO, "Add new address from checkout");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SECURE_CHECKOUT)));
			secureCheckout.click();
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void signinTab() {
		try
		{
			test.log(LogStatus.INFO, "Click on signin tab");
			if(!iDriver.findElement(By.xpath(IConstants.SIGNIN_WITH)).isDisplayed()) {
				loginTab.click();
			}
		}catch (Exception e) {
				test.log(LogStatus.FAIL, "Could not find element");

		} 
	}
	
	public void addChnageAddress() {
		try {
			test.log(LogStatus.INFO, "Click on add or change address");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADD_CHANGE_ADDRESS)));
			addChangeAddress.click();
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}

	public void weDeliverText() {
		try {
			test.log(LogStatus.INFO, "Click on add new address");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADD_NEW_ADDRESS_TEXT)));
			weDeliverText.click();
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void addNewAddressCheckoutConformation() {
		try {
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
			backButton.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_CONFORM)));
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
			backButton.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CROSS_BUTTON)));
			crossButton.click();
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}

	public void gotoCart() {
		try {
			test.log(LogStatus.INFO, "Click on cart button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CART_ITEM)));
			cartItem.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ITEM_REMOVE)));
			itemRemove.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CROSS_BUTTON)));
			crossButton.click();
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void addNewAddress(String deliveryAddress) {
		try {
			test.log(LogStatus.INFO, "Add new address from address book");
			test.log(LogStatus.INFO, "Click on add new address");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADDRESSBOOK_ADDADDRESS)));
			addressbookAddAddress.click();

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
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}

	public void deliveryAddressCredit(String phoneNumber) {
		try {
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ALMOST_DONE_TEXT1)));

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
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void deliveryAddressCOD(String name, String phoneNumber) {
		try {
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ALMOST_DONE_TEXT1)));

			JavascriptExecutor js = (JavascriptExecutor) iDriver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_NAME_CLICK)));
			deliveryAddressNameClick.click();
			//TouchAction action = new TouchAction(iDriver);
			//action.tap(deliveryAddressNameClick).perform();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CLEAR_TEXT)));
			clearText.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_NAME_EDIT)));
			deliveryAddressNameEdit.sendKeys(name);
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_PHONE_EDIT)));
			deliveryAddressPhoneEdit.sendKeys(phoneNumber);
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_SAVE)));
			deliverAddressSave.click();
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
	
	public void addressConformation() {
		try {
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROFILE_ADDRESS_CONFORM)));
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Could not find element");
		}
	}
}
