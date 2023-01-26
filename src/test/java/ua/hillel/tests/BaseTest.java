package ua.hillel.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import ua.hillel.tests.listeners.CustomExtentReportListener;

@Listeners(CustomExtentReportListener.class)

public class BaseTest {
    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/Extent.Html");
    }

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void Preparation() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void endWork() {
        driver.close();
    }


}
