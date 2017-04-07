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

public class ShopByHomePage extends BasePage {

	public ShopByHomePage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appsMenu;
	
	@FindBy(xpath=IConstants.SHOP_BY_CATEGORY)
	public IOSElement shopByCategory;
	
	@FindBy(xpath=IConstants.HOME_LINK)
	public IOSElement homeLink;
	
	@FindBy(xpath=IConstants.KITCHEN_TEXT)
	public IOSElement kitchenText;
	
	@FindBy(xpath=IConstants.BEDDINGBATH_TEXT)
	public IOSElement beddingbathText;
	
	@FindBy(xpath=IConstants.GARDENING1_LINK)
	public IOSElement gardening1Link;
	
	@FindBy(xpath=IConstants.GARDENING1_TEXT)
	public IOSElement gardening1Text;
	
	@FindBy(xpath=IConstants.HOMEIMPRO_TEXT)
	public IOSElement homeimproText;
	
	@FindBy(xpath=IConstants.SHOPBYBRAND_TEXT)
	public IOSElement shopbybrandText;
	
	@FindBy(xpath=IConstants.CATEGORIES_TEXT)
	public IOSElement categoriesText;
	
	@FindBy(xpath=IConstants.BACK_BUTTON)
	public IOSElement backButton;
	
	public void findHomeCategory() {
		test.log(LogStatus.INFO, "Click on menu link");
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appsMenu.click();
		test.log(LogStatus.INFO, "Click on shop by cagetory");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHOP_BY_CATEGORY)));
		shopByCategory.click();
		test.log(LogStatus.INFO, "Click on shop by home & garden category");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HOME_LINK)));
		homeLink.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HOME_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HOME_TEXT),"Could not find home & garden text");
		wait = new WebDriverWait(iDriver, 10);
		for(int i=0; i<2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) iDriver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);
		}
		test.log(LogStatus.INFO, "Click on kitchen & dining link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.KITCHEN_TEXT)));
		kitchenText.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.KITCHEN_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.KITCHEN_TEXT),"Could not find kitchen & diningtext elment");
		kitchenText.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.COOKEWARE_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.COOKEWARE_TEXT),"Could not find cookeware elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DINNERWARE_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.DINNERWARE_TEXT),"Could not find dinnerware elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BAKEWARE_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BAKEWARE_TEXT),"Could not find bakeware elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.UTENSILS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.UTENSILS_TEXT),"Could not find kitchen utensils & gadgets elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		test.log(LogStatus.INFO, "Click on bedding & bath link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BEDDINGBATH_TEXT)));
		beddingbathText.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BEDDINGBATH_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BEDDINGBATH_TEXT),"Could not find cookeware elment");
		beddingbathText.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BEDDING1_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BEDDING1_TEXT),"Could not find bedding text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BATH_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BATH_TEXT),"Could not find bath text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		test.log(LogStatus.INFO, "Click on gardening link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GARDENING1_LINK)));
		gardening1Link.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GARDENING1_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.GARDENING1_TEXT),"Could not find gardening text elment");
		gardening1Text.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GARDDECOR_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.GARDDECOR_TEXT),"Could not find garden decor text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GARDACCESSORIES_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.GARDACCESSORIES_TEXT),"Could not find gardening accessories text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.GARDTOOLS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.GARDTOOLS_TEXT),"Could not find gardening tools text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.WATEREQUI_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.WATEREQUI_TEXT),"Could not find watering equipment text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		test.log(LogStatus.INFO, "Click on home improvement link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HOMEIMPRO_TEXT)));
		homeimproText.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HOMEIMPRO_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HOMEIMPRO_TEXT),"Could not find home improvement text elment");
		homeimproText.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SAFETY_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.SAFETY_TEXT),"Could not find safety & security text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HARDWARE_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HARDWARE_TEXT),"Could not find hardware text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HOMESUPP_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HOMESUPP_TEXT),"Could not find home supplies text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.POWER_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.POWER_TEXT),"Could not find power & hands tools text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHOPBYBRAND_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.SHOPBYBRAND_TEXT),"Could not find shop by brands text elment");
		for(int i=0; i<2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) iDriver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);
		}
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CATEGORIES_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.CATEGORIES_TEXT),"Could not find categories text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ARTWORK_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.ARTWORK_TEXT),"Could not find artworktext elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BATH_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BATH_TEXT),"Could not find bath text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BEDDING1_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BEDDING1_TEXT),"Could not find bedding text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DECOR_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.DECOR_TEXT),"Could not find decortext elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FURNITURE_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.FURNITURE_TEXT),"Could not find furniture text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HOMEKITCHEN_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HOMEKITCHEN_TEXT),"Could not find home & kitchen text elment");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PATIO_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.PATIO_TEXT),"Could not find patio,lawn & garden text elment");
		}	
}
