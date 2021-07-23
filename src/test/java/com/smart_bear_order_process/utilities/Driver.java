package com.smart_bear_order_process.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;
     public static WebDriver getDriver(){
         if(driver == null){
             String browser = ConfigurationReader.getProperty("browser");
             switch (browser){
                 case "chrome":
                     driver = new ChromeDriver();
                     System.setProperty("webdriver.driver.chromedriver","C:\\Users\\elgun\\IdeaProjects\\smart_bear_cucumber\\chromedriver.exe");
                     driver.manage().window().maximize();
                     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
             }
         }
         return driver;
     }
     public static void closeDriver(){
         if(driver != null){
             driver.close();
             driver = null;
         }
     }
}
