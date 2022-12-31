package ua.hillel.tests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverHolder {
    private static DriverHolder instance;
    private WebDriver driver;

    private DriverHolder() {
    }

    public static DriverHolder getInstance() {
        if (instance == null) {
            instance = new DriverHolder();
        }
        return instance;
    }

    public static WebDriver getDriver() {
        return getInstance().driver;
    }
    public static void setDriver (WebDriver driver){
        getInstance().driver = driver;
    }
}
