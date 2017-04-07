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

public class SideBarLinksPage extends BasePage {

	public SideBarLinksPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	WebDriverWait wait;
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appsMenu;
	
	
	public void sideBarLinks() 
	{
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.NOON_AFTERNOON)));
		Assert.assertTrue(isElementPresent(IConstants.NOON_AFTERNOON), "Could not load noon afternoon image");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HELLO_GUEST)));
		Assert.assertTrue(isElementPresent(IConstants.HELLO_GUEST), "Could not load hello guest text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_OR_SIGNIN)));
		Assert.assertTrue(isElementPresent(IConstants.REGISTER_OR_SIGNIN), "Could not load register or login link");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.NOON_HOME)));
		Assert.assertTrue(isElementPresent(IConstants.NOON_HOME), "Could not load home link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ARABIC_SCREEN)));
		Assert.assertTrue(isElementPresent(IConstants.ARABIC_SCREEN), "Could not load home arabic login button");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHOP_BY_CATEGORY)));
		Assert.assertTrue(isElementPresent(IConstants.SHOP_BY_CATEGORY), "Could not load shop by category link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TODAYS_DEALS)));
		Assert.assertTrue(isElementPresent(IConstants.TODAYS_DEALS), "Could not load today's deals link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_ORDERS)));
		Assert.assertTrue(isElementPresent(IConstants.MY_ORDERS), "Could not load my orders link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_ACCOUNT)));
		Assert.assertTrue(isElementPresent(IConstants.MY_ACCOUNT), "Could not load my account link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.RETURNS_EXCHANGE)));
		Assert.assertTrue(isElementPresent(IConstants.RETURNS_EXCHANGE), "Could not load return & exchange link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.INVITE_FRIENDS)));
		Assert.assertTrue(isElementPresent(IConstants.INVITE_FRIENDS), "Could not load invite your friends link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CUSTOMER_SERVICE)));
		Assert.assertTrue(isElementPresent(IConstants.CUSTOMER_SERVICE), "Could not load customer service link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CALL_US)));
		Assert.assertTrue(isElementPresent(IConstants.CALL_US), "Could not load call us link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CHAT_WITH_US)));
		Assert.assertTrue(isElementPresent(IConstants.CHAT_WITH_US), "Could not load chat with us link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TERMS_POLICIES)));
		Assert.assertTrue(isElementPresent(IConstants.TERMS_POLICIES), "Could not load terms & policies link text");
		
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.COPY_RIGHT)));
		Assert.assertTrue(isElementPresent(IConstants.COPY_RIGHT), "Could not load copyrights text");
	}
}
