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

public class ShopByFashionPage extends BasePage {

	public ShopByFashionPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	@FindBy(xpath=IConstants.APPS_MENU)
	public IOSElement appsMenu;
	
	@FindBy(xpath=IConstants.SHOP_BY_CATEGORY)
	public IOSElement shopByCategory;
	
	@FindBy(xpath=IConstants.FASHION_LINK)
	public IOSElement fashionLink;
	
	@FindBy(xpath=IConstants.FASHION_CELL2)
	public IOSElement fashionCell2;
	
	@FindBy(xpath=IConstants.FASHION_WOMEN_TEXT)
	public IOSElement fashionWomenText;
	
	@FindBy(xpath=IConstants.FASHION_WOMEN_FOOTWEAR)
	public IOSElement fashionWomenFootwear;
	
	@FindBy(xpath=IConstants.FASHION_MEN_FOOTWEAR)
	public IOSElement fashionMenFootwear;
	
	@FindBy(xpath=IConstants.FASHION_CELL3)
	public IOSElement fashionCell3;
	
	@FindBy(xpath=IConstants.FASHION_MEN_TEXT)
	public IOSElement fashionMenText;
	
	@FindBy(xpath=IConstants.FASHION_MEN_WATCHES)
	public IOSElement fashionMenWatches;
	
	@FindBy(xpath=IConstants.FASHION_CELL4)
	public IOSElement fashionCell4;
	
	@FindBy(xpath=IConstants.FASHION_GIRLS_TEXT)
	public IOSElement fashionGirlsText;
	
	@FindBy(xpath=IConstants.FASHION_GIRLS_SHOES)
	public IOSElement fashionGirlsShoes;
	
	@FindBy(xpath=IConstants.FASHION_CELL5)
	public IOSElement fashionCell5;
	
	@FindBy(xpath=IConstants.FASHION_BOYS_TEXT)
	public IOSElement fashionBoysText;
	
	@FindBy(xpath=IConstants.FASHION_BOYS_FOOTWEAR)
	public IOSElement fashionBoysFootwear;
	
	@FindBy(xpath=IConstants.FASHION_CELL6)
	public IOSElement fashionCell6;
	
	@FindBy(xpath=IConstants.FASHION_BABY_TEXT)
	public IOSElement fashionBabytext;
	
	@FindBy(xpath=IConstants.FASHION_BABY_CLOTHING1)
	public IOSElement fashionBabyClothing1;
	
	@FindBy(xpath=IConstants.BACK_BUTTON)
	public IOSElement backButton;
	
	public void findFashionCategory() throws InterruptedException {
		test.log(LogStatus.INFO, "Click on apps menu");
		WebDriverWait wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.APPS_MENU)));
		appsMenu.click();
		test.log(LogStatus.INFO, "Click on shop by cagetory");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SHOP_BY_CATEGORY)));
		shopByCategory.click();
		test.log(LogStatus.INFO, "Click on fasion link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_LINK)));
		fashionLink.click();
		Assert.assertTrue(isElementPresent(IConstants.FASHION_CELL1),"Could not find fashion text");
		test.log(LogStatus.INFO, "Click on women link");
		fashionCell2.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_WOMEN_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_WOMEN_TEXT),"Could not find women text");
		fashionWomenText.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_WOMEN_CLOTHING)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_WOMEN_CLOTHING),"Could not find clothing text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_WOMEN_FOOTWEAR)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_WOMEN_FOOTWEAR),"Could not find footwear text");
		fashionWomenFootwear.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_WOMEN_BAGS)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_WOMEN_BAGS),"Could not find bags & luggage text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_WOMEN_JEWELLERY)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_WOMEN_JEWELLERY),"Could not find Jewellery & watches text");
		//fashionWomenJewellery.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_WOMEN_FOOTWEAR)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_WOMEN_EYEWEAR),"Could not find eyewear text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_WOMEN_SPORTS)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_WOMEN_SPORTS),"Could not find sports text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		for(int i=0; i<2; i++) {
		fashionCell2.swipe(SwipeElementDirection.UP,5);
		}
		test.log(LogStatus.INFO, "Click on men link");
		fashionCell3.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_MEN_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_MEN_TEXT),"Could not find men text");
		fashionMenText.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_MEN_CLOTHING)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_MEN_CLOTHING),"Could not find men clothing text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_MEN_FOOTWEAR)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_MEN_FOOTWEAR),"Could not find men footwear text");
		fashionMenFootwear.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_MEN_BAGS)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_MEN_BAGS),"Could not find men bags & luggage text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_MEN_WATCHES)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_MEN_WATCHES),"Could not find men watches text");
		fashionMenWatches.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_MEN_ACCESSORIES)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_MEN_ACCESSORIES),"Could not find accessories text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_MEN_SPORTS)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_MEN_SPORTS),"Could not find sports text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		fashionCell3.swipe(SwipeElementDirection.UP,5);
		test.log(LogStatus.INFO, "Click on girls link");
		fashionCell4.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_GIRLS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_GIRLS_TEXT),"Could not find girls text");
		fashionGirlsText.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_GIRLS_CLOTHING)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_GIRLS_CLOTHING),"Could not find girls clothing text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_GIRLS_SHOES)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_GIRLS_SHOES),"Could not find girls shoes text");
		fashionGirlsShoes.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_GIRLS_ACCESSORIES)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_GIRLS_ACCESSORIES),"Could not find girls accessories text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_GIRLS_WATCHES)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_GIRLS_WATCHES),"Could not find girls watches text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_GIRLS_UNDERWEAR)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_GIRLS_UNDERWEAR),"Could not find girls underwear text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_GIRLS_SPORTS)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_GIRLS_SPORTS),"Could not find girls sports text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		
		fashionCell4.swipe(SwipeElementDirection.UP,5);
		test.log(LogStatus.INFO, "Click on boys link");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_CELL5)));
		fashionCell5.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BOYS_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BOYS_TEXT),"Could not find boys text");
		fashionBoysText.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BOYS_CLOTHING)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BOYS_CLOTHING),"Could not find boys clothing text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BOYS_FOOTWEAR)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BOYS_FOOTWEAR),"Could not find boys footwear text");
		fashionBoysFootwear.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BOYS_ACCESSORIES)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BOYS_ACCESSORIES),"Could not find boys accessories text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BOYS_SPORTS)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BOYS_SPORTS),"Could not find girls sports text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.BACK_BUTTON)));
		backButton.click();
		
		//fashionCell3.swipe(SwipeElementDirection.UP,5);
		test.log(LogStatus.INFO, "Click on baby link");
		fashionCell6.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BABY_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BABY_TEXT),"Could not find baby text");
		fashionBabytext.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BABY_CLOTHING)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BABY_CLOTHING),"Could not find girls clothing text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BABY_CLOTHING1)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BABY_CLOTHING1),"Could not find boys clothing text");
		fashionBabyClothing1.swipe(SwipeElementDirection.UP,5);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BABY_FOOTWEAR)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BABY_FOOTWEAR),"Could not find girls footwear text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.FASHION_BABY_FOOTWEAR1)));
		Assert.assertTrue(isElementPresent(IConstants.FASHION_BABY_FOOTWEAR1),"Could not find boys footwear text");
		
	}

}
