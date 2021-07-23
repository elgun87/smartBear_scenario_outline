package com.smart_bear_order_process.pages;

import com.smart_bear_order_process.utilities.BrowserSleep;
import com.smart_bear_order_process.utilities.Driver;
import com.smart_bear_order_process.utilities.DriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class WebOrders_Page {
    public WebOrders_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "tbody select")
    WebElement product_select;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity_box;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    WebElement customer_name;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    WebElement street_input;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city_input;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state_input;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zip_code_input;

    @FindBy(css = "table#ctl00_MainContent_fmwOrder_cardList tbody td input")
    List<WebElement> radio_button;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    WebElement card_number_input;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expire_date_input;

    @FindBy(css = "a#ctl00_MainContent_fmwOrder_InsertButton")
    WebElement process_button;

    @FindBy(css = "table#ctl00_MainContent_orderGrid tbody tr")
    List<WebElement> all_customers;


    public void click_on_page(String page){
        Driver.getDriver().findElement(By.xpath("//a[contains(text(),'"+page+"')]")).click();
    }

    public void select_product(String product){
        DriverWait.elementVisibility(Driver.getDriver(),product_select);
        Select select = new Select(product_select);
        select.selectByValue(product);
        System.out.println(select.getFirstSelectedOption().getText());
    }

    public void enter_quantity(String quantity){
        quantity_box.sendKeys(quantity);
    }

    public void type_customer_name(String name){
        customer_name.sendKeys(name);
    }
    public void enter_street_adress(String city){
        street_input.sendKeys(city);
    }
    public void enter_state(String state){
        state_input.sendKeys(state);
    }
    public void enter_zipcode(String zipcode){
        zip_code_input.sendKeys(zipcode);
    }

    public void select_card_type(String card_type){
        for(int i = 0; i < radio_button.size();i++){
            if(radio_button.get(i).getAttribute("value").equals(card_type)){
                radio_button.get(i).click();
                break;
            }
        }
    }

    public void enter_card_number(String card_number){
        card_number_input.sendKeys(card_number);
    }

    public void enter_expiration_dat(String date){
        expire_date_input.sendKeys(date);
    }
    public void click_on_proccess_button(){
        process_button.click();
    }

    public void enter_city_name(String city){
        city_input.sendKeys(city);
    }

    public boolean verify_customer_name_in_the_list(String name){
        for(int i = 1;i < all_customers.size();i++){

            if(all_customers.get(i).findElement(By.cssSelector(" :nth-child(2)")).getText().equals(name)){
                return true;
            }
        }
        return false;
    }
}
