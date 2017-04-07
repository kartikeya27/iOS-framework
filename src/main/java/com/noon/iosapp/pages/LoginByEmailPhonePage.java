package com.noon.iosapp.pages;

import java.util.HashMap;
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
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class LoginByEmailPhonePage extends BasePage {

	public LoginByEmailPhonePage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	WebDriverWait wait;
	
	@FindBy(xpath=IConstants.NOON_HOME)
	public IOSElement noonHome;
	
	@FindBy(xpath=IConstants.SIGNIN_BUTTON)
	public IOSElement signinButton;
	
	@FindBy(xpath=IConstants.LOGIN_TAB)
	public IOSElement loginTab;
	
	@FindBy(xpath=IConstants.LOGIN_WITH_EMAIL)
	public IOSElement loginWithEmail;
	
	@FindBy(xpath=IConstants.SIGNIN_WITH)
	public IOSElement signinWith;
	
	@FindBy(xpath=IConstants.GOOGLE_BUTTON)
	public IOSElement googleButton;
	
	@FindBy(xpath=IConstants.FACEBOOK_BUTTON)
	public IOSElement facebookButton;
	
	@FindBy(xpath=IConstants.TWITTER_BUTTON)
	public IOSElement twitterButton;
	
	@FindBy(xpath=IConstants.LOGIN_DETAILS)
	public IOSElement loginDetails;
	
	@FindBy(xpath=IConstants.FORGOT_PASSWORD)
	public IOSElement forgotPassword;
	
	@FindBy(xpath=IConstants.RESET_PASSWORD)
	public IOSElement resetPassword;
	
	@FindBy(xpath=IConstants.RESET_PASSWORD_DETAILS)
	public IOSElement resetPasswordDetails;
	
	@FindBy(xpath=IConstants.RESET_PASSWORD_INPUT_BOX)
	public IOSElement resetPasswordInputBox;
	
	@FindBy(xpath=IConstants.RESET_PASSWORD_BUTTON)
	public IOSElement resetPasswordButton;
	
	@FindBy(xpath=IConstants.RESET_PASSWORD_CANCEL_BUTTON)
	public IOSElement resetPasswordCancelButton;
	
	@FindBy(xpath=IConstants.USER_EMAIL)
	public IOSElement userEmail;
	
	@FindBy(xpath=IConstants.USER_PHONE)
	public IOSElement userPhone;
	
	@FindBy(xpath=IConstants.USER_PASSWORD)
	public IOSElement userPassword;
	
	@FindBy(xpath=IConstants.USER_LOGIN_BUTTON)
	public IOSElement userLoginButton;
	
	@FindBy(xpath=IConstants.SELECT_COUNTRYCODE)
	public IOSElement selectCountryCode;
	
	@FindBy(xpath=IConstants.UAE_COUNTRYCODE)
	public IOSElement uaeCountryCode;
	
	@FindBy(xpath=IConstants.USER_PHONE_PASSWORD)
	public IOSElement userPhonePassword;
	
	@FindBy(xpath=IConstants.MY_WALLET)
	public IOSElement myWallet;
	
	@FindBy(xpath=IConstants.ADDRESS_BOOK)
	public IOSElement addressBook;
	
	@FindBy(xpath=IConstants.PROFILE)
	public IOSElement profile;
	
	@FindBy(xpath=IConstants.PROFILE_SIGNOUT)
	public IOSElement profileSignout;
	
	@FindBy(xpath=IConstants.POPUP_CONTINUE)
	public IOSElement popupContinue;
	
	@FindBy(xpath=IConstants.POPUP_LOGOUT_OK)
	public IOSElement popupLogoutOk;
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appMenu;
	
	@FindBy(xpath=IConstants.HELLO_TEXT)
	public IOSElement helloText;
	
	@FindBy(xpath=IConstants.MY_ACCOUNT)
	public IOSElement myAccount;
	
	public void loginLink() {
		
		test.log(LogStatus.INFO, "Click on home page signin button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SIGNIN_BUTTON)));
		signinButton.click();
		
		test.log(LogStatus.INFO, "Click on signin tab");
		if(!iDriver.findElement(By.xpath(IConstants.SIGNIN_WITH)).isDisplayed()) {
			loginTab.click();
		} 
	}
	
	public void verifyButton() 
	{
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SIGNIN_WITH)));
		Assert.assertTrue(isElementPresent(IConstants.SIGNIN_WITH), "Could not find login with text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GOOGLE_BUTTON)));
		Assert.assertTrue(isElementPresent(IConstants.GOOGLE_BUTTON), "Could not find google button");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FACEBOOK_BUTTON)));
		Assert.assertTrue(isElementPresent(IConstants.FACEBOOK_BUTTON), "Could not facebook button");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TWITTER_BUTTON)));
		Assert.assertTrue(isElementPresent(IConstants.TWITTER_BUTTON), "Could not twitter button");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.LOGIN_DETAILS)));
		Assert.assertTrue(isElementPresent(IConstants.LOGIN_DETAILS), "Could not find login details text");
	}	
	
	public void loginByEmail(String userName, String password) {
		
		test.log(LogStatus.INFO, "Click on Login with email");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.USER_PHONE)));
		userPhone.click();
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.LOGIN_WITH_EMAIL)));
		loginWithEmail.click();
		
		
		test.log(LogStatus.INFO, "Type username name");
		wait = new WebDriverWait(iDriver, 10);
		
		iDriver.getKeyboard().sendKeys(userName);
		//iDriver.hideKeyboard();
		
		userPassword.click();
		//TouchAction action1 = new TouchAction(iDriver);
        //action1.press(userPassword).waitAction(300).moveTo(0, 0).release();
		test.log(LogStatus.INFO, "Type user password");
		iDriver.getKeyboard().sendKeys(password);
		
		test.log(LogStatus.INFO, "Click on singin button for login");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.USER_LOGIN_BUTTON)));
		userLoginButton.click();
	}
	
	public void verifyUser() {
		test.log(LogStatus.INFO, "Click on menu button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appMenu.click();
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HELLO_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HELLO_TEXT),"Could not find Hello Noon ");
	}
	
	/*public void verifyHome() {
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.NOON_HOME)));
		noonHome.click();
	}*/
	
	public void loginByPhone(String userPhoneNumber, String password) {
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SELECT_COUNTRYCODE)));
		selectCountryCode.click();
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.USA_COUNTRYCODE)));
		
		for(int i =0; i<15; i++) {
		JavascriptExecutor js = (JavascriptExecutor) iDriver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "up");
		js.executeScript("mobile: scroll", scrollObject);
		}
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.UAE_COUNTRYCODE)));
		uaeCountryCode.click();
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.USER_PHONE)));
		userPhone.click();
		userPhone.sendKeys(userPhoneNumber);
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.USER_PHONE_PASSWORD)));
		userPhonePassword.click();
		userPhonePassword.sendKeys(password);
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.USER_LOGIN_BUTTON)));
		userLoginButton.click();
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appMenu.click();
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.USER_PHONE_VERIFY)));
		Assert.assertTrue(isElementPresent(IConstants.USER_PHONE_VERIFY),"Could not find Hello Kartik");
	}
}
