package com.smart_bear_order_process.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;



public class DriverWait {
    static WebDriverWait wait;
    public static void elementVisibility(WebDriver driver, WebElement element){
        wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
