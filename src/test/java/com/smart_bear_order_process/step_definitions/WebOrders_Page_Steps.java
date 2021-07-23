package com.smart_bear_order_process.step_definitions;

import com.smart_bear_order_process.utilities.BrowserSleep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebOrders_Page_Steps extends BaseClass{
    @When("user click on {string} page")
    public void user_click_on_order_page(String page) {
        webOrders_page.click_on_page(page);
    }

    @And("user select {string} from product dropdown")
    public void user_select_product(String product) {
        webOrders_page.select_product(product);
        BrowserSleep.until(1);
    }

    @When("user enters {string} quantity")
    public void user_enters_quantity(String quantity) {
        webOrders_page.enter_quantity(quantity);
        BrowserSleep.until(1);
    }

    @When("user enters {string} as customer name")
    public void user_enters_as_customer_name(String name) {
        webOrders_page.type_customer_name(name);
        BrowserSleep.until(1);
    }

    @When("user enters {string} as street")
    public void user_enters_as_street(String street) {
        webOrders_page.enter_street_adress(street);
        BrowserSleep.until(1);
    }

    @When("user enters {string} as city")
    public void user_enters_as_city(String city) {
        webOrders_page.enter_city_name(city);
        BrowserSleep.until(1);
    }

    @When("user enters {string} as state")
    public void user_enters_as_state(String state) {
        webOrders_page.enter_state(state);
        BrowserSleep.until(1);
    }

    @When("user enters {string} as zip code")
    public void user_enters_as_zip_code(String zipcode) {
        webOrders_page.enter_zipcode(zipcode);
        BrowserSleep.until(1);
    }

    @When("user select {string} as card type")
    public void user_select_as_card_type(String cardType) {
        webOrders_page.select_card_type(cardType);
        BrowserSleep.until(1);
    }

    @Then("user enters {string} as card number")
    public void user_enters_as_card_number(String cardNumber) {
        webOrders_page.enter_card_number(cardNumber);
        BrowserSleep.until(1);
    }

    @Then("user enters {string} as expiration date")
    public void user_enters_as_expiration_date(String expirationDate) {
        webOrders_page.enter_expiration_dat(expirationDate);
        BrowserSleep.until(1);
    }

    @Then("user clicks proccess button")
    public void user_clicks_proccess_button() {
        webOrders_page.click_on_proccess_button();
        BrowserSleep.until(1);
    }

    @Then("user verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String customerName) {
        boolean flag = webOrders_page.verify_customer_name_in_the_list(customerName);
        Assert.assertTrue("Customer name not in the list",flag);
    }

}
