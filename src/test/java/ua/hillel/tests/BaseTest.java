package ua.hillel.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
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
