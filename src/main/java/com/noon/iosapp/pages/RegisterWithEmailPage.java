package com.noon.iosapp.pages;



import org.apache.commons.lang3.ArrayUtils;
import java.sql.Timestamp;


import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.noon.iosapp.pages.base.BasePage;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import services.OTPExtractionService;

public class RegisterWithEmailPage extends BasePage  {

	public RegisterWithEmailPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		super(iDriver, test);
	}
	
	WebDriverWait wait = new WebDriverWait(iDriver, 10);
	
	@FindBy(xpath=IConstants.SIGNIN_BUTTON)
	public IOSElement signinButton;
	
	@FindBy(xpath=IConstants.REGISTER_TAB)
	public IOSElement registerTab;
	
	@FindBy(xpath=IConstants.REGISTER_USE_EMAIL)
	public IOSElement registerUseEmail;
	
	@FindBy(xpath=IConstants.REGISTER_USER_NAME)
	public IOSElement registerUserName;
	
	@FindBy(xpath=IConstants.REGISTER_USER_PHONE)
	public IOSElement registerUserPhone;
	
	@FindBy(xpath=IConstants.REGISTER_USER_EMAIL1)
	public IOSElement registerUserEmail1;
	
	@FindBy(xpath=IConstants.REGISTER_USER_PASSWORD)
	public IOSElement registerUserPassword;
	
	@FindBy(xpath=IConstants.REGISTER_BUTTON)
	public IOSElement registerButton;
	
	@FindBy(xpath=IConstants.OTP_CODE_1)
	public IOSElement otpCode1;
	
	@FindBy(xpath=IConstants.OTP_CODE_2)
	public IOSElement otpCode2;
	
	@FindBy(xpath=IConstants.OTP_CODE_3)
	public IOSElement otpCode3;
	
	@FindBy(xpath=IConstants.OTP_CODE_4)
	public IOSElement otpCode4;
	
	public void registerWithEmail(String userName, String userPassword) {
	try {
		//public void registerWithEmail() {
		test.log(LogStatus.INFO, "Click on home page signin button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.SIGNIN_BUTTON)));
		signinButton.click();
		test.log(LogStatus.INFO, "Click on register tab");
		if (!iDriver.findElement(By.xpath(IConstants.REGISTER_WITH)).isDisplayed()) {
			registerTab.click();
		}
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_WITH)));
		Assert.assertTrue(isElementPresent(IConstants.REGISTER_WITH), "Could not find register with text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_GOOGLE_BUTTON)));
		Assert.assertTrue(isElementPresent(IConstants.REGISTER_GOOGLE_BUTTON), "Could not find registration google button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_FACEBOOK_BUTTON)));
		Assert.assertTrue(isElementPresent(IConstants.REGISTER_FACEBOOK_BUTTON), "Could not register facebook button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_TWITTER_BUTTON)));
		Assert.assertTrue(isElementPresent(IConstants.REGISTER_TWITTER_BUTTON), "Could not register twitter button");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_WITH_DETAILS)));
		Assert.assertTrue(isElementPresent(IConstants.REGISTER_WITH_DETAILS), "Could not find register details text");
		test.log(LogStatus.INFO, "Register with email");

		//test service for email using time-stamp
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String timestampedEmail = "noonnoontest+" + String.valueOf(timestamp.getTime()) + "@gmail.com";

		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_USER_NAME)));
		registerUserName.sendKeys(userName);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_USER_PHONE)));
		registerUserPhone.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_USE_EMAIL)));
		registerUseEmail.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_USER_EMAIL1)));
		registerUserEmail1.click();
		registerUserEmail1.sendKeys(timestampedEmail);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_USER_PASSWORD)));
		registerUserPassword.click();
		registerUserPassword.sendKeys(userPassword);
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.REGISTER_BUTTON)));
		registerButton.click();
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.VERIFICATION_EMAIL)));
		Assert.assertTrue(isElementPresent(IConstants.VERIFICATION_EMAIL), "Could not find verification email text");
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.DIGIT_TEXT)));
		Assert.assertTrue(isElementPresent(IConstants.DIGIT_TEXT), "Could not find 4-digit code text");

		//test service for OPT code
		OTPExtractionService otpCode = new OTPExtractionService();
		String verificationCode = otpCode.getVerificationCodeRegistration();


		char[] otpCharArray = verificationCode.toCharArray();
		//Character[] charObjectArray = Array.toObject(otpCharArray);
		Character[] charObjectArray = ArrayUtils.toObject(otpCharArray);

		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.OTP_CODE_1)));
		otpCode1.sendKeys(charObjectArray[0].toString());
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.OTP_CODE_2)));
		otpCode2.sendKeys(charObjectArray[1].toString());
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.OTP_CODE_3)));
		otpCode3.sendKeys(charObjectArray[2].toString());
		wait = new WebDriverWait(iDriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.OTP_CODE_4)));
		otpCode4.sendKeys(charObjectArray[3].toString());
	}catch (Exception e) {
		test.log(LogStatus.ERROR, "Could not find element");
	}
   }
}

