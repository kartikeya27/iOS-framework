package com.noon.iosapp.pages;

import java.util.HashMap;
import java.util.List;

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

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.HideKeyboardStrategy;

public class CheckoutPage extends BasePage {

	public CheckoutPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	WebDriverWait wait;
	
	@FindBy(xpath=IConstants.ADDRESS_BOOK)
	public IOSElement addressBook;
	
	@FindBy(xpath=IConstants.CREDIT_CART_BUTTON)
	public IOSElement CreditCartButton;
	
	@FindBy(xpath=IConstants.CART_ITEM)
	public IOSElement cartItem;
	
	@FindBy(xpath=IConstants.SECURE_CHECKOUT)
	public IOSElement secureCheckout;
	
	@FindBy(xpath=IConstants.DELIVERY_ADDRESS_CONFORM)
	public IOSElement deliveryAddressConform;
	
	@FindBy(xpath=IConstants.ADD_NEWCARD)
	public IOSElement addNewCard;
	
	@FindBy(xpath=IConstants.CARD_NAME)
	public IOSElement cardName;
	
	@FindBy(xpath=IConstants.CARD_NUMBER)
	public IOSElement cardNumber;
	
	@FindBy(xpath=IConstants.CREDIT_DONE_BUTTON)
	public IOSElement creditDoneButton;
	
	@FindBy(xpath=IConstants.DROP_DOWN_MONTH_05)
	public IOSElement dropDownMonth05;
	
	//@FindBy(xpath=IConstants.CARD_MONTH_SELECT)
	//public IOSElement cardMonthSelect;
	
	//@FindBy(xpath=IConstants.CARD_YEAR_SELECT)
	//public IOSElement cardYearSelect;
	
	@FindBy(xpath=IConstants.CARD_EXPIRYMONTH)
	public IOSElement cardExpiryMonth;
	
	@FindBy(xpath=IConstants.CARD_EXPIRYYEAR)
	public IOSElement cardExpiryYear;
	
	@FindBy(xpath=IConstants.DROP_DOWN_YEAR_2020)
	public IOSElement dropDownYear2020;
	
	@FindBy(xpath=IConstants.CARD_CVVNUMBER)
	public IOSElement cardCvvNumber;
	
	@FindBy(xpath=IConstants.SAVE_CARD)
	public IOSElement saveCard;
	
	@FindBy(xpath=IConstants.DELIVERY_OPTION)
	public IOSElement deliveryOption;
	
	@FindBy(xpath=IConstants.NEXT_DAY)
	public IOSElement nextDay;
	
	@FindBy(xpath=IConstants.PAY_ON_DELIVERY)
	public IOSElement payOnDelivery;
	
	@FindBy(xpath=IConstants.SELECT_COD_OPTION)
	public IOSElement selectCodOption;
	
	@FindBy(xpath=IConstants.BACK_BUTTON)
	public IOSElement backButton;
	
	@FindBy(xpath=IConstants.CROSS_BUTTON)
	public IOSElement crossButton;
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appsMenu;
	
	@FindBy(xpath=IConstants.MY_ACCOUNT)
	public IOSElement myAccount;
	
	@FindBy(xpath=IConstants.MY_WALLET)
	public IOSElement myWallet;
	
	@FindBy(xpath=IConstants.WALLET_ADDNEW_CARD)
	public IOSElement walletAddnewCard;
	
	@FindBy(xpath=IConstants.WALLET_SAVED_CARDS)
	public IOSElement walletSaveCard;
	
	@FindBy(xpath=IConstants.DELETE_CREDIT_CARD)
	public IOSElement deleteCreditCard;
	
	@FindBy(xpath=IConstants.DELETE_YES)
	public IOSElement deleteYes;

	@FindBy(xpath=IConstants.ITEM_REMOVE)
	public IOSElement itemRemove;

	@FindBy(xpath=IConstants.THREE_DAYS)
	public IOSElement threeDays;
	
	public void checkoutProduct()
	{
		test.log(LogStatus.INFO, "Add Item in cart");
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CREDIT_CART_BUTTON)));
		CreditCartButton.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SECURE_CHECKOUT)));
		secureCheckout.click();
		test.log(LogStatus.INFO, "Click on default address");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_ADDRESS_CONFORM)));
		deliveryAddressConform.click();
	}
	
	public void checkoutAddressBook() {
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appsMenu.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_ACCOUNT)));
		myAccount.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_WALLET)));
		myWallet.click();
		myWallet.swipe(SwipeElementDirection.LEFT, 5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADDRESS_BOOK)));
		addressBook.click();
	}
	
	public void addCreditCard() {
		test.log(LogStatus.INFO, "Add credit card from checkout");
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADD_NEWCARD)));
		addNewCard.click();
	}	
	
	public void addCreditCardWallet(String cName,String cNumber,String cExpMonth, String cExpYear) {
		test.log(LogStatus.INFO, "Click on saved cards");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.WALLET_SAVED_CARDS)));
		walletSaveCard.click();
		test.log(LogStatus.INFO, "Add new card from wallet");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.WALLET_ADDNEW_CARD)));
		walletAddnewCard.click();
		test.log(LogStatus.INFO, "Credit card holder name");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CARD_NAME)));
		cardName.sendKeys(cName);
		test.log(LogStatus.INFO, "Credit card number");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CARD_NUMBER)));
		cardNumber.sendKeys(cNumber);
		test.log(LogStatus.INFO, "Credit card expiry month");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CARD_EXPIRYMONTH)));
		cardExpiryMonth.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DROP_DOWN_MONTH_05)));
		dropDownMonth05.click();
		test.log(LogStatus.INFO, "Credit card expiry year");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CARD_EXPIRYYEAR)));
		cardExpiryYear.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DROP_DOWN_YEAR_2020)));
		dropDownYear2020.click();
		
		test.log(LogStatus.INFO, "Save credit card info");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SAVE_CARD)));
		saveCard.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CREDIT_CARD_CONFIRM)));
		Assert.assertTrue(isElementPresent(IConstants.CREDIT_CARD_CONFIRM), "Could not credit card info");
		test.log(LogStatus.INFO, "Click on delete button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_CREDIT_CARD)));
		deleteCreditCard.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_CARD_CONFO)));
		Assert.assertTrue(isElementPresent(IConstants.DELETE_CARD_CONFO), "Could not load credit card info");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.VISA_INFO)));
		Assert.assertTrue(isElementPresent(IConstants.VISA_INFO), "Could not load visa credit card info");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_YES_NO)));
		Assert.assertTrue(isElementPresent(IConstants.DELETE_YES_NO), "Could not load delete yes and no button");
		deleteYes.click();
	}
	
	public void addCreditCardCheckout(String cName,String cNumber,String cExpMonth, String cExpYear) {
		test.log(LogStatus.INFO, "Adding new card");
		test.log(LogStatus.INFO, "Credit card holder name");
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CARD_NAME)));
		cardName.sendKeys(cName);
		test.log(LogStatus.INFO, "Credit card number");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CARD_NUMBER)));
		cardNumber.sendKeys(cNumber);
		test.log(LogStatus.INFO, "Credit card expiry month");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CARD_EXPIRYMONTH)));
		cardExpiryMonth.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DROP_DOWN_MONTH_05)));
		dropDownMonth05.click();
		test.log(LogStatus.INFO, "Credit card expiry year");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CARD_EXPIRYYEAR)));
		cardExpiryYear.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DROP_DOWN_YEAR_2020)));
		dropDownYear2020.click();
		test.log(LogStatus.INFO, "Save credit card info");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SAVE_CARD)));
		saveCard.click();
	}

	public void deleteCardCod() {
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		test.log(LogStatus.INFO, "Click on exit of checkout");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_YES)));
		deleteYes.click();
		test.log(LogStatus.INFO, "Click on cross button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CROSS_BUTTON)));
		crossButton.click();
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
		test.log(LogStatus.INFO, "Click on Menu");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appsMenu.click();
		test.log(LogStatus.INFO, "Click on my account");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_ACCOUNT)));
		myAccount.click();

	}

	public void deleteCard() {
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		test.log(LogStatus.INFO, "Click on exit of checkout");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_YES)));
		deleteYes.click();
		test.log(LogStatus.INFO, "Click on cross button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CROSS_BUTTON)));
		crossButton.click();
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
		test.log(LogStatus.INFO, "Click on Menu");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appsMenu.click();
		test.log(LogStatus.INFO, "Click on my account");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_ACCOUNT)));
		myAccount.click();
		test.log(LogStatus.INFO, "Click on my wallet");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_WALLET)));
		myWallet.click();
		test.log(LogStatus.INFO, "Click on saved cards ");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.WALLET_SAVED_CARDS)));
		walletSaveCard.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CREDIT_CARD_CONFIRM)));
		Assert.assertTrue(isElementPresent(IConstants.CREDIT_CARD_CONFIRM), "Could not credit card info");
		test.log(LogStatus.INFO, "Click on delete button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_CREDIT_CARD)));
		deleteCreditCard.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_CARD_CONFO)));
		Assert.assertTrue(isElementPresent(IConstants.DELETE_CARD_CONFO), "Could not load credit card info");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.VISA_INFO)));
		Assert.assertTrue(isElementPresent(IConstants.VISA_INFO), "Could not load visa credit card info");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_YES_NO)));
		Assert.assertTrue(isElementPresent(IConstants.DELETE_YES_NO), "Could not load delete yes and no button");
		deleteYes.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.NO_SAVE_CARD)));
		Assert.assertTrue(isElementPresent(IConstants.NO_SAVE_CARD), "Could not find not save card info text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.NO_SAVE_IMAGE)));
		Assert.assertTrue(isElementPresent(IConstants.NO_SAVE_IMAGE), "Could not find not save card image");
	}
	
	public void checkout() {
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REVIEW_ORDER)));
		Assert.assertTrue(isElementPresent(IConstants.REVIEW_ORDER), "Could not find order review element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDERS_SUBTOTAL)));
		Assert.assertTrue(isElementPresent(IConstants.ORDERS_SUBTOTAL), "Could not find orders subtotl element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDER_PAYMENT_INFO)));
		Assert.assertTrue(isElementPresent(IConstants.ORDER_PAYMENT_INFO), "Could not find orders credit card info element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDER_SHIP_INFO)));
		Assert.assertTrue(isElementPresent(IConstants.ORDER_SHIP_INFO), "Could not find orders ship to info element");
		JavascriptExecutor js = (JavascriptExecutor) iDriver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHIPMENT_ONE_IMAGE)));
		Assert.assertTrue(isElementPresent(IConstants.SHIPMENT_ONE_IMAGE), "Could not find shipment one element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_OPTION)));
		deliveryOption.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SAME_DAY)));
		Assert.assertTrue(isElementPresent(IConstants.SAME_DAY), "Could not find same day delivery element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.NEXT_DAY)));
		Assert.assertTrue(isElementPresent(IConstants.NEXT_DAY), "Could not find next day delivery element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.THREE_DAYS)));
		Assert.assertTrue(isElementPresent(IConstants.THREE_DAYS), "Could not find three day delivery element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.THREE_DAYS)));
		threeDays.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDER_SUMMARY)));
		Assert.assertTrue(isElementPresent(IConstants.ORDER_SUMMARY), "Could not find summary order");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PLACE_ORDER)));
		Assert.assertTrue(isElementPresent(IConstants.PLACE_ORDER), "Could not find place oder button");
		test.log(LogStatus.INFO, "Click on back button");
	}	
		
	public void payOnDelivery() {
		test.log(LogStatus.INFO, "Pay on delivery");
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PAY_ON_DELIVERY)));
		payOnDelivery.click();
		//wait = new WebDriverWait(iDriver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELIVERY_CELL)));
		//Assert.assertTrue(isElementPresent(IConstants.DELIVERY_CELL), "Delivery, payment and review element could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REVIEW_CELL)));
		Assert.assertTrue(isElementPresent(IConstants.REVIEW_CELL), "Review element could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PAY_ON_DELIVERY_CELL)));
		Assert.assertTrue(isElementPresent(IConstants.PAY_ON_DELIVERY_CELL), "Pay on delivery element could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PAYMENT_CELL)));
		Assert.assertTrue(isElementPresent(IConstants.PAYMENT_CELL), "Payment element could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHIPTO_CELL)));
		Assert.assertTrue(isElementPresent(IConstants.SHIPTO_CELL), "Ship to element could not load");
		JavascriptExecutor js = (JavascriptExecutor) iDriver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHIPMENTONE_CELL)));
		Assert.assertTrue(isElementPresent(IConstants.SHIPMENTONE_CELL), "Shipment one element could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SELECT_DELIVERY_OPTION_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.SELECT_DELIVERY_OPTION_TEXT), "Select delivery option text could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SELECT_COD_OPTION)));
		selectCodOption.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.COD_SAME_DAY)));
		Assert.assertTrue(isElementPresent(IConstants.COD_SAME_DAY), "Same day delivered element could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.COD_NEXT_DAY)));
		Assert.assertTrue(isElementPresent(IConstants.COD_NEXT_DAY), "Next day delivered element could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.COD_STANDARD)));
		Assert.assertTrue(isElementPresent(IConstants.COD_STANDARD), "Standard delivered element could not load");
		selectCodOption.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHIPPING_TOTAL_CELL)));
		Assert.assertTrue(isElementPresent(IConstants.SHIPPING_TOTAL_CELL), "Shipping total cell element could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ALL_DONE)));
		Assert.assertTrue(isElementPresent(IConstants.ALL_DONE), "All done text could not load");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.COD_PLACE_ORDER)));
		Assert.assertTrue(isElementPresent(IConstants.COD_PLACE_ORDER), "Place order button could not load");
	}
		
		
}
