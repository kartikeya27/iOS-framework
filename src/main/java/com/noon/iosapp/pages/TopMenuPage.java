package com.noon.iosapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class TopMenuPage {
	public IOSDriver<IOSElement> iDriver;
	public ExtentTest test;
	
	public TopMenuPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		this.iDriver = iDriver;
		this.test = test;
	}
	
WebDriverWait wait;
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appMenu;
	
	public void gotoMenu() {
		test.log(LogStatus.INFO, "Clik on menu button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appMenu.click();
	}

	public void gotoCart() {
		
	}
	
	public void search() {
		
	}
}
