package com.smart_bear_order_process.step_definitions;

import com.smart_bear_order_process.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Page_Steps extends BaseClass{
    @Given("user open url {string}")
    public void user_open_url(String url) {
        Driver.getDriver().get(url);
    }
    @When("user enters username as {string} to username box")
    public void user_enters_username_as_to_username_box(String username) {
        loginPage.type_username(username);
    }
    @When("user enter password as {string} to password box")
    public void user_enter_password_as_to_password_box(String pasw) {
        loginPage.type_password(pasw);
    }
    @When("user click on log in button")
    public void user_click_on_log_in_button() {
        loginPage.click_login_btn();
    }
    @Then("user can view user dashboard")
    public void user_can_view_user_dashboard() {

    }
}
