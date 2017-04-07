package com.noon.iosapp.pages.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.noon.iosapp.pages.TopMenuPage;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {

	public IOSDriver<IOSElement> iDriver;
	public ExtentTest test;
	public TopMenuPage menu;
	int level=0;
	
	public BasePage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
		menu = new TopMenuPage(iDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver), menu);
		this.iDriver = iDriver;
		this.test = test;
		
	}
	
	public TopMenuPage getMenu() {
		return menu;
	}
	
	public Boolean isElementPresent(String locator) {
		test.log(LogStatus.INFO, "Finding presence of element"+locator);
		int s = iDriver.findElements(By.xpath(locator)).size();
		if(s==0)
			return false;
		else
			return true;
	}
	
	public Boolean verifyText(String locator,String expectedText) {
		test.log(LogStatus.INFO, "Finding presence of element"+locator);
		return false;
	}
	
	/********************reporting function********************/
	public void reportPass(String passMsg) {
		test.log(LogStatus.PASS, passMsg);
	}
	
	public void reportFail(String failMsg) {
		takeScreenShot();
		test.log(LogStatus.FAIL, failMsg);
		Assert.fail(failMsg);
	}
	
	public void takeScreenShot(){
		//decide the file name 
		Date d = new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ","_")+".png";
		String path=IConstants.SCREENSHOT_PATH+screenshotFile;
		//take screenshot
		File scrFile = ((TakesScreenshot)iDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Add screenshot to report
		test.log(LogStatus.INFO,"Snapshot below: ("+screenshotFile+")"+
				 test.addScreenCapture(path));
	}
	
	//click
	public void click(String xpathKey) {
		try {
		test.log(LogStatus.INFO, "Click on element"+xpathKey);	
		iDriver.findElement(By.xpath((xpathKey))).click();
		}catch(Exception e) {
			//report an error 
			//e.printStackTrace();
		}
	}	
}
