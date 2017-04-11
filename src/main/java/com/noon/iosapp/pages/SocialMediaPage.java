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

import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SocialMediaPage extends BasePage {

	public SocialMediaPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	@FindBy(xpath=IConstants.GOOGLE_LOGIN)
	public IOSElement googleLogin;
	
	@FindBy(xpath=IConstants.GOOGLE_EMAIL)
	public IOSElement googleEmail;
	
	@FindBy(xpath=IConstants.GOOGLE_NEXT_BUTTON)
	public IOSElement googleNextButton;
	
	@FindBy(xpath=IConstants.GOOGLE_PASSWORD)
	public IOSElement googlePassword;
	
	@FindBy(xpath=IConstants.GOOGLE_BUTTON)
	public IOSElement googleButton;
	
	@FindBy(xpath=IConstants.FACEBOOK_LOGIN)
	public IOSElement facebookLogin;
	
	@FindBy(xpath=IConstants.ENGLISH_US)
	public IOSElement englishUS;
	
	@FindBy(xpath=IConstants.FACEBOOK_EMAIL)
	public IOSElement facebookEmail;
	
	@FindBy(xpath=IConstants.FACEBOOK_PASSWORD)
	public IOSElement facebookPassword;
	
	@FindBy(xpath=IConstants.FACEBOOK_LOGIN_BUTTON)
	public IOSElement facebookLoginButton;
	
	@FindBy(xpath=IConstants.FACEBOOK_OK)
	public IOSElement facebookOk;
	
	@FindBy(xpath=IConstants.CONTINUE_AS_USER)
	public IOSElement continueAsUser;
	
	@FindBy(xpath=IConstants.TWITTER_LOGIN)
	public IOSElement twitterLogin;
	
	@FindBy(xpath=IConstants.TWITTER_EMAIL)
	public IOSElement twitterEmail;
	
	@FindBy(xpath=IConstants.TWITTER_PASSWORD)
	public IOSElement twitterPassword;
	
	@FindBy(xpath=IConstants.TWITTER_SIGNIN)
	public IOSElement twitterSignin;
	
	@FindBy(xpath=IConstants.TWITTER_AUTHORIZE)
	public IOSElement twitterAuthorize;
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appMenu;
	
	@FindBy(xpath=IConstants.MY_ACCOUNT)
	public IOSElement myAccount;
	
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
	
	@FindBy(xpath=IConstants.OPEN_SAFARI)
	public IOSElement openSafari;
	
	@FindBy(xpath=IConstants.SHOW_BOOKMARKS)
	public IOSElement showBookmark;
	
	@FindBy(xpath=IConstants.CLEAR_HISTORY)
	public IOSElement clearHistory;
	
	@FindBy(xpath=IConstants.DELETE_ALLTIME_HISTORY)
	public IOSElement deleteAlltimeHistory;
	
	@FindBy(xpath=IConstants.HISTORY_DONE_BUTTON)
	public IOSElement historyDoneButton;
	
	@FindBy(xpath=IConstants.RETURN_NOON_PROD)
	public IOSElement  returnNoonProd;
	
	
	public void googleLogin(String googleUserEmail, String googleUserPassword) {
		try {
			test.log(LogStatus.INFO, "Clik on google plus");
			WebDriverWait wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GOOGLE_LOGIN)));
			googleLogin.click();
			test.log(LogStatus.INFO, "Enter google user email");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GOOGLE_EMAIL)));
			googleEmail.click();
			iDriver.getKeyboard().sendKeys(googleUserEmail);
			test.log(LogStatus.INFO, "Click on next button");
			googleNextButton.click();
			test.log(LogStatus.INFO, "Enter google passowrd");
			googlePassword.sendKeys(googleUserPassword);
			test.log(LogStatus.INFO, "Click on next button");
			googleNextButton.click();
			test.log(LogStatus.INFO, "Clik on menu button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
			appMenu.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.VERIFY_GOOGLEUSER)));
			Assert.assertTrue(isElementPresent(IConstants.VERIFY_GOOGLEUSER), "Could not find google user name");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_ACCOUNT)));
			myAccount.click();
			test.log(LogStatus.INFO, "Click on my wallet");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_WALLET)));
			myWallet.click();
			test.log(LogStatus.INFO, "Click on address book");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADDRESS_BOOK)));
			addressBook.click();
			test.log(LogStatus.INFO, "Click on My Profile");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROFILE)));
			profile.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GOOGLEUSERNAME_LABEL)));
			Assert.assertTrue(isElementPresent(IConstants.GOOGLEUSERNAME_LABEL), "Could not find google user name");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GOOGLEUSEREMAIL_LABEL)));
			Assert.assertTrue(isElementPresent(IConstants.GOOGLEUSEREMAIL_LABEL), "Could not find google user login email");
			test.log(LogStatus.INFO, "Click on log out button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROFILE_SIGNOUT)));
			profileSignout.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.POPUP_CONTINUE)));
			popupContinue.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.POPUP_LOGOUT_OK)));
			popupLogoutOk.click();
			test.log(LogStatus.INFO, "Clik on google plus");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GOOGLE_LOGIN)));
			googleLogin.click();
			test.log(LogStatus.INFO, "Clik on open safari");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.OPEN_SAFARI)));
			iDriver.findElementByAccessibilityId("Open in Safari").click();
			//openSafari.click();
			test.log(LogStatus.INFO, "Clik on show bookmark");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHOW_BOOKMARKS)));
			iDriver.findElementByAccessibilityId("Show Bookmarks").click();
			//showBookmark.click();
			test.log(LogStatus.INFO, "Clik on clear history");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CLEAR_HISTORY)));
			iDriver.findElementByAccessibilityId("Clear").click();
			//clearHistory.click();
			test.log(LogStatus.INFO, "Clik on delete all time history");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_ALLTIME_HISTORY)));
			iDriver.findElementByAccessibilityId("All time").click();
			//deleteAlltimeHistory.click();
			test.log(LogStatus.INFO, "Clik on done button");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HISTORY_DONE_BUTTON)));
			iDriver.findElementByAccessibilityId("Done").click();
			//historyDoneButton.click();
			//test.log(LogStatus.INFO, "Return to noon prod apps ");
			//wait = new WebDriverWait(iDriver, 60);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.RETURN_NOON_PROD)));
			//iDriver.findElementByAccessibilityId("Return to noon PRD 21").click();
			//returnNoonProd.click();
			//wait = new WebDriverWait(iDriver, 60);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HISTORY_DONE_BUTTON)));
			//iDriver.findElementByAccessibilityId("Done").click();
			//historyDoneButton.click();
		}catch (Exception e) {
			test.log(LogStatus.ERROR, "Could not find element");
		}
	}
	
	public void facebookLogin(String facebookUserEmail, String facebookUserPassword) {
		try {
			test.log(LogStatus.INFO, "Clik on facebook button");
			WebDriverWait wait = new WebDriverWait(iDriver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FACEBOOK_LOGIN)));
			facebookLogin.click();
			test.log(LogStatus.INFO, "Click on english us link");
			wait = new WebDriverWait(iDriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ENGLISH_US)));
			englishUS.click();
			test.log(LogStatus.INFO, "Enter facebook user email");
			wait = new WebDriverWait(iDriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FACEBOOK_EMAIL)));
			facebookEmail.click();
			iDriver.getKeyboard().sendKeys(facebookUserEmail);
			test.log(LogStatus.INFO, "Enter facebook user passowrd");
			facebookPassword.sendKeys(facebookUserPassword);
			test.log(LogStatus.INFO, "Click on login button");
			facebookLoginButton.click();
			test.log(LogStatus.INFO, "Click on OK button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FACEBOOK_OK)));
			facebookOk.click();
			test.log(LogStatus.INFO, "Clik on menu button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
			appMenu.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.VERIFY_FACEBOOKUSER)));
			Assert.assertTrue(isElementPresent(IConstants.VERIFY_FACEBOOKUSER), "Could not find facebook user name");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_ACCOUNT)));
			myAccount.click();
			test.log(LogStatus.INFO, "click on my wallet");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_WALLET)));
			myWallet.click();
			test.log(LogStatus.INFO, "click on address book");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADDRESS_BOOK)));
			addressBook.click();
			test.log(LogStatus.INFO, "Click on My Profile");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROFILE)));
			profile.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FACEBOOKUSERNAME_LABEL)));
			Assert.assertTrue(isElementPresent(IConstants.FACEBOOKUSERNAME_LABEL), "Could not find google user name");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FACEBOOKUSEREMAIL_LABEL)));
			Assert.assertTrue(isElementPresent(IConstants.FACEBOOKUSEREMAIL_LABEL), "Could not find google user login email");
			test.log(LogStatus.INFO, "Click on log out button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROFILE_SIGNOUT)));
			profileSignout.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.POPUP_CONTINUE)));
			popupContinue.click();
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.POPUP_LOGOUT_OK)));
			popupLogoutOk.click();
			test.log(LogStatus.INFO, "Clik on facebook button");
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FACEBOOK_LOGIN)));
			facebookLogin.click();
			test.log(LogStatus.INFO, "Clik on open safari");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.OPEN_SAFARI)));
			iDriver.findElementByAccessibilityId("Open in Safari").click();
			//openSafari.click();
			test.log(LogStatus.INFO, "Clik on show bookmark");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHOW_BOOKMARKS)));
			iDriver.findElementByAccessibilityId("Show Bookmarks").click();
			//showBookmark.click();
			test.log(LogStatus.INFO, "Clik on clear history");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CLEAR_HISTORY)));
			iDriver.findElementByAccessibilityId("Clear").click();
			//clearHistory.click();
			test.log(LogStatus.INFO, "Clik on delete all time history");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DELETE_ALLTIME_HISTORY)));
			iDriver.findElementByAccessibilityId("All time").click();
			//deleteAlltimeHistory.click();
			test.log(LogStatus.INFO, "Clik on done button");
			wait = new WebDriverWait(iDriver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HISTORY_DONE_BUTTON)));
			iDriver.findElementByAccessibilityId("Done").click();
			//historyDoneButton.click();
			//test.log(LogStatus.INFO, "Return to noon prod apps ");
			//wait = new WebDriverWait(iDriver, 60);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.RETURN_NOON_PROD)));
			//iDriver.findElementByAccessibilityId("Return to noon PRD 21").click();
			//returnNoonProd.click();
			//wait = new WebDriverWait(iDriver, 60);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HISTORY_DONE_BUTTON)));
			//iDriver.findElementByAccessibilityId("Done").click();
		}catch (Exception e) {
			test.log(LogStatus.ERROR, "Could not find element");
		}
	}
	
	public void twitterLogin(String twitterUserEmail, String twitterUserPassword) {
		try {
			test.log(LogStatus.INFO, "Clik on twitter button");
			WebDriverWait wait = new WebDriverWait(iDriver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TWITTER_LOGIN)));
			twitterLogin.click();
			test.log(LogStatus.INFO, "Enter twitter user email");
			wait = new WebDriverWait(iDriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TWITTER_EMAIL)));
			twitterEmail.click();
			iDriver.getKeyboard().sendKeys(twitterUserEmail);
			test.log(LogStatus.INFO, "Enter twitter user passowrd");
			twitterPassword.sendKeys(twitterUserPassword);
			test.log(LogStatus.INFO, "Click on twitter login button");
			twitterSignin.click();
			wait = new WebDriverWait(iDriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TWITTER_AUTHORIZE)));
			test.log(LogStatus.INFO, "Click on authorize app button");
			twitterAuthorize.click();
		}catch (Exception e) {
			test.log(LogStatus.ERROR, "Could not find element");
		}
	}

}
