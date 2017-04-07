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

import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ShopByHealthPage extends BasePage {

	public ShopByHealthPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appsMenu;
	
	@FindBy(xpath=IConstants.SHOP_BY_CATEGORY)
	public IOSElement shopByCategory;
	
	@FindBy(xpath=IConstants.HEALTH_LINK)
	public IOSElement healthLink;
	
	@FindBy(xpath=IConstants.CELL8_SCROLL)
	public IOSElement cell8Scroll;
	
	@FindBy(xpath=IConstants.CELL10_SCROLL)
	public IOSElement cell10Scroll;
	
	@FindBy(xpath=IConstants.CELL11_SCROLL)
	public IOSElement cell11Scroll;
	
	@FindBy(xpath=IConstants.CELL24_SCROLL)
	public IOSElement cell24Scroll;
	
	@FindBy(xpath=IConstants.CELL29_SCROLL)
	public IOSElement cell29Scroll;
	
	@FindBy(xpath=IConstants.SKINCARE1_TEXT)
	public IOSElement skincare1Text;
	
	@FindBy(xpath=IConstants.BACK_BUTTON)
	public IOSElement backButton;
	
	public void findHealthCategory() {
		test.log(LogStatus.INFO, "Click on menu link");
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appsMenu.click();
		test.log(LogStatus.INFO, "Click on shop by cagetory");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHOP_BY_CATEGORY)));
		shopByCategory.click();
		test.log(LogStatus.INFO, "Click on shop by health & beauty category");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HEALTH_LINK)));
		healthLink.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HEALTH_LINK)));
		Assert.assertTrue(isElementPresent(IConstants.HEALTH_LINK),"Could not find health & beauty text");
		
			JavascriptExecutor js = (JavascriptExecutor) iDriver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);
		cell8Scroll.swipe(SwipeElementDirection.UP,5);
		//wait = new WebDriverWait(iDriver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.COSMETICS_TEXT)));
		//Assert.assertTrue(isElementPresent(IConstants.COSMETICS_TEXT),"Could not find cosmetics text element");
		//wait = new WebDriverWait(iDriver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FRAGRANCE1_TEXT)));
		//Assert.assertTrue(isElementPresent(IConstants.FRAGRANCE1_TEXT),"Could not find fragrance text element");
		//cell10Scroll.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HAIRCARE1_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HAIRCARE1_TEXT),"Could not find hair care text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MENGROOMING_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.MENGROOMING_TEXT),"Could not find men's grooming text element");
		cell11Scroll.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PERSONALCARE1_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.PERSONALCARE1_TEXT),"Could not find personal care text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SKINCARE1_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.SKINCARE1_TEXT),"Could not find skin care text element");
		for(int i=0;i<3; i++) {
			JavascriptExecutor js1 = (JavascriptExecutor) iDriver;
			HashMap<String, String> scrollObject1 = new HashMap<String, String>();
			scrollObject1.put("direction", "down");
			js1.executeScript("mobile: scroll", scrollObject1);
		}
		//cell24Scroll.swipe(SwipeElementDirection.UP,5);
		//wait = new WebDriverWait(iDriver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BABYCHILD_TEXT)));
		//Assert.assertTrue(isElementPresent(IConstants.BABYCHILD_TEXT),"Could not find baby & child care text element");
		//wait = new WebDriverWait(iDriver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BATHBODY_TEXT)));
		//Assert.assertTrue(isElementPresent(IConstants.BATHBODY_TEXT),"Could not find bath & body text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HEALTHCARE_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HEALTHCARE_TEXT),"Could not find health care text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MAKEUP_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.MAKEUP_TEXT),"Could not find makeup text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MEDICAL_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.MEDICAL_TEXT),"Could not find medical supplies & equipment text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.NUTRITION_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.NUTRITION_TEXT),"Could not find nutrition & wellness text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SPORTSNUTRITION_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.SPORTSNUTRITION_TEXT),"Could not find sports nutrition text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TOOLS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.TOOLS_TEXT),"Could not find tools & accessories text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.VITAMINS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.VITAMINS_TEXT),"Could not find vitamins & dietary supplements text element");
	}
}
