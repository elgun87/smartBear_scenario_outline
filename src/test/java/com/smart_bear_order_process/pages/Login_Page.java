package com.smart_bear_order_process.pages;

import com.smart_bear_order_process.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "ctl00_MainContent_username")
    WebElement username_input;

    @FindBy(id = "ctl00_MainContent_password")
    WebElement password_input;

    @FindBy(id = "ctl00_MainContent_login_button")
    WebElement login_btn;

    public void type_username(String username){
        username_input.sendKeys(username);
    }

    public void type_password(String pasw){
        password_input.sendKeys(pasw);
    }

    public void click_login_btn(){
        login_btn.click();
    }

}
