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
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class LogoutPage extends BasePage {

	public LogoutPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}

	WebDriverWait wait;

	@FindBy(xpath = IConstants.HELLO_TEXT)
	public IOSElement helloText;

	@FindBy(xpath = IConstants.PROFILE_SIGNOUT)
	public IOSElement profileSignout;

	@FindBy(xpath = IConstants.POPUP_CONTINUE)
	public IOSElement popupContinue;

	@FindBy(xpath = IConstants.POPUP_LOGOUT_OK)
	public IOSElement popupLogoutOk;


	public void logoutApp() {
		try {
			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROFILE_USERNAME)));
			Assert.assertTrue(isElementPresent(IConstants.PROFILE_USERNAME), "Could not find profile user name");

			wait = new WebDriverWait(iDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROFILE_USERELOGIN)));
			Assert.assertTrue(isElementPresent(IConstants.PROFILE_USERELOGIN), "Could not find profile user login email");

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
		} catch (Exception e) {
			test.log(LogStatus.ERROR, "Could not find element");
		}
	}
}