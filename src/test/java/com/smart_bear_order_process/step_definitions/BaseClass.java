package com.smart_bear_order_process.step_definitions;

import com.smart_bear_order_process.pages.Login_Page;
import com.smart_bear_order_process.pages.WebOrders_Page;

public abstract class BaseClass {
    Login_Page loginPage = new Login_Page();
    WebOrders_Page webOrders_page = new WebOrders_Page();
}
