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

public class ShopByElectronicPage extends BasePage {

	public ShopByElectronicPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appsMenu;
	
	@FindBy(xpath=IConstants.SHOP_BY_CATEGORY)
	public IOSElement shopByCategory;
	
	@FindBy(xpath=IConstants.ELECTRONICS_LINK)
	public IOSElement electronicsLink;
	
	@FindBy(xpath=IConstants.BACK_BUTTON)
	public IOSElement backButton;
	
	@FindBy(xpath=IConstants.MOBILES_LINK)
	public IOSElement mobilesLink;
	
	@FindBy(xpath=IConstants.CAMCORDERS_CELL)
	public IOSElement camcordersCell;
	
	@FindBy(xpath=IConstants.TABLETS_LINK)
	public IOSElement tabletsLink;
	
	@FindBy(xpath=IConstants.DESKTOP_LINK)
	public IOSElement desktopLink;
	
	@FindBy(xpath=IConstants.HOME_APPLIANCE)
	public IOSElement homeAppliance;
	
	@FindBy(xpath=IConstants.AUDIO_LINK)
	public IOSElement AudioLink;
	
	@FindBy(xpath=IConstants.SPEAKERS_TEXT)
	public IOSElement speakersText;
	
	@FindBy(xpath=IConstants.LAPTOP_LINK)
	public IOSElement laptopLink;
	
	@FindBy(xpath=IConstants.CAMERAS_LINK)
	public IOSElement CamerasLink;
	
	@FindBy(xpath=IConstants.INSTANT_PHOTO_TEXT)
	public IOSElement instantPhotoText;
	
	public void findElectronicCategory() {
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appsMenu.click();
		test.log(LogStatus.INFO, "Click on shop by cagetory");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHOP_BY_CATEGORY)));
		shopByCategory.click();
		test.log(LogStatus.INFO, "Click on electronics link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ELECTRONICS_LINK)));
		electronicsLink.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MOBILES_LINK)));
		test.log(LogStatus.INFO, "Click on Mobiles link");
		mobilesLink.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MOBILES_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.MOBILES_TEXT),"Could not find mobiles text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		test.log(LogStatus.INFO, "Click on tablests & e-readers link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TABLETS_LINK)));
		tabletsLink.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TABLETS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.TABLETS_TEXT),"Could not find tablets text component");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.EREADERS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.EREADERS_TEXT),"Could not find e-reader text component");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		test.log(LogStatus.INFO, "Click on desktop link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DESKTOP_LINK)));
		desktopLink.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DESKTOP_LINK)));
		Assert.assertTrue(isElementPresent(IConstants.DESKTOP_LINK),"Could not find desktops text");
		Assert.assertTrue(isElementPresent(IConstants.DESKTOP_LINK),"Could not find desktops text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.MONITORS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.MONITORS_TEXT),"Could not find monitors text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HOME_APPLIANCE)));
		Assert.assertTrue(isElementPresent(IConstants.HOME_APPLIANCE),"Could not find home appliance text element");
		for(int i=0; i<2; i++) {
		homeAppliance.swipe(SwipeElementDirection.UP,5);
		}
		test.log(LogStatus.INFO, "Click on audio visual link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.AUDIO_LINK)));
		AudioLink.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.AUDIO_LINK)));
		Assert.assertTrue(isElementPresent(IConstants.AUDIO_LINK),"Could not find audio visual text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.TELEVISION_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.TELEVISION_TEXT),"Could not find television text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DISC_PLAYERS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.DISC_PLAYERS_TEXT),"Could not find disc players text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.HOME_CINEMA_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.HOME_CINEMA_TEXT),"Could not find home cinema text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SPEAKERS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.SPEAKERS_TEXT),"Could not find speakers text");
		for(int i=0; i<2; i++) {
			speakersText.swipe(SwipeElementDirection.UP,5);
			}
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.AUDIO_EQUIP_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.AUDIO_EQUIP_TEXT),"Could not find audeio equipment text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.STREAMING_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.STREAMING_TEXT),"Could not find streaming & satellite text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		test.log(LogStatus.INFO, "Click on laptop & gaming link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.LAPTOP_LINK)));
		laptopLink.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.LAPTOP_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.LAPTOP_TEXT),"Could not find streaming & satellite text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.LAPTOP_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.LAPTOPS_TEXT),"Could not find laptops text");
		wait = new WebDriverWait(iDriver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CONSOLES_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.CONSOLES_TEXT),"Could not find consoles & video games text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		test.log(LogStatus.INFO, "Click on cameras link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CAMERAS_LINK)));
		CamerasLink.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CAMERAS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.CAMERAS_TEXT),"Could not find cameras text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DIGITAL_CELL)));
		Assert.assertTrue(isElementPresent(IConstants.DIGITAL_CELL),"Could not find digital cameras text");
		/*wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.PROF_CAMERAS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.PROF_CAMERAS_TEXT),"Could not find professional cameras text");
		wait = new WebDriverWait(iDriver, 10);*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.CAMCORDERS_CELL)));
		Assert.assertTrue(isElementPresent(IConstants.CAMCORDERS_CELL),"Could not find camcorders text");
		/*wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.INSTANT_PHOTO_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.INSTANT_PHOTO_TEXT),"Could not find instant photography text");*/
		camcordersCell.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.VIDEO_SURV_CELL)));
		Assert.assertTrue(isElementPresent(IConstants.VIDEO_SURV_CELL),"Could not find video & surveillance element");
		/*wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BINOCULARS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.BINOCULARS_TEXT),"Could not find binoculars text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ACCESSORIES_LINK)));
		Assert.assertTrue(isElementPresent(IConstants.ACCESSORIES_LINK),"Could not find accessories text element");*/
	}
}
