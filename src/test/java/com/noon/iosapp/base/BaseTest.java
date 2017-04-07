package com.noon.iosapp.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import com.noon.iosapp.util.ExtentManager;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	public WebDriver driver;
	public IOSDriver<IOSElement> iDriver;
	public ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test;
	
	DesiredCapabilities caps = new DesiredCapabilities();

	@FindBy(xpath=IConstants.SPLASH_SCREEN)
	public IOSElement splashScreen;

	@SuppressWarnings("unchecked")


	public void launchIOSApp() throws InterruptedException {
		File app = new File(IConstants.IPA_PATH);
		//
		
		//Simulator settings on local system
		//DesiredCapabilities caps = new DesiredCapabilities();
		//DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability(MobileCapabilityType.APPIUM_VERSION, IConstants.APPIUM_VERSION);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, IConstants.PLATFORM_NAME);
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, IConstants.PLATFORM_VERSION);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, IConstants.DEVICE_NAME);
		caps.setCapability(HideKeyboardStrategy.PRESS_KEY,true);
		//caps.setCapability(MobileCapabilityType.UDID, IConstants.UDID);
		//caps.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, IConstants.LAUNCH_TIMEOUT);
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, IConstants.AUTOMATION_NAME);
		//caps.setCapability(MobileCapabilityType.NO_RESET,true);
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		try {
			test.log(LogStatus.INFO, "Launching iOS app");
			driver = new IOSDriver<IOSElement>(new URL(IConstants.HUB_URL),caps);
			iDriver = (IOSDriver<IOSElement>)driver;
		} catch (MalformedURLException e) {
			test.log(LogStatus.FAIL, "Application did not launch" + e.getMessage());
			e.printStackTrace();
			Assert.fail("Application did not launch"+ e.getMessage());
		}
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//allowScreen();
	}

	public void allowScreen() {
		if(!iDriver.findElement(By.xpath(IConstants.SPLASH_SCREEN)).isDisplayed()); {
			splashScreen.click();
		}
	}

	@AfterMethod
	public void quit() {
        if(rep != null) {
            rep.endTest(test);
            rep.flush();
        }
        if(driver != null) {
            driver.quit();
        }
    }
}
