package com.smart_bear_order_process.utilities;

public class BrowserSleep {
    public static void until(int duration){
        try {
            Thread.sleep(duration * 1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
