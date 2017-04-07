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

public class ShopByBookPage extends BasePage {

	public ShopByBookPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appsMenu;
	
	@FindBy(xpath=IConstants.SHOP_BY_CATEGORY)
	public IOSElement shopByCategory;
	
	@FindBy(xpath=IConstants.BOOK_LINK)
	public IOSElement bookLink;
	
	@FindBy(xpath=IConstants.BACK_BUTTON)
	public IOSElement backButton;
	
	@FindBy(xpath=IConstants.BOOK_TEXT)
	public IOSElement bookText;
	
	@FindBy(xpath=IConstants.BOOK1_TEXT)
	public IOSElement book1Text;
	
	@FindBy(xpath=IConstants.SUBCATEGORY_TEXT)
	public IOSElement subcategoryText;
	
	@FindBy(xpath=IConstants.CELL5_SCROLL)
	public IOSElement cell5Scroll;
	
	@FindBy(xpath=IConstants.CELL6_SCROLL)
	public IOSElement cell6Scroll;
	
	@FindBy(xpath=IConstants.CELL6_SCROLL)
	public IOSElement cell7Scroll;
	
	public void findBookCategory() {
		test.log(LogStatus.INFO, "Click on menu link");
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appsMenu.click();
		test.log(LogStatus.INFO, "Click on shop by cagetory");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHOP_BY_CATEGORY)));
		shopByCategory.click();
		test.log(LogStatus.INFO, "Click on shop by book,music & movies cagetory");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BOOK_LINK)));
		bookLink.click();
		Assert.assertTrue(isElementPresent(IConstants.BOOK_LINK),"Could not find books, music & movies text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BOOK_TEXT)));
		bookText.swipe(SwipeElementDirection.UP,5);
		test.log(LogStatus.INFO, "Click on book cagetory");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BOOK1_TEXT)));
		book1Text.click();
		 wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BOOK1_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BOOK1_TEXT),"Could not find books text");
		book1Text.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SUBCATEGORY_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.SUBCATEGORY_TEXT),"Could not find subcategory text");
		subcategoryText.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MIND_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.MIND_TEXT),"Could not find mind,body & spirit text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BIOGRAPHY_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BIOGRAPHY_TEXT),"Could not find biography text element");
		cell5Scroll.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FOOD_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.FOOD_TEXT),"Could not find food & drink text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REFERENCE_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.REFERENCE_TEXT),"Could not find reference text element");
		cell6Scroll.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FICTION_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.FICTION_TEXT),"Could not find fiction text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.YOUNG_TEXT)));
		cell7Scroll.swipe(SwipeElementDirection.UP,5);
		Assert.assertTrue(isElementPresent(IConstants.YOUNG_TEXT),"Could not find young & adult text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BUSINESS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BUSINESS_TEXT),"Could not find business,law & finance text element");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HEALTH_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HEALTH_TEXT),"Could not find health,family & lifestyle text element");
	}	

}
