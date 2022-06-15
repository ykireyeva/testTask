package core;

import org.openqa.selenium.WebDriver;

abstract public class BaseSeleniumPage {
    public static WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }
}
