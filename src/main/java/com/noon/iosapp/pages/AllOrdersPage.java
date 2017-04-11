package com.noon.iosapp.pages;


import com.noon.iosapp.pages.base.BasePage;
import com.noon.iosapp.util.IConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AllOrdersPage extends BasePage {

    public AllOrdersPage(IOSDriver<IOSElement> iDriver, ExtentTest test) {
        super(iDriver, test);
    }

    WebDriverWait wait;

    public void allOrdersList() {
        try {
            wait = new WebDriverWait(iDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDER_ID)));
            Assert.assertTrue(isElementPresent(IConstants.ORDER_ID), "Could not find order ID");
            wait = new WebDriverWait(iDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDER_EXPECTED_DATE)));
            Assert.assertTrue(isElementPresent(IConstants.ORDER_EXPECTED_DATE), "Could not find expected delivery date");
            wait = new WebDriverWait(iDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDER_DATE)));
            Assert.assertTrue(isElementPresent(IConstants.ORDER_DATE), "Could not find order date");
            wait = new WebDriverWait(iDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDER_TOTAL_SHIPMENT)));
            Assert.assertTrue(isElementPresent(IConstants.ORDER_TOTAL_SHIPMENT), "Could not find order total shipments");
            wait = new WebDriverWait(iDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDER_TOTAL_ITEMS)));
            Assert.assertTrue(isElementPresent(IConstants.ORDER_TOTAL_ITEMS), "Could not find order total items");
            wait = new WebDriverWait(iDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IConstants.ORDER_TOTAL_VALUE)));
            Assert.assertTrue(isElementPresent(IConstants.ORDER_EXPECTED_DATE), "Could not find order total value");
        }catch (Exception e) {
            test.log(LogStatus.FAIL, "Could not find element");
        }
    }
}
