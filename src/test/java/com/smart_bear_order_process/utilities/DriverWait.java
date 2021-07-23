package com.smart_bear_order_process.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWait {
    static WebDriverWait wait;
    public static void elementVisibility(WebDriver driver, WebElement element){
        wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
