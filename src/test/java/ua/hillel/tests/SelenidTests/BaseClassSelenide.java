package ua.hillel.tests.SelenidTests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.hillel.tests.utils.DriverHolder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BaseClassSelenide {
    @BeforeClass
    public void SetUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.browser = "firefox";
        Configuration.savePageSource = false;
        Configuration.holdBrowserOpen = false;
        Configuration.downloadsFolder = "target/download/";
        Configuration.timeout = 10000;
        Configuration.browserSize = "1500x800";


    }

}
