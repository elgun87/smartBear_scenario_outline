package com.smart_bear_order_process.step_definitions;

import com.smart_bear_order_process.utilities.BrowserSleep;
import com.smart_bear_order_process.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookes {
    @Before
    public void setDriver(){
        Driver.getDriver();
    }
    @After
    public void tearDown(){
        BrowserSleep.until(2);
        Driver.closeDriver();
    }


}
