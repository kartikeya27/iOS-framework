package com.noon.iosapp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.LogStatus;


public class SplashScreenTest extends BaseTest {

	String testName="SplashScreenTest";
	
	@Test
	public void SplashScreen() throws InterruptedException {
			test = rep.startTest(testName);
			test.log(LogStatus.INFO, "Allow splash screen");
			
			launchIOSApp();
			test.log(LogStatus.INFO, "IOS App Launch successfully");
			try {
				iDriver.findElement(By.xpath(IConstants.SPLASH_SCREEN)).click();
			}catch (Exception e) {
				test.log(LogStatus.FAIL, "Splash screen window did not occur");
			}
	}
}