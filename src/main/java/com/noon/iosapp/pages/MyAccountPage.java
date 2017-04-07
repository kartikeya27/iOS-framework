package com.noon.iosapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noon.iosapp.pages.base.BasePage;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class MyAccountPage extends BasePage {

	public MyAccountPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	WebDriverWait wait;

	@FindBy(xpath=IConstants.MY_ACCOUNT)
	public IOSElement myAccount;
	
	@FindBy(xpath=IConstants.PROFILE)
	public IOSElement profile;
	
	@FindBy(xpath=IConstants.MY_WALLET)
	public IOSElement myWallet;
	
	@FindBy(xpath=IConstants.ADDRESS_BOOK)
	public IOSElement addressBook;
	
	
	public void gotoMyAccount() 
	{
	
		test.log(LogStatus.INFO,"Click on my account link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_ACCOUNT)));
		myAccount.click();
	}
	
	public void gotoMyWallet() 
	{	
		test.log(LogStatus.INFO, "Click on my wallet link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MY_WALLET)));
		myWallet.click();
	}
	
	public void gotoAddressBook() 
	{
		//myWallet.swipe(SwipeElementDirection.LEFT, 5);
		test.log(LogStatus.INFO, "Swip address book to left");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ADDRESS_BOOK)));
		addressBook.click();
	}	
		
	public void gotoMyProfile() 
	{
		//for(int i=0; i<3; i++) {
		//myWallet.swipe(SwipeElementDirection.LEFT, 5);
		//}
		test.log(LogStatus.INFO, "Click on My Profile");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROFILE)));
		profile.click();
	}

}
