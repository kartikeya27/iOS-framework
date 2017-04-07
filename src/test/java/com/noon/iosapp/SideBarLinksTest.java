package com.noon.iosapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.iosapp.base.BaseTest;
import com.noon.iosapp.pages.SideBarLinksPage;
import com.noon.iosapp.pages.TopMenuPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SideBarLinksTest extends BaseTest {
	
String testName="SideBarLinksTest";
	
	@Test
	public void sideBarLinks() throws InterruptedException 
	{
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Check all sidebar links");
		launchIOSApp();
		test.log(LogStatus.INFO, "IOS App Launch successfully");
		
		TopMenuPage topMenu = new TopMenuPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),topMenu);
		
		SideBarLinksPage sideBarLinksPage = new SideBarLinksPage(iDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(iDriver),sideBarLinksPage);
		
		topMenu.gotoMenu();
		sideBarLinksPage.sideBarLinks();
		
	}
}
